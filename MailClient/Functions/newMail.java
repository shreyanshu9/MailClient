package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import UserObject.user;

public class newMail {

	public static String[] get(user thisUser) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a[] = new String[4];
		if (thisUser != null) {
			System.out.println("\tEnter Mail Details");
			a[0] = thisUser.email;
			System.out.println("To : ");
			a[1] = br.readLine();
			System.out.println("Subject : ");
			a[2] = br.readLine();
			System.out.println("Message : ");
			a[3] = br.readLine();
			return a;
		} else {
			System.out.println("\n||Sign In First||");
			return null;
		}
	}

	public static user updateSender(user thisUser, String[] mailData) {
		thisUser.send.put(thisUser.sendSize, mailData);
		thisUser.sendSize++;
		return thisUser;
	}

	public static HashMap<String, user> updateReceiver(HashMap<String, user> account, String[] mailData) {
		if (account.containsKey(mailData[1])) {
			user thisUser = account.get(mailData[1]);
			String temp = mailData[0];
			mailData[0] = mailData[1];
			mailData[1] = temp;
			thisUser.receive.put(thisUser.receiveSize, mailData);
			thisUser.receiveSize++;
			account.put(mailData[0], thisUser);
		}
		return account;
	}
}
