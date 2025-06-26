from tracemalloc import stop
import boto3
import os
from datetime import datetime, timedelta, timezone
import datetime
import sys
sys.path.append('/Users/bucurgb/Desktop/STUFF/CLOUD PROJECTS CODE!!!/cbiit-test-automation-cloud')
from main.conf.local_env import local_env
from main.resources.constants.ec2_scheduler_constants import ec2_scheduler_constants
import pandas as pd

def collect_instance_tags():
    # Input the account number
    #account_number = input("Enter the account number: ")

    # Convert the account number to a string
    account_number = "936232839634"

    # Instantiate LocalEnv and retrieve credentials
    credentials = local_env.set_aws_credentials(account_number)

    # Set AWS credentials as environment variables
    os.environ['AWS_ACCESS_KEY_ID'] = credentials['AWS_ACCESS_KEY_ID']
    os.environ['AWS_SECRET_ACCESS_KEY'] = credentials['AWS_SECRET_ACCESS_KEY']
    os.environ['AWS_SESSION_TOKEN'] = credentials['AWS_SESSION_TOKEN']

    # Create a session using the environment variables
    session_main = boto3.Session(
        aws_access_key_id=os.getenv('AWS_ACCESS_KEY_ID'),
        aws_secret_access_key=os.getenv('AWS_SECRET_ACCESS_KEY'),
        aws_session_token=os.getenv('AWS_SESSION_TOKEN')
    )

    # Create an STS client from the session
    sts_client = session_main.client('sts')
    role_arn = f"arn:aws:iam::232672174030:role/EC2CloudTrailReadOnlyRole"

    assumed_role = sts_client.assume_role(
        RoleArn=role_arn,
        RoleSessionName="AssumeRoleSession"
    )
    credentials = assumed_role['Credentials']
    session = boto3.Session(
        aws_access_key_id=credentials['AccessKeyId'],
        aws_secret_access_key=credentials['SecretAccessKey'],
        aws_session_token=credentials['SessionToken']
    )

    # Create an STS client from the session
    sts = session.client('sts')

    # Retrieve AWS Account number
    AWS_ACCOUNT_ID = sts.get_caller_identity()["Account"]

    # Initialize a boto3 client with explicit AWS credentials and region
    ec2 = session.client(
        'ec2',
        region_name='us-east-1'  # Specify the AWS region
    )

    # Fetch all instances
    response = ec2.describe_instances()

    # Get total number of instances
    total_instances = sum(len(reservation['Instances']) for reservation in response['Reservations'])

    # Get current date and time
    current_datetime = datetime.datetime.now(datetime.timezone(datetime.timedelta(hours=-4))).strftime("%Y-%m-%d_%H-%M-%S")

    # Define the time range (7 AM to 7:05 AM)
    end_time = datetime.datetime.now(datetime.timezone(datetime.timedelta(hours=-4)))
    start_time = end_time - timedelta(hours=24)

    # Add total number of instances and current date to the list of tags
    all_tags = []
    all_tags.append("********************************************")
    all_tags.append(f"Current date: {current_datetime}")
    all_tags.append(f"AWS Account: {AWS_ACCOUNT_ID}")
    all_tags.append(f"Total number of EC2s in the AWS account: {total_instances}")
    all_tags.append("********************************************")
    all_tags.append("")

    # Print the added tags
    print("")
    print("********************************************")
    print(f"Current date: {current_datetime}")
    print(f"AWS Account: {AWS_ACCOUNT_ID}")
    print(f"Total number of EC2s in the AWS account: {total_instances}")
    print("********************************************")
    print("")

    # Fetch all instances
    response_two = ec2.describe_instances()

    # Iterate through reservations and instances to collect tags
    tags_pass = 0
    failed_tags = 0
    kms_list_of_instances = []
    for reservation in response_two['Reservations']:
        for instance in reservation['Instances']:
            failed_tags_instance = 0
            instance_tags = instance.get('Tags', [])
            instance_name = [tag['Value'] for tag in instance_tags if tag['Key'] == 'Name']
            if instance_name:
                all_tags.append("--------------------------------------------")
                all_tags.append(f"Instance Name: {instance_name[0]}")
                all_tags.append(f"Instance ID: {instance['InstanceId']}")
                print("--------------------------------------------")
                print(f"Instance Name: {instance_name[0]}")
                print(f"Instance ID: {instance['InstanceId']}")
            runtime_tag_count = 0
            runtime_tag_value = []
            patchschedule_tag_value = []
            patchschedule_tag_count = 0
            runtime_final_tag = 0
            patchschedule_final_tag = 0
            for tag in instance_tags:
                tag_key = tag['Key']
                tag_value = tag['Value']
                if tag_key == ('Runtime'):
                    if tag_value == 'OfficeHours-MF-07AM-07PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'OfficeHours-MF-07AM-10PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'OfficeHours-MF-09AM-05PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'OfficeHours-MF-09AM-07PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'Always_On_Prod' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'Always_On_NonProd' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'On_Demand_NonProd' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'CustomHours-MF-07AM-11:45PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'CustomHours-MS-10:45PM-11PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'CustomHours-MS-06:45PM-07PM' and runtime_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        runtime_tag_value.append(f"{tag_value}")
                        runtime_final_tag = f"{tag_value}"
                        runtime_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    else:
                        all_tags.append(f"{tag_key}:*{tag_value}* FAILED TAG")
                        runtime_final_tag = f"{tag_value}"
                        failed_tags += 1
                        failed_tags_instance += 1
                        print(f"{tag_key}:*{tag_value}* FAILED TAG")
            for tag in instance_tags:
                tag_key = tag['Key']
                tag_value = tag['Value']
                if tag_key == 'PatchSchedule':
                    if tag_value == 'Monthly_Group1' and patchschedule_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        patchschedule_tag_value.append(f"{tag_value}")
                        patchschedule_final_tag = f"{tag_value}"
                        patchschedule_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'Monthly_Group2' and patchschedule_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        patchschedule_tag_value.append(f"{tag_value}")
                        patchschedule_final_tag = f"{tag_value}"
                        patchschedule_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    elif tag_value == 'Always_On' and patchschedule_tag_count == 0:
                        all_tags.append(f"{tag_key}:*{tag_value}*")
                        patchschedule_tag_value.append(f"{tag_value}")
                        patchschedule_final_tag = f"{tag_value}"
                        patchschedule_tag_count += 1
                        print(f"{tag_key}:*{tag_value}*")
                    else:
                        all_tags.append(f"{tag_key}:*{tag_value}* FAILED TAG")
                        failed_tags += 1
                        failed_tags_instance += 1
                        patchschedule_final_tag = f"{tag_value}"
                        print(f"{tag_key}:*{tag_value}* FAILED TAG")
            if len(patchschedule_tag_value) == 1 and len(runtime_tag_value) == 1:
                if patchschedule_tag_value[0] == 'Monthly_Group1' and runtime_tag_value[0] == 'OfficeHours-MF-07AM-07PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group1' and runtime_tag_value[0] == 'OfficeHours-MF-07AM-10PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group1' and runtime_tag_value[0] == 'OfficeHours-MF-09AM-05PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group1' and runtime_tag_value[0] == 'OfficeHours-MF-09AM-07PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Always_On' and runtime_tag_value[0] == 'Always_On_Prod':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Always_On' and runtime_tag_value[0] == 'Always_On_NonProd':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group2' and runtime_tag_value[0] == 'On_Demand_NonProd':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group1' and runtime_tag_value[0] == 'CustomHours-MF-07AM-11:45PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group2' and runtime_tag_value[0] == 'CustomHours-MS-10:45PM-11PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                elif patchschedule_tag_value[0] == 'Monthly_Group2' and runtime_tag_value[0] == 'CustomHours-MS-06:45PM-07PM':
                    all_tags.append(f"Instance tags verification: PASS")
                    tags_pass += 1
                    print(f"Instance tags verification: PASS")
                else:
                    all_tags.append(f"Instance tags verification: FAIL")
                    failed_tags += 1
                    failed_tags_instance += 1
                    print(f"Instance tags verification: FAIL")
            else:
                all_tags.append(f"Instance tags verification: FAIL")
                failed_tags += 1
                failed_tags_instance += 1
                print(f"Instance tags verification: FAIL")

            #Check if the instance volume has a KMS Key
            if 'BlockDeviceMappings' in instance:
                for mapping in instance['BlockDeviceMappings']:
                    if 'Ebs' in mapping:
                        if 'KmsKeyId' in mapping['Ebs']:
                            print(f"Instance has a KMS Key")
                            all_tags.append(f"Instance has a KMS Key")
                            kms_list_of_instances.append(instance['InstanceId'])

                            # Query CloudTrail for EC2 instance state change events
            ctrl = session.client('cloudtrail')
            ctrl_instance = str(instance['InstanceId'])
            response_ct = ctrl.lookup_events(
                LookupAttributes=[
                    {
                        'AttributeKey': 'ResourceName',
                        'AttributeValue': ctrl_instance
                    }
                ],
                StartTime=start_time,
                EndTime=end_time
            )
            instance_stopped = 0

            # Check if any events were found
            if 'Events' in response_ct and failed_tags_instance == 0:
                # Print the events
                for event in response_ct['Events']:
                    if event['EventName'] == 'StopInstances' and instance_stopped == 0 and 'On_Demand_NonProd' not in runtime_final_tag:
                        stop_runtime_time_date = str(event['EventTime'])
                        stop_runtime_time = stop_runtime_time_date.split(' ')[1]
                        final_stop_runtime_time = stop_runtime_time.split(':')[0]
                        if runtime_final_tag == 'OfficeHours-MF-07AM-07PM' and "19" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        elif runtime_final_tag == 'OfficeHours-MF-07AM-10PM' and "22" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        elif runtime_final_tag == 'OfficeHours-MF-09AM-05PM' and "17" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        elif runtime_final_tag == 'OfficeHours-MF-09AM-07PM' and "19" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        elif runtime_final_tag == 'CustomHours-MF-07AM-11:45PM' and "23" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        elif runtime_final_tag == 'CustomHours-MS-10:45PM-11PM' and "23" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        elif runtime_final_tag == 'CustomHours-MS-06:45PM-07PM' and "19" in final_stop_runtime_time:
                            all_tags.append(f"Instance Runtime STOP verification: PASS")
                            print(f"Instance Runtime STOP verifivation: PASS")
                            instance_stopped += 1
                        else:
                            all_tags.append(f"Instance Runtime STOP verifivation: FAIL - Instance stopped not matching schedule")
                            print(f"Instance Runtime STOP verification: FAIL  - Instance stopped not matching schedule")
                            instance_stopped += 1
                            failed_tags += 1
                    elif runtime_final_tag == 'Always_On_Prod'  and instance_stopped == 0:
                        all_tags.append("Instance Runtime STOP verifivation: PASS")
                        print("Instance Runtime STOP verification: PASS")
                        instance_stopped += 1
                    elif runtime_final_tag == 'Always_On_NonProd' and instance_stopped == 0:
                        all_tags.append("Instance Runtime STOP verifivation: PASS")
                        print("Instance Runtime STOP verification: PASS")
                        instance_stopped += 1
                    elif runtime_final_tag == 'On_Demand_NonProd' and instance_stopped == 0:
                        all_tags.append("Instance Runtime STOP verifivation: PASS")
                        print("Instance Runtime STOP verification: PASS")
                        instance_stopped += 1
                if runtime_final_tag == 'Always_On_Prod'  and instance_stopped == 0:
                    all_tags.append("Instance Runtime STOP verifivation: PASS")
                    print("Instance Runtime STOP verification: PASS")
                    instance_stopped += 1
                elif runtime_final_tag == 'Always_On_NonProd' and instance_stopped == 0:
                    all_tags.append("Instance Runtime STOP verifivation: PASS")
                    print("Instance Runtime STOP verification: PASS")
                    instance_stopped += 1
                elif runtime_final_tag == 'On_Demand_NonProd' and instance_stopped == 0:
                    all_tags.append("Instance Runtime STOP verifivation: PASS")
                    print("Instance Runtime STOP verification: PASS")
                    instance_stopped += 1
            elif runtime_final_tag == 'On_Demand_NonProd' and instance_started == 0:
                all_tags.append("Instance Runtime STOP verifivation: PASS")
                print("Instance Runtime STOP verification: PASS")
                instance_stopped += 1
            else:
                all_tags.append("Instance Runtime STOP verifivation: FAIL - There is no event for this instance")
                print("Instance Runtime STOP verification: FAIL - There is no event for this instance")
                failed_tags += 1
            instance_started = 0

            # Check if any events were found
            if 'Events' in response_ct and failed_tags_instance == 0:
                # Print the events
                for event_started_runtime in response_ct['Events']:
                    if event_started_runtime['EventName'] == 'StartInstances' and instance_started == 0 and 'On_Demand_NonProd' not in runtime_final_tag:
                        start_runtime_time_date = str(event_started_runtime['EventTime'])
                        start_runtime_time = start_runtime_time_date.split(' ')[1]
                        final_start_runtime_time = start_runtime_time.split(':')[0]
                        if runtime_final_tag == 'OfficeHours-MF-07AM-07PM' and "07" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        elif runtime_final_tag == 'OfficeHours-MF-07AM-10PM' and "07" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        elif runtime_final_tag == 'OfficeHours-MF-09AM-05PM' and "09" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        elif runtime_final_tag == 'OfficeHours-MF-09AM-07PM' and "09" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        elif runtime_final_tag == 'CustomHours-MF-07AM-11:45PM' and "07" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        elif runtime_final_tag == 'CustomHours-MS-10:45PM-11PM' and "22" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        elif runtime_final_tag == 'CustomHours-MS-06:45PM-07PM' and "18" in final_start_runtime_time:
                            all_tags.append(f"Instance Runtime START verification: PASS")
                            print(f"Instance Runtime START verification: PASS")
                            instance_started += 1
                        else:
                            all_tags.append(f"Instance Runtime START verification: FAIL - Instance started not matching schedule")
                            print(f"Instance Runtime START verification: FAIL  - Instance started not matching schedule")
                            instance_started += 1
                            failed_tags += 1
                    elif runtime_final_tag == 'Always_On_Prod' and instance_started == 0:
                        all_tags.append("Instance Runtime START verification: PASS")
                        print("Instance Runtime START verification: PASS")
                        instance_started += 1
                    elif runtime_final_tag == 'Always_On_NonProd' and instance_started == 0:
                        all_tags.append("Instance Runtime START verification: PASS")
                        print("Instance Runtime START verification: PASS")
                        instance_started += 1
                    elif runtime_final_tag == 'On_Demand_NonProd' and instance_started == 0:
                        all_tags.append("Instance Runtime START verification: PASS")
                        print("Instance Runtime START verification: PASS")
                        instance_started += 1
                if runtime_final_tag == 'Always_On_Prod' and instance_started == 0:
                    all_tags.append("Instance Runtime START verification: PASS")
                    print("Instance Runtime START verification: PASS")
                    instance_started += 1
                elif runtime_final_tag == 'Always_On_NonProd' and instance_started == 0:
                    all_tags.append("Instance Runtime START verification: PASS")
                    print("Instance Runtime START verification: PASS")
                    instance_started += 1
                elif runtime_final_tag == 'On_Demand_NonProd' and instance_started == 0:
                    all_tags.append("Instance Runtime START verification: PASS")
                    print("Instance Runtime START verification: PASS")
                    instance_started += 1

            elif runtime_final_tag == 'On_Demand_NonProd' and instance_started == 0:
                all_tags.append("Instance Runtime START verification: PASS")
                print("Instance Runtime START verification: PASS")
                instance_started += 1
            else:
                all_tags.append("Instance Runtime START verification: FAIL - There is no event for this instance")
                print("Instance Runtime START verification: FAIL - There is no event for this instance")
                failed_tags += 1

                # instance_stopped_patch = 0

            # # Check if any events were found
            # if 'Events' in response_ct and failed_tags_instance == 0:
            #     # Print the events
            #     for event_patch in response_ct['Events']:
            #         if event_patch['EventName'] == 'StopInstances' and instance_stopped_patch == 0:
            #             stop_patch_time_date = str(event_patch['EventTime'])
            #             stop_patch_time = stop_patch_time_date.split(' ')[1]
            #             final_stop_patch_time = stop_patch_time.split(':')[0]
            #             if  patchschedule_final_tag == 'Monthly_Group1' and "23" in final_stop_patch_time:
            #                 all_tags.append(f"Instance Patch Schedule STOP verification: PASS")
            #                 print(f"Instance Runtime STOP verification: PASS")
            #                 instance_stopped_patch += 1
            #             elif patchschedule_final_tag == 'Monthly_Group2' and "11" in final_stop_patch_time:
            #                 all_tags.append(f"Instance Patch Schedule STOP verifivation: PASS")
            #                 print(f"Instance Patch Schedule STOP verification: PASS")
            #                 instance_stopped_patch += 1
            #             else:
            #                 all_tags.append(f"Instance Patch Schedule STOP verifivation: FAIL - Instance stopped not matching schedule")
            #                 print(f"Instance Patch Schedule STOP verification: FAIL  - Instance stopped not matching schedule")
            #                 instance_stopped_patch += 1
            #                 failed_tags += 1
            #     if instance_stopped_patch == 0:
            #             all_tags.append(f"Instance Patch Schedule STOP verification: FAIL - The instance did not stop")
            #             print(f"Instance Patch Schedule STOP verification: FAIL  - The instance did not stop")
            #             failed_tags += 1
            # elif patchschedule_final_tag == 'Always_On':
            #     all_tags.append("Instance Patch Schedule STOP verifivation: PASS")
            #     print("Instance Patch Schedule STOP verification: PASS")
            #     all_tags.append('')  # Add an empty line after each instance
            # else:
            #     all_tags.append("Instance Patch Schedule STOP verifivation: FAIL - There is no event for this instance")
            #     print("Instance Patch Schedule STOP verification: FAIL - There is no event for this instance")
            #     all_tags.append('')  # Add an empty line after each instance
            #     failed_tags += 1
            # instance_start_patch = 0


            # # Check if any events were found
            # if 'Events' in response_ct and failed_tags_instance == 0:
            #     # Print the events
            #     for event_patch_start in response_ct['Events']:
            #         if event_patch_start['EventName'] == 'StopInstances' and instance_start_patch == 0:
            #             start_patch_time_date = str(event_patch_start['EventTime'])
            #             start_patch_time = start_patch_time_date.split(' ')[1]
            #             final_start_patch_time = start_patch_time.split(':')[0]
            #             if  patchschedule_final_tag == 'Monthly_Group1' and "23" in final_start_patch_time:
            #                 all_tags.append(f"Instance Patch Schedule START verification: PASS")
            #                 print(f"Instance Patch Schedule START verification: PASS")
            #                 print("")
            #                 instance_start_patch += 1
            #             elif patchschedule_final_tag == 'Monthly_Group2' and "11" in final_start_patch_time:
            #                 all_tags.append(f"Instance Patch Schedule START verification: PASS")
            #                 print(f"Instance Patch Schedule START verification: PASS")
            #                 print("")
            #                 instance_start_patch += 1
            #             else:
            #                 all_tags.append(f"Instance Patch Schedule START verification: FAIL - Instance started not matching schedule")
            #                 print(f"Instance Patch Schedule START verification: FAIL  - Instance started not matching schedule")
            #                 print("")
            #                 instance_start_patch += 1
            #                 failed_tags += 1
            #     if instance_start_patch == 0:
            #             all_tags.append(f"Instance Patch Schedule START verification: FAIL - The instance did not start")
            #             print(f"Instance Patch Schedule START verification: FAIL  - The instance did not start")
            #             print("")
            #             failed_tags += 1
            # elif patchschedule_final_tag == 'Always_On':
            #     all_tags.append("Instance Patch Schedule START verification: PASS")
            #     print("Instance Patch Schedule START verification: PASS")
            #     all_tags.append('')  # Add an empty line after each instance
            #     print("")
            # else:
            #     all_tags.append("Instance Patch Schedule START verification: FAIL - There is no event for this instance")
            #     print("Instance Patch Schedule START verification: FAIL - There is no event for this instance")
            #     all_tags.append('')  # Add an empty line after each instance
            #     print("")
            #     failed_tags += 1
            all_tags.append("")
            print("")
    if failed_tags == 0 :
        all_tags.append("--------------------------------------------")
        all_tags.append(f"Test Result: PASS")
        all_tags.append("--------------------------------------------")
        print("--------------------------------------------")
        print(f"Test Result: PASS")
        print("--------------------------------------------")
        if len(kms_list_of_instances) > 0:
            print(f"Instances with KMS Key:")
            for i in kms_list_of_instances:
                print(i)
            all_tags.append(i)
            print("--------------------------------------------")
            all_tags.append("--------------------------------------------")
    else:
        all_tags.append("--------------------------------------------")
        all_tags.append(f"Test Result: FAIL")
        all_tags.append("--------------------------------------------")
        print("--------------------------------------------")
        print(f"Test Result: FAIL")
        print("--------------------------------------------")
        if len(kms_list_of_instances) > 0:
            print(f"Instances with KMS Key:")
            for i in kms_list_of_instances:
                print(i)
            all_tags.append(i)
            print("--------------------------------------------")
            all_tags.append("--------------------------------------------")

            # Create a string with all tags separated by new lines
    tags_string = '\n'.join(all_tags)

    # Write all tags to a file
    if failed_tags == 0 :
        file_path = f'/Users/bucurgb/Desktop/STUFF/CLOUD PROJECTS CODE!!!/cbiit-test-automation-cloud/test/ec2-scheduler/test-results/PASS-{account_number}_test_runtime_patching_tags_{current_datetime}.log'
    else:
        file_path = f'/Users/bucurgb/Desktop/STUFF/CLOUD PROJECTS CODE!!!/cbiit-test-automation-cloud/test/ec2-scheduler/test-results/FAIL-{account_number}_test_runtime_patching_tags_{current_datetime}.log'
    with open(file_path, 'w') as file:
        file.write(tags_string)

    # Upload the file to S3 bucket
    s3 = boto3.client(
        's3',
        region_name='us-east-1',  # Specify the AWS region
        aws_access_key_id=local_env.test_acc_aws_access_key_id,
        aws_secret_access_key=local_env.test_acc_aws_secret_access_key
    )
    if failed_tags == 0 :
        s3.upload_file(file_path, 'cbiit-test-automation-cloud', f'ec2-scheduler/PASS-{account_number}_test_runtime_patching_tags_{current_datetime}.log')
    else:
        s3.upload_file(file_path, 'cbiit-test-automation-cloud', f'ec2-scheduler/FAIL-{account_number}_test_runtime_patching_tags_{current_datetime}.log')
if __name__ == "__main__":
    collect_instance_tags()
print("")
print(f"********* SCRIPT RUN SUCCESSFULY! *********")
print("")
