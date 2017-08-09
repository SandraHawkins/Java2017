/** 
 * Author: Sandra Hawkins
 * Date:   2 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/TraineeDefaults.java
 */ 

package chapter1JavaBuildingBlocks;

public class TraineeDefaults {

	public static void main(String[] args) {
		
		Trainee t = new Trainee();
		System.out.println(t.name);				 //	null
		System.out.println(t.age);				 // 0
		System.out.println(t.favouriteNumbers);	 // null
		System.out.println(t.favouriteYears[1]); // 0
	}
}

class Trainee {
	String name;
	int age;
	int [] favouriteNumbers;
	int [] favouriteYears = new int [3];
}
