package sheet3ControlFlow;

import java.util.Scanner;

public class Ex12ExamMarks {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter result for first exam: ");
		int exam1 = scanner.nextInt();
		System.out.print("Enter result for second exam: ");
		int exam2 = scanner.nextInt();
		System.out.print("Enter result for third exam: ");
		int exam3 = scanner.nextInt();
		
		Ex12ExamMarks ex12 = new Ex12ExamMarks();
		ex12.calculateResult(exam1, exam2, exam3);
		
		scanner.close();
	}
	/* exam1 = 40   exam2 = 40	exam3 = 40 */
	public void calculateResult(int exam1, int exam2, int exam3) {
		/* Used to count how many exams are passed */
		int numOfPasses = 0;
		
		if (exam1 >= 40) 		
			numOfPasses++;  
		if (exam2 >= 40)	
			numOfPasses++;
		if (exam3 >= 40)	
			numOfPasses++;
		
		/* Printing the three exam results */
		System.out.printf(
				"exam 1: %d \t exam 2: %d \t exam 3: %d \t",
				exam1, exam2, exam3);
		
		/*
		 * NumOfPasses = 0			Fail
		 * NumOfPasses = 1			Fail
		 * NumOfPasses = 2			Get the average
		 * 						    >= 50 Pass
		 * 							< 50 Fail
		 * NumOfPasses = 3			Pass 
		 */
		if (numOfPasses == 0 || numOfPasses == 1) {
			System.out.println("Fail");
		} else if (numOfPasses == 2) { // check the average
			double average = (exam1 + exam2 + exam3) / 3.0;
			
			/*if (average >= 50)
				System.out.println("Pass");
			else 
				System.out.println("Fail");*/
			
			/* A ternary operator is an alternative to an if
			 * else. (condition) ? true part: false part; 
			 * If the condition is true then what's between the
			 * ? and : will be returned (it will be assigned to 
			 * a variable or printed) 
			 * If the condition is false, the part after the :
			 * is returned or executed (it might be another 
			 * ternary operator, i.e. an exam question). */
			String result = (average >= 50) ? "Pass" : "Fail";
			System.out.println(result);
						
		} else { // numOfPasses = 3
			System.out.println("Pass");
		}
	}
}
/** SAMPLE OUTPUT
Enter result for first exam: 30
Enter result for second exam: 70
Enter result for third exam: 50
exam 1: 30 	 exam 2: 70 	 exam 3: 50 	Pass

Enter result for first exam: 39
Enter result for second exam: 39
Enter result for third exam: 90
exam 1: 39 	 exam 2: 39 	 exam 3: 90 	Fail
*/