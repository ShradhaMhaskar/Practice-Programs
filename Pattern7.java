package tka.com;

public class Pattern7 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=1;
		int d;
		for(int i=1;i<=9;i++) {
			System.out.print(a + " ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}

}
