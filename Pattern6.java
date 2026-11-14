package tka.com;

public class Pattern6 {
	public static void main(String[] args) {
		int odd=1;
		int power=2;
		for(int i=1;i<=10;i++) {
			if(i % 2 !=0) {
				System.out.print(odd + " ");
				odd=odd+2;
			}else {
				System.out.print(power + " ");
				power=power*2;
			}
		}
	}

}
