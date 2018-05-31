package com.urlCalling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class SimpleSmsSending {

	private final String USER_AGENT = "Mozilla/5.0";

	private void sendGet() throws Exception {

		//String url="http://www.k3digitalmedia.in/vendorsms/pushsms.aspx?user=byzan&password=systems&msisdn=8655494812&sid=GPAYEX&msg=Welcome+to+freePay+family!!+Your+freePay+OTP+is+5407+for+mobile+number+8655494812.+Kindly+proceed+with+the+activation.&fl=0&gwid=2";

		try {
			
			String recipient = "+918655494812";
            String message = " Greetings from Mr. Rahul! Have a nice day!";
            String username = "admin";
            String password = "abc123";
            String originator = "+918655494812";

            String url  = "http://127.0.0.1:9501/api?action=sendmessage&" +
            					 "username=" + URLEncoder.encode(username, "UTF-8") +
            					 "&password=" + URLEncoder.encode(password, "UTF-8") +
            					 "&recipient=" + URLEncoder.encode(recipient, "UTF-8") +
            					 "&messagetype=SMS:TEXT" +
            					 "&messagedata=" + URLEncoder.encode(message, "UTF-8") +
            					 "&originator=" + URLEncoder.encode(originator, "UTF-8") +
            					 "&serviceprovider=GSMModem1" +
            					 "&responseformat=html";
			
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
        
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		System.out.println("Response Message "+con.getResponseMessage());

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
		Object object=JSONValue.parse(response.toString());
        JSONObject jsonObject = (JSONObject) object;
        System.out.println("Error Message :"+jsonObject.get("ErrorMessage"));
		}
		catch (Exception e) {
			System.out.println("Error in Connection");
			e.printStackTrace();
			
		}

	}
	
	// HTTP GET request
		private void sendGet1() throws Exception {

			String url = "https://www.google.com/search?q=mkyong";
			
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			System.out.println("Response Message "+con.getResponseMessage());

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			//print result
			System.out.println(response.toString());

		}
	
	public static void main(String[] args) {
		SimpleSmsSending url=new SimpleSmsSending();
		try {
			//url.sendGet();
			url.sendGet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
