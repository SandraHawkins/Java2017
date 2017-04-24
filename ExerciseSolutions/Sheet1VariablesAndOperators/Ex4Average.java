/* 
 When the following operators are on the same line: * / - + there are 
 operator precedence rules. I.e. / and * will happen before + and -.
 If you want + and - to happen first, you need to put brackets around
 them.
 
 See the document: 
 
	\Dropbox\Software Dev - Finglas\Java\Notes\Operator Precedence.docx
*/
public class Ex4Average {

	public static void main(String [] args) {
	
		double num1 = 1.25;
		double num2 = 2.65;
		double num3 = 22.65;
		
		System.out.printf("Total is : %.2f\n", num1 + num2 + num3);
		System.out.println("Average is : " + (num1 + num2 + num3) / 3);
	}
}