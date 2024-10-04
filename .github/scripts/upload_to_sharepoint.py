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
    with open(file, 'rb') as content_file:  # Open in binary mode
        file_content = content_file.read().decode(errors='ignore')  # Decode the content

    r = requests.put(
        url=upload_url,
        data=file_content,
        auth=HttpNtlmAuth(client_id, client_secret)
    )

    print(f"Response: {r}")  # Print the entire response object
    print(f"Response Status Code: {r.status_code}")  # Print the status code of the response
    if r.status_code >= 400:
        print(f"Error occurred: {r.text}")  # Print the error text if any error occurred
