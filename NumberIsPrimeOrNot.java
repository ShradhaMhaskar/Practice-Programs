package tka.com;

public class NumberIsPrimeOrNot {
	public static void main(String[] args) {
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				count++;
			}
		}
		if(num>1 && count==2) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
		
	}

}
