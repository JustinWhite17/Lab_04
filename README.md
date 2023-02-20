# Lab_04
a) The output is: 
1 …
2 …
3 …
4 …
5 …
6 Blastoff!

	b) to print only even number: see eclipse

	c) The time complexity is O(n) because it depends what number int is set to (the input).

a) the code finds the GCD depending on the input 

	b) 
  
  public class question2 {

  public static void main(String[] args) {
		
	}

static int gcd(int x, int y) {
    if (x == y) { //base
        return x;
    } else if (x > y) { // recursive cases using else statements
        return gcd(x - y, y);
    } else { 
        return gcd(x, y - x);
    }
	}
}
//put code here since it was not letting me push two projects 

3. The time complexity is O(2n), n = input parameter. The function calls itself twice resulting in the 2 and also resulting in an exponential growth.
