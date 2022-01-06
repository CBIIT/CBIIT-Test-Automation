FROM quay.io/centos/centos:stream8

RUN dnf -y update \
    && dnf -y install \
    dnf-plugins-core \
    glibc-langpack-en \
    && dnf -y install \
    openssl-devel \
    libcurl-devel \
    libxml2-devel \
    git \
    rsync \
    wget \
    bzip2 \
    mesa-libGL \
    mesa-libGL-devel \
    mesa-libEGL \
    mesa-libEGL-devel \
    && dnf clean all

RUN mkdir -p /deploy/cbiit-test-automation /deploy/cbiit-test-automation/logs

WORKDIR /deploy/cbiit-test-automation

# Install java 11 corretto

RUN curl -L -k -o /tmp/amazon-corretto-11-x64-linux-jdk.rpm https://corretto.aws/downloads/latest/amazon-corretto-11-x64-linux-jdk.rpm

RUN dnf -y install /tmp/amazon-corretto-11-x64-linux-jdk.rpm 

ENV JAVA_HOME=/usr/lib/jvm/jre

# Install maven
RUN curl -L -k -o /tmp/apache-maven-3.8.4-bin.tar.gz https://dlcdn.apache.org/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.tar.gz

RUN tar xf /tmp/apache-maven-3.8.4-bin.tar.gz -C /usr/

RUN ln -s /usr/apache-maven-3.8.4 /usr/maven

RUN rm -f /tmp/apache-maven-3.8.4-bin.tar.gz

ENV M2_HOME=/usr/maven

ENV MAVEN_HOME=/usr/maven

RUN ln -s /usr/maven/bin/* /usr/bin


# Install google-chrome
RUN curl -L -k -o /tmp/google-chrome-stable_current_x86_64.rpm https://dl.google.com/linux/direct/google-chrome-stable_current_x86_64.rpm 

RUN dnf -y install /tmp/google-chrome-stable_current_x86_64.rpm 

RUN rm -f /tmp/google-chrome-stable_current_x86_64.rpm

# Install firefox
RUN curl -L -k -o /tmp/firefox-95.0.tar.bz2 http://ftp.mozilla.org/pub/firefox/releases/95.0/linux-x86_64/en-US/firefox-95.0.tar.bz2 

RUN tar xjf /tmp/firefox-95.0.tar.bz2 -C /tmp/ \
    && mv /tmp/firefox/ /usr/ \
    && ln -s /usr/firefox/firefox /usr/bin/firefox

RUN rm -f /tmp/firefox-95.0.tar.bz2

# Copy app
COPY . /deploy/cbiit-test-automation/

# Run mvn install (only dependencies, do not build or run tests)
RUN mvn clean dependency:go-offline -DskipTests