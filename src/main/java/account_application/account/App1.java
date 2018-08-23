package account_application.account;

import account_service.studentServise;

public class App1 {
	
	public static void Hello() {
		
		studentServise service = new studentServise();	
		service.addStudentsToMap(new Account_management("Dickie", "Chester", "115599"));
	}
 
}
