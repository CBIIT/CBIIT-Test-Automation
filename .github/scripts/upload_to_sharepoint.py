import os
import requests
import glob
from requests_ntlm import HttpNtlmAuth

# Get environment vars
url = os.getenv('host_name')
site_name = os.getenv('site_name')
upload_path = os.getenv('upload_path')
client_id = os.getenv('client_id')
client_secret = os.getenv('client_secret')

upload_url = f"http://{url}/{site_name}/{upload_path}"

# use a wildcard to upload all files in the directory
file_path = os.getenv('file_path')

for file in glob.glob(file_path):
    with open(file, 'r') as content_file:
        file_content = content_file.read()

    r = requests.put(
        url=upload_url,
        data=file_content,
        auth=HttpNtlmAuth(client_id, client_secret)
    )
