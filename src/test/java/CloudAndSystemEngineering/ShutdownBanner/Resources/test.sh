#!/bin/bash
DATE=$(TZ=America/New_York date "+%Y-%m-%d-%H-%M-%S")
logs_file="security-agents-testing-$DATE.log"
logs_file_path="/tmp/security-agents-testing-$DATE.log"
data_saved_file="data-$DATE.txt"
data_saved_path="/tmp/data-$DATE.txt"
alias space='echo "">> $data_saved_path'
TP=0
TNP=0
TNT=0
touch $data_saved_file
touch $logs_file
#**************** Centrify Testig ************************
echo "Centrify Testing">> $data_saved_path
echo "-------------------------------------------------------------------">> $data_saved_path
centrify_version="$(adinfo --version)"
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
if [[ $centrify_version =~ "adinfo (CentrifyDC 6.0.0-151)" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
centrify_status="$(sudo systemctl status centrifydc)"
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
if [[ $centrify_status =~ "centrifydc.service; enabled;" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "*******************************************************************">> $data_saved_path
#**************** Nessus Testig ************************
echo "Nessus Testing">> $data_saved_path
echo "-------------------------------------------------------------------">> $data_saved_path
nessus_version="$(rpm -qa | grep NessusAgent)"
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
if [[ $nessus_version =~ "NessusAgent-10.5.0-amzn2.x86_64" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
nessus_service_status="$(sudo systemctl status nessusagent.service)"
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
if [[ $nessus_service_status =~ "Active: active (running)" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
nessus_status="$(sudo /opt/nessus_agent/sbin/nessuscli agent status)"
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
if [[ $nessus_status =~ "Running: Yes" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
DATERESTART=$(TZ=America/New_York date "+%a %Y-%m-%d")
sudo systemctl restart nessusagent
sleep 3
nessus_status="$(sudo /bin/systemctl status nessusagent.service)"
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
if [[ $nessus_status =~ "     Active: active (running) since $DATERESTART" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "*******************************************************************">> $data_saved_path
#**************** FireEye Testig ************************
echo "FireEye Testing">> $data_saved_path
echo "-------------------------------------------------------------------">> $data_saved_path
fireeye_version="$(rpm -qa | grep xagt)"
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
if [[ $fireeye_version =~ "xagt-35.31.25-1.el7.x86_64" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
fireye_service_status="$(sudo service xagt status)"
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
if [[ $fireye_service_status =~ "Active: active (running)" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
DATERESTARTFIREEYE=$(TZ=America/New_York date "+%a %Y-%m-%d")
sudo service xagt restart
sleep 3
fireye_status="$(sudo service xagt status)"
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
if [[ $fireye_status =~ "     Active: active (running) since $DATERESTARTFIREEYE" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "*******************************************************************">> $data_saved_path
#**************** Splunk Universal Forwarder Testig ************************
echo "Splunk Universal Forwarder Testing">> $data_saved_path
echo "-------------------------------------------------------------------">> $data_saved_path
splunk_version="$(rpm -qa | grep splunkforwarder)"
echo "Command:">> $data_saved_path
echo "splunkforwarder-9.0.1-82c987350fde.x86_64">> $data_saved_path
space
echo "Expected Output Contains:">> $data_saved_path
echo "xagt-35.31.25-1.el7.x86_64">> $data_saved_path
space
echo "Actual Output:">> $data_saved_path
echo "$splunk_version">> $data_saved_path
space
echo "Test Results:">> $data_saved_path
if [[ $splunk_version =~ "splunkforwarder-9.0.1-82c987350fde.x86_64" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
splunk_service_status="$(sudo service splunk status)"
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
if [[ $splunk_service_status =~ "splunkd is running" ]] && [[ $splunk_service_status =~ "splunk helpers are running" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
echo "-------------------------------------------------------------------">> $data_saved_path
splunk_service_status="$(sudo systemctl status splunk)"
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
if [[ $splunk_service_status =~ "Active: active (running)" ]]; then
    echo "PASS">> $data_saved_path
    TP=$(($TP + 1))
    TNT=$(($TNT + 1))
else
    echo "FAIL">> $data_saved_path
    TNP=$(($TNP + 1))
    TNT=$(($TNT + 1))
fi
#*********************************************************
echo "Testing Date:$(TZ=America/New_York date +"%F") Time:$(TZ=America/New_York date +"%T")">> $logs_file_path
echo "">> $logs_file_path
echo "*******************************************************************">> $logs_file_path
echo "SECURITY AGENTS TESTING">> $logs_file_path
echo "*******************************************************************">> $logs_file_path
echo "Total number of tests::$TNT">> $logs_file_path
echo "Tests PASS:$TP">> $logs_file_path
echo "Tests FAIL:$TNP">> $logs_file_path
echo "*******************************************************************">> $logs_file_path
cat $data_saved_path>>$logs_file_path
failed_validation="$(grep -Po '(?<=Tests FAIL:)[^ ]*' $logs_file_path)"
if [[ "$failed_validation" =~ "0"( |$) ]]; then
    echo "*******************************************************************">> $logs_file_path
    echo "Tests completed succesfuly!">> $logs_file_path
    echo "*******************************************************************">> $logs_file_path
    aws s3 cp /tmp/$logs_file s3://al2023-imagebuilder-pipeline-qa-testing-logs
else
    echo "*******************************************************************">> $logs_file_path
    echo "Some tests have failed. Please check above for details.">> $logs_file_path
    echo "*******************************************************************">> $logs_file_path
    aws s3 cp /tmp/$logs_file s3://al2023-imagebuilder-pipeline-qa-testing-logs
    exit 1
fi