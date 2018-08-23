package account_application.account;

public class Account_management {
	
	private String FirstName, SurName, AccountNumber;
	
public Account_management (String FirstName, String SurName, String AccountNumber) {
	
	this.FirstName = FirstName;
	this.SurName = SurName;
	this.AccountNumber = AccountNumber;
}




public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getSurName() {
	return SurName;
} 

public void setSurName(String surName) {
	SurName = surName;
}

public String getAccountNumber() {
	return AccountNumber;
}

public void setAccountNumber(String accountNumber) {
	AccountNumber = accountNumber;
}
@Override
public String toString() {
	return "Account_management [FirstName=" + FirstName + ", SurName=" + SurName + ", AccountNumber=" + AccountNumber
			+ "]";
}
}
