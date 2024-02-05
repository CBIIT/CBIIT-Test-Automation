#!/bin/bash
cd /tmp
DATE=$(TZ=America/New_York date "+%Y-%m-%d-%H-%M-%S")
logs_file="security-agents-testing-$DATE.log"
logs_file_path="/tmp/security-agents-testing-$DATE.log"
data_saved_file="data-$DATE.txt"
data_saved_path="/tmp/data-$DATE.txt"
failed_saved_file="fdata-$DATE.txt"
failed_saved_path="/tmp/fdata-$DATE.txt"
alias space='echo "">> $data_saved_path'
alias spacef='echo "">> $failed_saved_path'
TP=0
TNP=0
TNT=0
touch $data_saved_file
touch $failed_saved_file
touch $logs_file
#**************** Kernel Testig ************************
kernel_version="$(uname -r)"
if [[ $kernel_version =~ "6.1.61-85.141" ]]; then
    echo "Kernel Testing that PASS">> $data_saved_path
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "uname -r">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "6.1.61-85.141">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$kernel_version">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "Kernel Testing that FAIL">> $failed_saved_path
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "uname -r">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "6.1.61-85.141">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$kernel_version">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#**************** Centrify Testig ************************
centrify_version="$(adinfo --version)"
a=0
af=0
if [[ $centrify_version =~ "adinfo (CentrifyDC 6.0.0-151)" ]]; then
    echo "*******************************************************************">> $data_saved_path
    echo "Centrify Testing that PASS">> $data_saved_path
    echo "-------------------------------------------------------------------">> $data_saved_path
    a=$(($a + 1))
    echo "Command:">> $data_saved_path
    echo "adinfo --version">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "CentrifyDC 6.0.0-151">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$centrify_version">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "*******************************************************************">> $failed_saved_path
    echo "Centrify Testing that FAIL">> $failed_saved_path
    echo "-------------------------------------------------------------------">> $failed_saved_path
    af=$(($af + 1))
    echo "Command:">> $failed_saved_path
    echo "adinfo --version">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "CentrifyDC 6.0.0-151">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$centrify_version">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
centrify_status="$(sudo systemctl status centrifydc)"
if [[ $centrify_status =~ "centrifydc.service; enabled;" ]]; then
  if [[ $a == 0 ]]; then
        echo "*******************************************************************">> $data_saved_path
        echo "Centrify Testing that PASS">> $data_saved_path
        a=$(($a + 1))
  fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo systemctl status centrifydc">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "centrifydc.service; enabled;">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$centrify_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $af == 0 ]]; then
          echo "*******************************************************************">> $failed_saved_path
          echo "Centrify Testing that FAIL">> $failed_saved_path
          af=$(($af + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo systemctl status centrifydc">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "centrifydc.service; enabled;">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$centrify_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#**************** Nessus Testig ************************
nessus_version="$(rpm -qa | grep NessusAgent)"
b=0
bf=0
if [[ $nessus_version =~ "NessusAgent-10.5.0-amzn2.x86_64" ]]; then
    echo "*******************************************************************">> $data_saved_path
    echo "Nessus Testing that PASS">> $data_saved_path
    echo "-------------------------------------------------------------------">> $data_saved_path
    b=$(($b + 1))
    echo "Command:">> $data_saved_path
    echo "rpm -qa | grep NessusAgent">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "NessusAgent-10.5.0-amzn2.x86_64">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$nessus_version">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "*******************************************************************">> $failed_saved_path
    echo "Nessus Testing that FAIL">> $failed_saved_path
    echo "-------------------------------------------------------------------">> $failed_saved_path
    bf=$(($bf + 1))
    echo "Command:">> $failed_saved_path
    echo "rpm -qa | grep NessusAgent">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "NessusAgent-10.5.0-amzn2.x86_64">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$nessus_version">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
nessus_service_status="$(sudo systemctl status nessusagent.service)"
if [[ $nessus_service_status =~ "Active: active (running)" ]]; then
    if [[ $b == 0 ]]; then
          echo "*******************************************************************">> $data_saved_path
          echo "Nessus Testing that PASS">> $data_saved_path
          b=$(($b + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo systemctl status nessusagent.service">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Active: active (running)">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$nessus_service_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $bf == 0 ]]; then
            echo "*******************************************************************">> $failed_saved_path
            echo "Nessus Testing that FAIL">> $failed_saved_path
            bf=$(($bf + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo systemctl status nessusagent.service">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Active: active (running)">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$nessus_service_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
nessus_status="$(sudo /opt/nessus_agent/sbin/nessuscli agent status)"
if [[ $nessus_status =~ "Running: Yes" ]]; then
    if [[ $b == 0 ]]; then
            echo "*******************************************************************">> $data_saved_path
            echo "Nessus Testing that PASS">> $data_saved_path
            b=$(($b + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo /opt/nessus_agent/sbin/nessuscli agent status">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Running: Yes">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$nessus_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $bf == 0 ]]; then
            echo "*******************************************************************">> $failed_saved_path
            echo "Nessus Testing that FAIL">> $failed_saved_path
            bf=$(($bf + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo /opt/nessus_agent/sbin/nessuscli agent status">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Running: Yes">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$nessus_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
DATERESTART=$(TZ=America/New_York date "+%a %Y-%m-%d")
sudo systemctl restart nessusagent
sleep 3
nessus_status="$(sudo /bin/systemctl status nessusagent.service)"
if [[ $nessus_status =~ "     Active: active (running) since $DATERESTART" ]]; then
    if [[ $b == 0 ]]; then
            echo "*******************************************************************">> $data_saved_path
            echo "Nessus Testing that PASS">> $data_saved_path
            b=$(($b + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo systemctl restart nessusagent | /bin/systemctl status nessusagent.service">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Active:active (running) since $DATERESTART">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$nessus_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $bf == 0 ]]; then
            echo "*******************************************************************">> $failed_saved_path
            echo "Nessus Testing that FAIL">> $failed_saved_path
            bf=$(($bf + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo systemctl restart nessusagent | /bin/systemctl status nessusagent.service">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Active:active (running) since $DATERESTART">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$nessus_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#**************** FireEye Testig ************************
c=0
cf=0
fireeye_version="$(rpm -qa | grep xagt)"
if [[ $fireeye_version =~ "xagt-35.31.25-1.el7.x86_64" ]]; then
    echo "*******************************************************************">> $data_saved_path
    echo "FireEye Testing that PASS">> $data_saved_path
    echo "-------------------------------------------------------------------">> $data_saved_path
    c=$(($c + 1))
    echo "Command:">> $data_saved_path
    echo "rpm -qa | grep xagt">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "xagt-35.31.25-1.el7.x86_64">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$fireeye_version">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "*******************************************************************">> $failed_saved_path
    echo "FireEye Testing that FAIL">> $failed_saved_path
    echo "-------------------------------------------------------------------">> $failed_saved_path
    cf=$(($cf + 1))
    echo "Command:">> $failed_saved_path
    echo "rpm -qa | grep xagt">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "xagt-35.31.25-1.el7.x86_64">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$fireeye_version">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
fireye_service_status="$(sudo service xagt status)"
if [[ $fireye_service_status =~ "Active: active (running)" ]]; then
    if [[ $c == 0 ]]; then
              echo "*******************************************************************">> $data_saved_path
              echo "FireEye Testing that PASS">> $data_saved_path
              c=$(($c + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo service xagt status">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Active: active (running)">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$fireye_service_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $cf == 0 ]]; then
                echo "*******************************************************************">> $failed_saved_path
                echo "FireEye Testing that FAIL">> $failed_saved_path
                cf=$(($cf + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo service xagt status">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Active: active (running)">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$fireye_service_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
DATERESTARTFIREEYE=$(TZ=America/New_York date "+%a %Y-%m-%d")
sudo service xagt restart
sleep 6
fireye_status="$(sudo service xagt status)"
if [[ $fireye_status =~ "     Active: active (running) since $DATERESTARTFIREEYE" ]]; then
    if [[ $c == 0 ]]; then
                echo "*******************************************************************">> $data_saved_path
                echo "FireEye Testing that PASS">> $data_saved_path
                c=$(($c + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo service xagt restart | sudo service xagt status">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Active:active (running) since $DATERESTARTFIREEYE">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$fireye_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $cf == 0 ]]; then
                  echo "*******************************************************************">> $failed_saved_path
                  echo "FireEye Testing that FAIL">> $failed_saved_path
                  cf=$(($cf + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo service xagt restart | sudo service xagt status">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Active:active (running) since $DATERESTARTFIREEYE">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$fireye_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#**************** Cylance Testig ************************
d=0
df=0
cylance_version="$(rpm -qa | grep Cylance)"
if [[ $cylance_version =~ "CylancePROTECT-3.2.1000-5322.x86_64" ]]; then
    echo "*******************************************************************">> $data_saved_path
    echo "Cylance Testing that PASS">> $data_saved_path
    echo "-------------------------------------------------------------------">> $data_saved_path
    d=$(($d + 1))
    echo "Command:">> $data_saved_path
    echo "rpm -qa | grep Cylance">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "CylancePROTECT-3.2.1000-5322.x86_64">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$cylance_version">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "*******************************************************************">> $failed_saved_path
    echo "Cylance Testing that FAIL">> $failed_saved_path
    echo "-------------------------------------------------------------------">> $failed_saved_path
    df=$(($df + 1))
    echo "Command:">> $failed_saved_path
    echo "rpm -qa | grep Cylance">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "CylancePROTECT-3.2.1000-5322.x86_64">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$cylance_version">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
cylance_status="$(sudo /opt/cylance/desktop/cylance -s)"
if [[ $cylance_status =~ "Registration Status: Registred" ]]; then
    if [[ $d == 0 ]]; then
                  echo "*******************************************************************">> $data_saved_path
                  echo "Cylence Testing that PASS">> $data_saved_path
                  d=$(($d + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo /opt/cylance/desktop/cylance -s">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Registration Status: Registred">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$cylance_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $df == 0 ]]; then
                    echo "*******************************************************************">> $failed_saved_path
                    echo "Cylence Testing that FAIL">> $failed_saved_path
                    df=$(($df + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo /opt/cylance/desktop/cylance -s">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Registration Status: Registred">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$cylance_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#**************** Splunk Universal Forwarder Testig ************************
e=0
ef=0
splunk_version="$(rpm -qa | grep splunkforwarder)"
if [[ $splunk_version =~ "splunkforwarder-9.0.1-82c987350fde.x86_64" ]]; then
    echo "*******************************************************************">> $data_saved_path
    echo "Splunk Universal Forwarder Testing that PASS">> $data_saved_path
    echo "-------------------------------------------------------------------">> $data_saved_path
    e=$(($e + 1))
    echo "Command:">> $data_saved_path
    echo "rpm -qa | grep splunkforwarder">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "splunkforwarder-9.0.1-82c987350fde.x86_64">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$splunk_version">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "*******************************************************************">> $failed_saved_path
    echo "Splunk Universal Forwarder Testing that FAIL">> $failed_saved_path
    echo "-------------------------------------------------------------------">> $failed_saved_path
    ef=$(($ef + 1))
    echo "Command:">> $failed_saved_path
    echo "rpm -qa | grep splunkforwarder">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "splunkforwarder-9.0.1-82c987350fde.x86_64">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$splunk_version">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
splunk_service_status="$(sudo service splunk status)"
if [[ $splunk_service_status =~ "splunkd is running" ]] && [[ $splunk_service_status =~ "splunk helpers are running" ]]; then
    if [[ $e == 0 ]]; then
                    echo "*******************************************************************">> $data_saved_path
                    echo "Splunk Universal Forwarder Testing that PASS">> $data_saved_path
                    e=$(($e + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo service splunk status">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "splunkd is running">> $data_saved_path
    echo "splunk helpers are running">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$splunk_service_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $ef == 0 ]]; then
                    echo "*******************************************************************">> $failed_saved_path
                    echo "Splunk Universal Forwarder Testing that FAIL">> $failed_saved_path
                    ef=$(($ef + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo service splunk status">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "splunkd is running">> $failed_saved_path
    echo "splunk helpers are running">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$splunk_service_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
splunk_service_status="$(sudo systemctl status splunk)"
if [[ $splunk_service_status =~ "Active: active (running)" ]]; then
    if [[ $e == 0 ]]; then
                      echo "*******************************************************************">> $data_saved_path
                      echo "Splunk Universal Forwarder Testing that PASS">> $data_saved_path
                      e=$(($e + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo systemctl status splunk">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Active: active (running)">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$splunk_service_status">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $ef == 0 ]]; then
                      echo "*******************************************************************">> $failed_saved_path
                      echo "Splunk Universal Forwarder Testing that FAIL">> $failed_saved_path
                      ef=$(($ef + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo systemctl status splunk">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Active: active (running)">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$splunk_service_status">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
splunk_restart="$(sudo service splunk restart)"
if [[ $splunk_restart =~ "Restarting splunk (via systemctl):" ]]; then
    if [[ $e == 0 ]]; then
                        echo "*******************************************************************">> $data_saved_path
                        echo "Splunk Universal Forwarder Testing that PASS">> $data_saved_path
                        e=$(($e + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo service splunk restart">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Restarting splunk (via systemctl):">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$splunk_restart">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $ef == 0 ]]; then
                          echo "*******************************************************************">> $failed_saved_path
                          echo "Splunk Universal Forwarder Testing that FAIL">> $failed_saved_path
                          ef=$(($ef + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo service splunk restart">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Restarting splunk (via systemctl):">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$splunk_restart">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
splunk_functionality="$(sudo grep -m 10 128.231.196 /opt/splunkforwarder/var/log/splunk/splunkd.log)"
if [[ $splunk_functionality =~ "Connected to idx=128.231.196" ]]; then
    if [[ $e == 0 ]]; then
                          echo "*******************************************************************">> $data_saved_path
                          echo "Splunk Universal Forwarder Testing that PASS">> $data_saved_path
                          e=$(($e + 1))
    fi
    echo "-------------------------------------------------------------------">> $data_saved_path
    echo "Command:">> $data_saved_path
    echo "sudo grep -m 10 128.231.196 /opt/splunkforwarder/var/log/splunk/splunkd.log">> $data_saved_path
    space
    echo "Expected Output Contains:">> $data_saved_path
    echo "Connected to idx=128.231.196">> $data_saved_path
    space
    echo "Actual Output:">> $data_saved_path
    echo "$splunk_functionality">> $data_saved_path
    space
    echo "Test Results:">> $data_saved_path
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    if [[ $ef == 0 ]]; then
                          echo "*******************************************************************">> $failed_saved_path
                          echo "Splunk Universal Forwarder Testing that FAIL">> $failed_saved_path
                          ef=$(($ef + 1))
    fi
    echo "-------------------------------------------------------------------">> $failed_saved_path
    echo "Command:">> $failed_saved_path
    echo "sudo grep -m 10 128.231.196 /opt/splunkforwarder/var/log/splunk/splunkd.log">> $failed_saved_path
    spacef
    echo "Expected Output Contains:">> $failed_saved_path
    echo "Connected to idx=128.231.196">> $failed_saved_path
    spacef
    echo "Actual Output:">> $failed_saved_path
    echo "$splunk_functionality">> $failed_saved_path
    spacef
    echo "Test Results:">> $failed_saved_path
    echo "FAIL">> $failed_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#*********************************************************
echo "Testing Date:$(TZ=America/New_York date +"%F") Time:$(TZ=America/New_York date +"%T") EST">> $logs_file_path
echo "">> $logs_file_path
echo "*******************************************************************">> $logs_file_path
echo "SECURITY AGENTS TESTING">> $logs_file_path
echo "*******************************************************************">> $logs_file_path
echo "Total number of tests::$TNT">> $logs_file_path
echo "Tests PASS:$TP">> $logs_file_path
echo "Tests FAIL:$TNP">> $logs_file_path
echo "*******************************************************************">> $logs_file_path
cat $failed_saved_path>>$logs_file_path
cat $data_saved_path>>$logs_file_path
failed_validation="$(grep -Po '(?<=Tests FAIL:)[^ ]*' $logs_file_path)"
if [[ "$failed_validation" =~ "0"( |$) ]]; then
    echo "****************************************************************************">> $logs_file_path
    echo "Tests completed succesfuly!">> $logs_file_path
    echo "****************************************************************************">> $logs_file_path
    sudo aws s3 cp --region us-east-1 /tmp/$logs_file s3://al2023-imagebuilder-pipelin-imagebuilderlogbucket-250cykn40odr/
else
    echo "****************************************************************************">> $logs_file_path
    echo "Some tests have failed. Please check at the top of the log file for details.">> $logs_file_path
    echo "****************************************************************************">> $logs_file_path
    sudo aws s3 cp --region us-east-1 /tmp/$logs_file s3://al2023-imagebuilder-pipelin-imagebuilderlogbucket-250cykn40odr/
    exit 1
fi