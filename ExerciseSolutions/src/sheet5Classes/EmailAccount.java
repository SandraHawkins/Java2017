/** 
 * Author: Sandra Hawkins
 * Date:   18 May 2017
 * ExerciseSolutions/sheet5Classes/EmailAccount.java
 */ 
package sheet5Classes;

public class EmailAccount {
	
	private String emailAddress;
	private String password;
	private int storageLimit;
	
	public static final int STORAGE_100_GB = 100;
	public static final int STORAGE_500_GB = 500;
	public static final int STORAGE_1_TB = 1;
		
	public EmailAccount() {
		/* Assigning a default value for storage limit */
		storageLimit = STORAGE_100_GB;
	}

	public EmailAccount(String emailAddress, String password, 
					    int storageLimit) {
		this();
		setPassword(password);
		setEmailAddress(emailAddress);
		setStorageLimit(storageLimit);
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		
		/* [\\w.]+   		One or more word characters
		 * @				followed by an @
		 * [\\w-]+			followed by one or more word characters,
		 * 					a hyphen is allowed in the company name
		 * 					e.g. name@my-company.com
		 * \\.				followed by . as in .com
		 * [a-zA-Z]{2,}		followed by 2 or more letters (a to z)
		 * 
		 * 
		 * \w means a word character in Regex, because \ has special 
		 * meaning in a String in Java, e.g. "\n" or "\t", you must
		 * insert a second \ to remove the meaning of the \ in Java.
		 *
		 **/
		 String regex = "[\\w.]+@[\\w-]+\\.[a-zA-Z]{2,}";
		 
//		if (emailAddress.contains("@") && emailAddress.contains(".") &&
//			emailAddress.indexOf('@') < emailAddress.lastIndexOf('.'))
		if (emailAddress.matches(regex)) 
			this.emailAddress = emailAddress;
		else 
			System.out.println("Invalid email");
	}

	public String getPassword() {
		return password;
	}

	/* Check if the password contains capital letters and lowercase */
	public void setPassword(String password) {
		String regex = "(?=.*[a-z])(?=.*[A-Z]).{5,20}";
		
		//if (password.length() >= 5 && password.length() <= 20)
		if (password.matches(regex))
			this.password = password;
		else 
			System.out.println("Invalid Password");
	}

	public int getStorageLimit() {
		return storageLimit;
	}

	public void setStorageLimit(int storageLimit) {
		
		if (storageLimit == STORAGE_100_GB || 
				storageLimit == STORAGE_1_TB ||
				storageLimit == STORAGE_500_GB)
			this.storageLimit = storageLimit;
		else {
			System.out.println(storageLimit + 
					" is not valid, setting to the default");
			/* the default will have already been set in the constructor
			 * so no need to set it here */
			//this.storageLimit = STORAGE_100_GB;
		}
	}

	@Override
	public String toString() {
//		String text = "EmailAddress= ............";
//		if (storageLimit == STORAGE_1_TB)
//			text += "TB";
//		else 
//			text += "GB";
//		return text;
		
		return "EmailAddress= " + emailAddress + 
				", password= " + password + 
				", storageLimit= " + storageLimit +
				((storageLimit == STORAGE_1_TB) ? "TB" : "GB");
	}	
}