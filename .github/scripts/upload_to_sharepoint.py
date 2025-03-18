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
TIMESTAMP = os.getenv('timestamp')
UPLOAD_FOLDER = os.getenv('UPLOAD_FOLDER')

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
    # Get list of files to upload
    files = glob.glob(FILES_PATH)
    logging.info(f"Files to upload: {files}")

    for file_path in files:
        try:
            # Generate file name with timestamp
            file_name = os.path.basename(file_path)

            # Replace extensions with timestamped names
            if file_name.endswith('.html'):
                file_name = file_name.replace('.html', f'-{TIMESTAMP}.html')
            elif file_name.endswith('.xlsx'):
                file_name = file_name.replace('.xlsx', f'-{TIMESTAMP}.xlsx')

            # Define upload URL
            upload_url = (
                f"{GRAPH_API_ENDPOINT}/sites/{SHAREPOINT_SITE_ID}/drives/{SHAREPOINT_DRIVE_ID}"
                f"/root:/{UPLOAD_FOLDER}/{file_name}:/content"
            )

            # Read file content
            with open(file_path, "rb") as file_data:
                file_content = file_data.read()

            # Define headers
            headers = {
                "Authorization": f"Bearer {access_token}",
                "Content-Type": "application/octet-stream",
            }

            # Upload the file
            logging.info(f"Uploading {file_name} to SharePoint...")
            start_time = time.time()
            response = requests.put(upload_url, headers=headers, data=file_content)
            end_time = time.time()

            # Check response
            if response.status_code in [200, 201]:
                logging.info(f"File {file_name} uploaded successfully in {end_time - start_time:.2f} seconds.")
            else:
                logging.error(f"Failed to upload {file_name}: {response.status_code} - {response.text}")

        except Exception as e:
            logging.error(f"Error while uploading {file_path}: {e}")


if __name__ == "__main__":
    access_token = authenticate()
    upload_files_to_sharepoint(access_token)
