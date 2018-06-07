package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import UserObject.user;

public class signUp {

	public static HashMap<String, user> createNewAccount(user thisUser, HashMap<String, user> account) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String email, password;
		if (thisUser == null) {
			System.out.println("Enter Email Address : ");
			email = br.readLine();
			System.out.println("Enter Password : ");
			password = br.readLine();
			if (account.containsKey(email)) {
				System.out.println("\n||User already Exists||");
			} else {
				thisUser = new user();
				thisUser.email = email;
				thisUser.password = password;
				account.put(email, thisUser);
			}
		} else {
			System.out.println("\n||Logout First||");
		}
		return account;
	}

}
