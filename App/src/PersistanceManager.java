/*
 * Persistence Manager
 */

import javax.net.ssl.*;
import java.io.*;
import java.net.*;

public class PersistanceManager {	
	public void Main(InetAddress addr, int port) 
	{
		// Create a trust manager that does not validate certificate chains
		TrustManager[] trustAllCerts = new TrustManager[]{
			new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				public void checkClientTrusted(
						java.security.cert.X509Certificate[] certs, String authType) {
				}
				public void checkServerTrusted(
						java.security.cert.X509Certificate[] certs, String authType) {
				}
			}
		};
		
		try 
		{
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null,trustAllCerts,new java.security.SecureRandom());
			SSLSocketFactory sslSocketFactory = sc.getSocketFactory();

			SSLSocket sock = (SSLSocket) sslSocketFactory.createSocket(addr,port);
			//java.util.Scanner kbIn = new java.util.Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			PrintWriter pw = new PrintWriter(sock.getOutputStream());

			String send;
			String httpCommand = "GET " + "/fileadmin/383/index.php?uid=herbstmb" + "HTTP/1.0\r\nHOST: www.eas.muohio.edu\r\n\r\n";

			pw.println(httpCommand);
			pw.flush();

			while (true) 
			{
				send=br.readLine();
				if (send==null)
					break;
				System.out.println("Response: " + send);
			}
		
		sock.close();
		
		} 
		catch (Exception err) 
		{
			System.err.println("IO Error " + err);
		}
	}

	public static void errorExit(String s) {
		System.err.println(s);
		System.exit(-1);
	}
	
	void receiveFromDM(){

	}

	void receiveFromPM(){

	}

	void receiveFromLocalDB() {

	}

	void sendToDM(){

	}

	void sendToPM(){

	}

	void sendToLocalDB(){

	}
}