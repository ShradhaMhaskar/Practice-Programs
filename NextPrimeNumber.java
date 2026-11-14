package tka.com;

public class NextPrimeNumber {
	public static void main(String[] args) {
		int n=7;
		int num=n+1;
		int divisor=1;
		int count=0;
		while(true) {
			if(divisor<=num) {
				if(num % divisor==0) {
					count++;
				}
				divisor++;
			}else {
				if(count==2) {
					System.out.println("Next Prime Number : " + num);
					break;
				}
				num++;
				divisor=1;
				count=0;
				
			}
		}
	}

}
