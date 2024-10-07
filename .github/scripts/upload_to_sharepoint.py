import requests
import json
import os
from requests.auth import HTTPBasicAuth

# Azure AD App details
client_id = os.environ['client_id']
client_secret = os.environ['client_secret']
tenant_id = os.environ['tenant_id']
sharepoint_site = os.environ['site_name']
sharepoint_document_library = 'Shared Documents/Platform Scientific - CHARMS/TEST AUTOMATION REPORTS'


# Step 1: Get access token from Microsoft
def get_access_token():
    url = f"https://login.microsoftonline.com/{tenant_id}/oauth2/v2.0/token"
    headers = {'Content-Type': 'application/x-www-form-urlencoded'}
    body = {
        'grant_type': 'client_credentials',
        'client_id': client_id,
        'client_secret': client_secret,
        'scope': 'https://graph.microsoft.com/.default'
    }
    response = requests.post(url, data=body, headers=headers)
    return response.json().get('access_token')


# Step 2: Upload file to SharePoint
def upload_file_to_sharepoint(file_name, file_content):
    access_token = get_access_token()
    upload_url = f"https://graph.microsoft.com/v1.0/sites/{sharepoint_site}/drive/root:/'{sharepoint_document_library}/{file_name}':/content"
    headers = {
        'Authorization': f'Bearer {access_token}',
        'Content-Type': 'application/octet-stream'
    }
    response = requests.put(upload_url, headers=headers, data=file_content)
    if response.status_code == 201:
        print(f"File {file_name} uploaded successfully")
    else:
        print(f"Failed to upload file: {response.content}")


# Get the file content
file_path = os.environ['file_path']

# Make sure it's a single file, you might want to set up a loop if it's multiple files
with open(file_path, 'rb') as f:
    file_content = f.read()

# Use the filename from file_path for the SharePoint upload
file_name = file_path.split('/')[-1]  # gets the file name

upload_file_to_sharepoint(file_name, file_content)
