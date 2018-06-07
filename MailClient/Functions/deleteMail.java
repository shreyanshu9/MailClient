package Functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import UserObject.user;

public class deleteMail {

	public static user delete(boolean data, user thisUser) throws NumberFormatException, IOException {
		int code;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (thisUser != null) {
			System.out.println("Enter Mail Code : ");
			code = Integer.parseInt(br.readLine());
			if (data) {
				if (thisUser.receive.containsKey(code)) {
					thisUser.receive.remove(code);
				} else {
					System.out.println("\n||No Such Mail||");
				}
			} else {
				if (thisUser.send.containsKey(code)) {
					thisUser.send.remove(code);
				} else {
					System.out.println("\n||No Such Mail||");
				}
			}
		} else {
			System.out.println("\n||Sign In First||");
		}
		return thisUser;
		
	}

}
