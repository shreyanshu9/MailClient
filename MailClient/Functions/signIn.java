package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import UserObject.user;

public class signIn {

	public static user login(user thisUser, HashMap<String, user> account) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String email, password;
		if (thisUser == null) {
			System.out.println("Enter Email Address : ");
			email = br.readLine();
			System.out.println("Enter Password : ");
			password = br.readLine();
			if (account.containsKey(email)) {
				thisUser = account.get(email);
				if (thisUser.password.equals(password)) {
					System.out.println("==Welcome " + thisUser.email + "==\n");
				} else {
					System.out.println("\n||Invalid Emai - Password Pair||");
					thisUser = null;
				}
			} else {
				System.out.println("\n||User doesn't exist||");
			}
		} else {
			System.out.println("\n||Already Logged In||");
		}
		return thisUser;
	}

}
