import os
import requests
import msal

# Receive environment variables from GitHub Actions Workflow
TENANT_ID = os.getenv('TENANT_ID')
CLIENT_ID = os.getenv('CLIENT_ID')
CLIENT_SECRET = os.getenv('CLIENT_SECRET')
SHAREPOINT_SITE_ID = os.getenv('SHAREPOINT_SITE_ID')
SHAREPOINT_DRIVE_ID = os.getenv('SHAREPOINT_DRIVE_ID')
FILE_PATH = os.getenv('FILE_PATH')
FILE_NAME = os.path.basename(FILE_PATH)

# Define the scopes and endpoints
SCOPE = ["https://graph.microsoft.com/.default"]
GRAPH_API_ENDPOINT = 'https://graph.microsoft.com/v1.0'


def authenticate():
    # Forming the authority
    authority = f"https://login.microsoftonline.com/{TENANT_ID}"

    # Creating the ConfidentialClientApplication
    app = msal.ConfidentialClientApplication(
        CLIENT_ID,
        authority=authority,
        client_credential=CLIENT_SECRET,
    )

    # Getting the access token
    result = app.acquire_token_silent(SCOPE, account=None)

    if not result:
        result = app.acquire_token_for_client(SCOPE)

    if "access_token" in result:
        return result["access_token"]
    else:
        raise Exception(f"Authentication failed: {result.get('error')}, {result.get('error_description')}")


def upload_file_to_sharepoint(access_token):
    try:
        # Building the correct endpoint
        upload_url = (
            f"{GRAPH_API_ENDPOINT}/sites/{SHAREPOINT_SITE_ID}/drives/{SHAREPOINT_DRIVE_ID}"
            f"/items/root:/{FILE_NAME}:/content"
        )

        # Read file content
        with open(FILE_PATH, "rb") as file_data:
            file_content = file_data.read()

        # Define headers
        headers = {
            "Authorization": f"Bearer {access_token}",
            "Content-Type": "application/octet-stream",
        }

        # Make the request
        response = requests.put(upload_url, headers=headers, data=file_content)

        # Check the response
        if response.status_code == 201:
            print(f"File uploaded successfully to {SHAREPOINT_DRIVE_ID}/{FILE_NAME}")
        else:
            print(f"Failed to upload file: {response.status_code}, {response.text}")

    except Exception as e:
        print(f"Error: {e}")


if __name__ == "__main__":
    upload_file_to_sharepoint(authenticate())
