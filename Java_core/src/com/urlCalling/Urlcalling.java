package com.urlCalling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.MessageFormat;

public class Urlcalling {
	
	

	public static void main(String[] args) throws IOException {
		final String USER_AGENT = "Mozilla/5.0";
		String phone="8655494812";
		
		String url1="https://www.k3digitalmedia.in/vendorsms/pushsms.aspx?user=byzan&password=systems&msisdn=9702672614&sid=GPAYEX&msg=Welcome+to+freePay+family!!+Your+freePay+OTP+is+5407+for+mobile+number+9702672614.+Kindly+proceed+with+the+activation.&fl=0&gwid=2";
		
		String smsAPI = "https://www.k3digitalmedia.in/vendorsms/pushsms.aspx?user=byzan&password=systems&msisdn={0}&sid=GPAYEX&msg={1}&fl=0&gwid=2";
		String msg = "Your PayEx otp password is 1234 for mobile no is 8655494812. Do not disclose your password to anyone.";
		String url = MessageFormat.format(smsAPI,phone,URLEncoder.encode(msg,"utf-8"));
				System.out.println("url : "+url);
				System.out.println("url1 "+url1);

				URL obj = new URL(url);
				
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
				con.setConnectTimeout(10000000);

				// optional default is GET
				con.setRequestMethod("GET");
				//add request header
				//con.("mobile", retailer.phone);
				//con.addRequestProperty("message", retailer.msg);
				//int responseCode = con.getResponseCode();
				
				System.out.println("\nSending 'GET' request to URL : " + url);
				//System.out.println("Response Code : " + responseCode);

				BufferedReader in = new BufferedReader(
				        new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				//print result
				System.out.println("Response "+response.toString());


	}

}
