
public class Main {

	//If a number can be divided evenly by 3, print Fizz
	//If a number can be divided evenly by 5, print Buzz
	//If a number can be divided evenly by both, print FizzBuzz
	
	public static void main(String[] args) {
		int i = 15; //The number to be fizzbuzz'd
		String s = "";
		if(i%3 == 0){
			s = s + "Fizz";
		}
		if(i%5 == 0){
			s = s + "Buzz";
		}
		System.out.println(s);
	}

}
