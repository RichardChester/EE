package account_service;

import java.util.HashMap;
import com.google.gson.Gson;

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
	
	public HashMap<Integer, Account_management> RetriveAccountsAsJson () {
		//Gson accountretrival = new Gson();
		return accountMap;
		
		
	}
	
	public int Search (String FirstName) {
		int NameSearch = 0;
		
		for (int i=1; i<=accountMap.size();i++)
		{
			if (accountMap.get(i).getFirstName().equals(FirstName))
			{
				NameSearch++;
			}
			
		}
		
		
		return NameSearch;
		
	}
}
