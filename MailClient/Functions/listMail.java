package Functions;

import java.util.Map.Entry;

import UserObject.user;

public class listMail {

	public static void check(boolean data, user thisUser) {
		if (thisUser != null) {
			if (data) {
				if (!thisUser.receive.isEmpty()) {
					System.out.println("\t==Mails Of " + thisUser.email + "==");
					System.out.println("\nMail Code\t\tFrom\t\tSubject\t\tMessage\n");
					String mail[] = new String[4]; 
					for (Entry<Integer, String[]> ent : thisUser.receive.entrySet()) {
						mail = ent.getValue();
						System.out.println(ent.getKey() + "\t\t" + mail[1] + "\t\t" + mail[2] + "\t\t" + mail[3]);
					}
				} else {
					System.out.println("No Mails");
				}
			} else {
				if (!thisUser.send.isEmpty()) {
					System.out.println("\t==Mails Sent by " + thisUser.email + "==");
					System.out.println("\nMail Code\t\tTo\t\tSubject\t\tMessage\n");
					String mail[] = new String[4]; 
					for (Entry<Integer, String[]> ent : thisUser.send.entrySet()) {
						mail = ent.getValue();
						System.out.println(ent.getKey() + "\t\t" + mail[1] + "\t\t" + mail[2] + "\t\t" + mail[3]);
					}
				} else {
					System.out.println("No Mails");
				}
			}
		} else {
			System.out.println("Sign In First");
		}
	}

}
