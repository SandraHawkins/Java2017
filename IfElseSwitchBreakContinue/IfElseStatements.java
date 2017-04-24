public class IfElseStatements {

	public static void main(String [] args) {
		
		int num = 5;
		
		/* An if statement evaluates a condition and will execute the
		if block only when the condition is true. Curly brackets are
		optional when there is only one statement. 
		The else block is optional, if you have one it must 
		immediately follow an if.
		
		The expression in the (parentheses) must evaluate to a boolean. 
		*/
		
		if (num == 5) {
			System.out.println("Number is 5");
		}
		System.out.println("After the if.");
		
		/* When you have a if and an else. The if part will execute
		when the condition is true and the else part will execute
		when the condition is false.
		*/
		if (num < 10)
			System.out.println("Number is under 10");
		else 
			System.out.println("Number is 10 or over");
	
		/* The following if else statements will evaluate the 
		examScore and assign the correct grade (A to F) to the grade
		variable. When if elses are chained together, only one body
		will execute. E.g. when the examScore is 63, the first two
		ifs will evaluate to false and the third will be true, only 
		the body of the third if statement will execute and then
		execution will go to the println() statement after the else.
		When using multiple if elses, there can only be one else 
		statement on it's own, it must immediate follow an if and
		it must be at the end. An else clause belongs to the innermost/
		closest preceding if.
		Again, curly brackets are optional if you only one statement, 
		in the third if below, curly brackets are included because 
		there are two statements in the body of the if. 
		*/
		int examScore = 63;
		char grade;
		
		if (examScore <= 39) 
			grade = 'F';
		else if (examScore >= 40 && examScore <= 50) 
			grade = 'D';
		else if (examScore >= 41 && examScore <= 64) {
			grade = 'C';
			System.out.println("Well done!");
		} else if (examScore >= 65 && examScore <= 84) 
			grade = 'B';
		else 
			grade = 'A';
		
		System.out.println("Grade is " + grade);
		
		/* Relational operators (<, >, <=, >=, != and ==) and 
		conditional operators (&&, !!, !) are all valid in the 
		condition of an if. The following examples are all legal:
		
		boolean isValid = false;
		if (!isValid && numOfAttempts < 3)
		
		if (num == 3 || num == 6)   // if num is 3 or 6
		
		if (num >= 1 && num <= 10)  // num between 1 and 10
		*/
	}
}
/** OUTPUT
Number is 5
After the if.
Number is under 10
Well done!
Grade is C
*/