package com.urlCalling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Urlcalling2 {
	//test commit check
	private final String USER_AGENT = "Mozilla/5.0";

	private void sendGet() throws Exception {

		String url="http://www.k3digitalmedia.in/vendorsms/pushsms.aspx?user=byzan&password=systems&msisdn=8655494812&sid=GPAYEX&msg=Welcome+to+freePay+family!!+Your+freePay+OTP+is+5407+for+mobile+number+8655494812.+Kindly+proceed+with+the+activation.&fl=0&gwid=2";
				
		try {
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
		Urlcalling2 url=new Urlcalling2();
		try {
			//url.sendGet();
			url.sendGet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
