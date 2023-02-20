package evenNumbers;

public class evenNumbs {

	public static void main(String[] args) {
		countDown(10); //call countDown method as a test to see it count down evenly from 10
	}


//add conditional statement to check if num is even before printing
static void countDown(int num) {
	  if (num == 0) {
	    System.out.println("Blastoff!");
	  } else {
	    if (num % 2 == 0) {
	      System.out.println(num);
	    }
	    countDown(num - 1);
	  }
	}
}
