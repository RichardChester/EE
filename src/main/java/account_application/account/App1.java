package account_application.account;

import account_service.studentServise;
import selectAnAccount.Selector;

public class App1 {
	
	public static void main(String[] args) {
		
		studentServise service = new studentServise();	
		service.addStudentsToMap(new Account_management("Dickie", "Chester", "115599"));
		
		System.out.println(service.RetriveAccountsAsJson());
		
		
	}
     
}
