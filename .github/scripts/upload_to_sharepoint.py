import os
import requests
import glob
from requests_ntlm import HttpNtlmAuth
import urllib.parse

# Get environment vars
url = os.getenv('host_name')
site_name = os.getenv('site_name')
upload_path = os.getenv('upload_path').replace('%20', ' ')
client_id = os.getenv('client_id')
client_secret = os.getenv('client_secret')

# Prepare the base part of the upload_url
upload_url_base = f"https://{url}/_api/web/getfolderbyserverrelativeurl('/sites/{site_name}/{urllib.parse.quote(upload_path)}')/files/add(url="

# use a wildcard to upload all files in the directory
file_path = os.getenv('file_path')

for file in glob.glob(file_path):
    with open(file, 'rb') as content_file:  # Open in binary mode
        file_content = content_file.read().decode(errors='ignore')  # Decode the content

    # Prepare the upload_url for this file
    filename = os.path.basename(file)
    upload_url = upload_url_base + f"'{urllib.parse.quote(filename)}',overwrite=true)"

    r = requests.put(
        url=upload_url,
        data=file_content,
        auth=HttpNtlmAuth(client_id, client_secret)
    )

    print(f"Response: {r}")  # Print the entire response object
    print(f"Response Status Code: {r.status_code}")  # Print the status code of the response
    if r.status_code >= 400:
        print(f"Error occurred: {r.text}")  # Print the error text if any error occurred
