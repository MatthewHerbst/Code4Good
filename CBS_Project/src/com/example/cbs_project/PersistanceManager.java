package com.example.cbs_project;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.google.gson.Gson;

/*
 * Persistence Manager
 */

public class PersistanceManager {		
	/**
	 * Checks to see if there is internet connection
	 * http://stackoverflow.com/questions/4238921/android-detect-whether-there-is-an-internet-connection-available
	 */
	//TODO: Need the below in the Androind manifest
	//<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
/*
	private boolean isNetworkAvailable() {
	    ConnectivityManager connectivityManager 
	          = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    if(activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
	        return true;
	    }
	    return activeNetworkInfo != null;
	}
*/	
	/**
	 * Sends data to the server
	 */
	public void sendToServer(Object data){
		//http://stackoverflow.com/questions/2793150/how-to-use-java-net-urlconnection-to-fire-and-handle-http-requests		
		//http://stackoverflow.com/questions/4205980/java-sending-http-parameters-via-post-method-easily
		
		if(data != null)
		{
			String url = "";
			String dataString = "";
			
			//Determine the type of data being sent
			if(data.getClass() == Site.class){
				Site temp = (Site) data;
				dataString = temp.toJSON();
			} else if(data.getClass() == Client.class) {
				Client temp = (Client) data;
				dataString = temp.toJSON();
			} else if(data.getClass() == Volunteer.class) {
				Volunteer temp = (Volunteer) data;
				dataString = temp.toJSON();
			} else if(data.getClass() == Organization.class) {
				Organization temp = (Organization) data;
				dataString = temp.toJSON();
			} else {
				//TODO: Really bad error!
			}
			
			try{
				//URL encode the data
				//String queryString = URLEncoder.encode(dataString, "UTF-8");
			
				//Create the URL
				URL webService = new URL(url);// MalformedURLException
				
				//Create the HTTP connection
				HttpURLConnection connection = (HttpURLConnection) webService.openConnection();//IOException       
				connection.setDoOutput(true);
				connection.setDoInput(true);
				connection.setInstanceFollowRedirects(false); 
				connection.setRequestMethod("POST");//ProtocolException
				connection.setRequestProperty("Content-Type", "text\\json"); 
				connection.setRequestProperty("charset", "utf-8");
				connection.setRequestProperty("Content-Length", "" + Integer.toString(dataString.getBytes().length));
				connection.setUseCaches (false);
				
				//Output the data
				DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());//IOException
				wr.writeBytes(dataString);//IOException
				wr.flush();//IOException
				wr.close();//IOException
				
				//TODO: Make the server actually got data
					//http://docs.oracle.com/javase/1.5.0/docs/api/java/net/HttpURLConnection.html
				
				connection.disconnect();
			} catch(MalformedURLException mue) {
				System.out.println("Problem creating the url object.");
				mue.printStackTrace();
//				writeToLocalDB(1, data);
			} catch(ProtocolException pe){
				System.out.println("Problem with chosen protocol.");
				pe.printStackTrace();
//				writeToLocalDB(1, data);
			} catch(IOException ioe) {
				System.out.println("I/O error.");
				ioe.printStackTrace();
//				writeToLocalDB(1, data);
			}
		}
	}
	
	/**
	 * Receive data from the server
	 */
	void receiveFromInternet(){
		
	}
	
	void receiveFromDM(){
		
	}
	
	void receiveFromLocalDB() {

	}

	void sendToDM(){

	}

	/**
	 * Write data to local database
	 * @param reason - the reason this method is being called. No connection = 0, connection error = 1, receive = 2
	 * @param data - the data to be stored
	 */
	void writeToLocalDB(int reason, String data){
		//TODO:
			//Create database obj to perform write operations on
		switch(reason) {
			case 0: //No internet connection. Save to queue
				//obj.saveToQueue(data);
			case 1: //No internet connection. Save to queue
				//obj.saveToQueue(data);
			case 2: //Received data from server. Save to info
				//obj.saveToInfo(data);
			default:
		}
	}
}