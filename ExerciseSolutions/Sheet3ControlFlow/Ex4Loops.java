class Ex4Loops {

	public static void main(String [] args) {
	
		int numOfLives = 8;
		
		do {
			System.out.println("Number of lives " + numOfLives);
			numOfLives--;
			//numOfLives = numOfLives - 1;
			//numOfLives -= 1;
		} while(numOfLives > 0);
	}
}
/** OUTPUT
Number of lives 8
Number of lives 7
Number of lives 6
Number of lives 5
Number of lives 4
Number of lives 3
Number of lives 2
Number of lives 1
*/