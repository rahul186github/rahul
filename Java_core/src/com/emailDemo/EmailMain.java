package com.emailDemo;

public class EmailMain {

	public static void main(String[] args) {
		/*EmailService emailService=new EmailService();
		String filepath="D:\\GLobal PayEx File Processing\\CPGMIS\\001873.csv";
		emailService.sendEmail(filepath);*/
		
		String host = "pop.rediffmailpro.com";
		String port = "995";
		String userName = "rahul.bhor@globalpayex.in"; //username for the mail you want to read
		String password = "8655494812"; //password

		//String saveDirectory = "/home/sdsf;

		//EmailPopService popService=new EmailPopService();
		//receiver.setSaveDirectory(saveDirectory);
		EmailPopService.downloadEmailAttachments(host, port, userName, password);

	}

}
