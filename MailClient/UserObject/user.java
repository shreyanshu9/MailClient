package UserObject;

import java.util.HashMap;

public class user {
	public String email = null;
	public String password = null;
	public HashMap<Integer, String[]> send = new HashMap<Integer, String[]>();
	public HashMap<Integer, String[]> receive = new HashMap<Integer, String[]>();
	public int sendSize = 0;
	public int receiveSize = 0;
}
