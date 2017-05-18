/** 
 * Author: Sandra Hawkins
 * Date:   18 May 2017
 * ExerciseSolutions/sheet5Classes/MainForEmail.java
 */ 
package sheet5Classes;

public class MainForEmail {

	public static void main(String[] args) {
		
		EmailAccount account1 = new EmailAccount(
				"hello@there.ie", "A12a34", EmailAccount.STORAGE_500_GB);
		System.out.println(account1);
		
//		EmailAccount account2 = new EmailAccount("sandra.hawkins@test.com", 
//				"123456", EmailAccount.STORAGE_1_TB);
//		System.out.println(account2);
//		
//		EmailAccount account3 = new EmailAccount("me@me.com", "abcdef", 10000);
//		System.out.println(account3);
	}
}