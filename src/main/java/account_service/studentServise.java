package account_service;

import java.util.HashMap;
import java.util.Map;

import account_application.account.Account_management;


public class studentServise {	
	private HashMap < Integer , Account_management> accountMap;
	private Integer counter=1;
	
	public studentServise() {
		accountMap = new HashMap<>();
	}
	public void addStudentsToMap(Account_management accountsToAdd) {
		accountMap.put(counter, accountsToAdd);
		counter++;
	}
}
