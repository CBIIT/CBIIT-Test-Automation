package com.nci.automation.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;


public class RestfulWebServiceManager {
	private RestProperties restProps;

	public RestfulWebServiceManager() {
	}

	public RestfulWebServiceManager(RestProperties parm) {
		this.restProps = parm;
	}

	public String sendRequest(String request, String requestMethod, String contentType, String msgFilename)
			throws TestingException {
		HttpURLConnection connection = null;
		StringBuilder returnValue = new StringBuilder();

		try {
			File msgFile = new File(msgFilename);
			InputStream in = new FileInputStream(msgFile);
			byte[] barray = new byte[(int) msgFile.length()];
			in.read(barray, 0, (int) msgFile.length());
			MiscUtils.closeQuietly(in);

			URL restURL = new URL(restProps.getRestURI() + "/" + request);
			connection = (HttpURLConnection) restURL.openConnection();
			connection.setDoOutput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod(requestMethod);
			connection.setRequestProperty("Content-Type", contentType);
			connection.setReadTimeout(30000);

			if (!"".equals(restProps.getSessionId())) {
				connection.setRequestProperty("Cookie", "JSESSIONID=" + restProps.getSessionId());
			}

			OutputStream os = connection.getOutputStream();
//            os.write(xml.getBytes());
			os.write(barray);

			os.flush();

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line = reader.readLine();
			while (line != null) {
				returnValue.append(line);
				line = reader.readLine();
			}
		} catch (MalformedURLException me) {
			throw new TestingException("Invalid url", me);
		} catch (ProtocolException pe) {
			throw new TestingException("Invalid web service call", pe);
		} catch (IOException ioe) {
			throw new TestingException("Invalid web service call", ioe);
		} finally {
			connection.disconnect();
		}

//        long responseCode = connection.getResponseCode();
		connection.disconnect();
		return returnValue.toString();
	}

	/**
	 *
	 * Performs a web service request and returns the result in a string
	 * 
	 * @param request       the web service end-point + parms which make up the URL
	 *                      for the web service request
	 *
	 * @param requestMethod web service request method i.e POST,GET,PUT,DELETE
	 *
	 * @param contentType   web service mime type. For example application/xml,
	 *                      application/json
	 * 
	 * @return array of values of the JSON array element represented by the given
	 *         xpath and value
	 *
	 * @throw TestingException
	 */
	public String sendRequest(String request, String requestMethod, String contentType) throws TestingException {

		StringBuilder returnValue = new StringBuilder();
		HttpURLConnection connection = null;

		try {
			URL restURL = new URL(restProps.getRestURI() + "/" + request);
			connection = (HttpURLConnection) restURL.openConnection();
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod(requestMethod);
			connection.setRequestProperty("Content-Type", contentType);
			connection.setRequestProperty("Content-length", "0");
			connection.setUseCaches(false);
			connection.setAllowUserInteraction(false);
			connection.setReadTimeout(30000);
			if (!"".equals(restProps.getSessionId())) {
				connection.setRequestProperty("Cookie", "JSESSIONID=" + restProps.getSessionId());
			}

			connection.connect();

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line = reader.readLine();
			while (line != null) {
				returnValue.append(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (MalformedURLException me) {
			throw new TestingException("Invalid url", me);
		} catch (ProtocolException pe) {
			throw new TestingException("Invalid web service call", pe);
		} catch (IOException ioe) {
			throw new TestingException("Invalid web service call", ioe);
		} finally {
			connection.disconnect();
		}

		return returnValue.toString();
	}

	public RestProperties getRestProps() {
		return restProps;
	}

	public void setRestProps(RestProperties restProps) {
		this.restProps = restProps;
	}

}
