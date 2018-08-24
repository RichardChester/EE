package account_application.account;

import static org.junit.Assert.assertEquals;

import  org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import account_service.studentServise;


public class TestingSelector {
	
	private static studentServise service;
	
	@BeforeClass
	public static void setup () {
		service = new studentServise();
		service.addStudentsToMap(new Account_management("Dickie", "Chester", "115599"));
		service.addStudentsToMap(new Account_management("dean", "williams", "775533"));
		service.addStudentsToMap(new Account_management("matt", "metts", "558822"));
		service.addStudentsToMap(new Account_management("matt", "jackson", "1369874"));
				
	}
	
	@Test
	public void Test1() {
	assertEquals(2,service.Search("matt")); 	
	}
	

}
