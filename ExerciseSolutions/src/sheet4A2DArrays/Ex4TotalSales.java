/** 
 * Author: Sandra Hawkins
 * Date:   23 May 2017
 * ExerciseSolutions/sheet4A2DArrays/Ex4TotalSales.java
 */ 
package sheet4A2DArrays;

public class Ex4TotalSales {
	
	public static void main(String[] args) {
		
		/* Sales slips handed in each day, each slip contains:
		 * The Salesperson's id		Product number		Total €
		 * 			1					1				100
		 * 			1					2				200	
		 * 			1					3				400
		 * 			1					1				300
		 **/
		int [][] sales = {
				{1, 1, 100},  {1, 2, 200}, {1, 3, 400}, {1, 1, 300},
				{2, 4, 400},  {2, 5, 500}, {2, 3, 600}, {2, 3, 600}, 
				{3, 2, 1000}, {3, 3, 800}, {3, 4, 300}, {3, 4, 500}, 
				{4, 1, 200},  {4, 3, 300}, {4, 5, 500} 
		};	
		
		printSalesSlips(sales);
		
		/* Set up the matrix to hold a sum of all the sales for each
		 * person for each product */
		int [][] matrix = new int [5][4];
		
		/* Loops to populate the matrix*/
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				matrix[i][j] = getTotal(sales, j + 1, i + 1);
			}
		}
		
		System.out.println("\n\n");
		/* Calls the method to print the matrix and sum each row and column */ 
		printMatrix(matrix);
	}
	
	/* This method is called for each salesperson and each product. It
	 * search through all the sales slips for matching salesperson and
	 * product and accumulates the total. E.g. the first time this 
	 * method is called it will accumulate the total for salesperson
	 * 1 who sold product 1.  
	 **/
	public static int getTotal(int [][] sales, int salesPerson, int product) {
		/* Loop through the sales slips and find the current
		 * salesperson and the current product and add the total*/
		int total = 0;
		for (int k = 0; k < sales.length; k++) {
			/* If the salesperson and product match what was passed in
			 * then sum the total */
			if ( (sales[k][0] == salesPerson) &&  
				  sales[k][1] == product) {
				
				total += sales[k][2];
			}
		}
		return total;
	}
	
	/* Prints out the matrix with headings, and sums the rows and 
	 * columns as it prints.
	 * */
	public static void printMatrix(int [][] matrix) {
		
		/* Headings */
		System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s\n", "", 
				"1", "2", "3", "4", "Total €");
		System.out.printf("%1$7s%1$7s%1$7s%1$7s%1$7s%1$7s\n", "-------");
		
		/* An array to hold each column total */
		int [] columnTotals = new int [5];
		
		/* Two loops to access the contents of the matrix array */
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("%d  |   ", i + 1);
			int rowTotal = 0;
			/* This loop prints each row */
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-7d", matrix[i][j]);
				/* Add each value to the row total*/
				rowTotal += matrix[i][j];
				/* Add each value to the corresponding column total */
				columnTotals[j] += matrix[i][j];
			}
			/* Prints the row total at the end of each line. */
			System.out.print(rowTotal);
			/* Adds the last row total to the last column total element */
			columnTotals[4] += rowTotal;
			System.out.println();
		}
		
		System.out.printf("%1$7s%1$7s%1$7s%1$7s%1$7s%1$7s\n", "-------");
		
		/* Prints out the very last row containing the values from the 
		 * columns total array */
		System.out.print("Totals ");
		for (int num : columnTotals) {
			System.out.printf("%-7d", num);
		}
	}
	
	public static void printSalesSlips(int [][] sales) {
		System.out.println("All Sales Slips");
		System.out.printf("%-16s%-16s%s\n", "Salesperson #", "Product #", "Total €");
		for (int i = 0; i < sales.length; i++) {
//			for (int j = 0; j < sales[i].length; j++) {
//				
//				System.out.print(sales[i][j] + "      \t\t");
//			}
			System.out.printf("%-16d%-16d€%d\n", 
					          sales[i][0], sales[i][1], sales[i][2]);			
		}
		
//		for (int [] salesSlip : sales) {
//			for (int num : salesSlip) {
//				System.out.print(num + "      \t\t");
//			}
//			System.out.println();
//		}
	}
}
/** OUTPUT
All Sales Slips
Salesperson #   Product #       Total €
1               1               €100
1               2               €200
1               3               €400
1               1               €300
2               4               €400
2               5               €500
2               3               €600
2               3               €600
3               2               €1000
3               3               €800
3               4               €300
3               4               €500
4               1               €200
4               3               €300
4               5               €500



       1      2      3      4      Total €
------------------------------------------
1  |   400    0      0      200    600
2  |   200    0      1000   0      1200
3  |   400    1200   800    300    2700
4  |   0      400    800    0      1200
5  |   0      500    0      500    1000
------------------------------------------
Totals 1000   2100   2600   1000   6700   
*/