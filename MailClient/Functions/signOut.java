package Functions;

import java.util.HashMap;

import UserObject.user;

public class signOut {

	public static HashMap<String, user> logout(user thisUser, HashMap<String, user> account) {
		if (thisUser == null) {
			System.out.println("\n||Already Logged Out||");
		} else {
			account.put(thisUser.email, thisUser);
			System.out.println("\nBye " + thisUser.email);
		}
		return account;
	}

}
