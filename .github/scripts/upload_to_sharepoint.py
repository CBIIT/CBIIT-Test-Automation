import os
import glob
import requests
import msal
import logging
import time

# Configure logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

# Receive environment variables from GitHub Actions Workflow
TENANT_ID = os.getenv('TENANT_ID')
CLIENT_ID = os.getenv('CLIENT_ID')
CLIENT_SECRET = os.getenv('CLIENT_SECRET')
SHAREPOINT_SITE_ID = os.getenv('SHAREPOINT_SITE_ID')
SHAREPOINT_DRIVE_ID = os.getenv('SHAREPOINT_DRIVE_ID')
FILES_PATH = os.getenv('FILES_PATH')

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
        logging.info("Authentication successful")
        return result["access_token"]
    else:
        logging.error(f"Authentication failed: {result.get('error')}, {result.get('error_description')}")
        raise Exception(f"Authentication failed: {result.get('error')}, {result.get('error_description')}")


def upload_files_to_sharepoint(access_token):
    # Get list of all files in the directory
    files = glob.glob(FILES_PATH)
    logging.info(f"Files to upload: {files}")

    for file_path in files:
        try:
            # Building the correct endpoint
            FILE_NAME = os.path.basename(file_path)
            upload_url = (
                f"{GRAPH_API_ENDPOINT}/sites/{SHAREPOINT_SITE_ID}/drives/{SHAREPOINT_DRIVE_ID}"
                f"/items/root:/{FILE_NAME}:/content"
            )

            # Read file content
            with open(file_path, "rb") as file_data:
                file_content = file_data.read()

            # Define headers
            headers = {
                "Authorization": f"Bearer {access_token}",
                "Content-Type": "application/octet-stream",
            }

            # Measure upload time
            start_time = time.time()
            response = requests.put(upload_url, headers=headers, data=file_content)
            end_time = time.time()

            # Check the response
            if response.status_code == 201:
                logging.info(f"File uploaded successfully to {SHAREPOINT_DRIVE_ID}/{FILE_NAME} in {end_time - start_time:.2f} seconds")
            else:
                logging.error(f"Failed to upload file: {response.status_code}, {response.text}")

        except Exception as e:
            logging.error(f"Error: {e}")


if __name__ == "__main__":
    upload_files_to_sharepoint(authenticate())