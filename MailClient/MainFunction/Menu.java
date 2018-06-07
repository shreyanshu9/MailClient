package MainFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import UserObject.user;

public class Menu {

	static HashMap<String, UserObject.user> account = new HashMap<String, UserObject.user>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		user thisUser = null;
		Menu.mainMenu(thisUser);
	}
	private static void mainMenu(user thisUser) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		boolean send = false, receive = true;
		String mailData[] = new String[4];
		System.out.println("\n\tMain Menu\n");
		System.out.println("1. Sign Up");
		System.out.println("2. Sign In");
		System.out.println("3. Send New Mail");
		System.out.println("4. Check My Mails");
		System.out.println("5. Check My Sent Mails");
		System.out.println("6. Delete My Mails");
		System.out.println("7. Delete My Sent Mails");
		System.out.println("8. Logout");
		System.out.println("9. Exit");
		System.out.println("\nEnter Your Choice : ");
		choice = Integer.parseInt(br.readLine());
		switch(choice) {
			case 1 : account = Functions.signUp.createNewAccount(thisUser, account);
					 break;
			case 2 : thisUser = Functions.signIn.login(thisUser, account);
					 break;
			case 3 : mailData = Functions.newMail.get(thisUser);
			         thisUser = Functions.newMail.updateSender(thisUser, mailData);
			         account = Functions.newMail.updateReceiver(account, mailData);
			         break;
			case 4 : Functions.listMail.check(receive, thisUser);
					 break;
			case 5 : Functions.listMail.check(send, thisUser);
			 		 break;
			case 6 : thisUser = Functions.deleteMail.delete(receive, thisUser);
			 		 break;
			case 7 : thisUser = Functions.deleteMail.delete(send, thisUser);
			         break;
			case 8 : account = Functions.signOut.logout(thisUser, account);
			    	 thisUser = null;
					 break;
			case 9 : return;
		    default : System.out.println("\n||Error : Enter valid option||");
		}
		Menu.mainMenu(thisUser);
	}
}
