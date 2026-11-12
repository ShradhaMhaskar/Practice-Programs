package practiceProgram;

public class NumberAnalyzer {
	void checkEvenOdd(int number) {
		if(number % 2==0) {
			System.out.println(number + " : is even");
		}else {
			System.out.println(number + " : is odd");
		}
	}
	
	void checkPositiveNegative(int number) {
		if(number>0) {
			System.out.println(number + " : Number is positive");
		}else if(number<0) {
			System.out.println(number + " : Number is negative");
		}else {
			System.out.println("Zero");
		}
	}
	
	void checkNumDivisibleBy5(int number) {
		if(number % 5==0) {
			System.out.println(number + " : Number is divisible by 5");
		}else {
			System.out.println(number + " : Number is not divisible by 5");
		}
	}
	
	void checkGreater(int a,int b) {
		if(a>b) {
			System.out.println(a +" : is greater");
		}else if(b>a) {
			System.out.println( b + " is greater");
		}else {
			System.out.println("Both are equals");
		}
	}
	
	
}
