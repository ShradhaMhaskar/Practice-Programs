package tka.com;

public class Pattern3 {
	public static void main(String[] args) {
		int prefix=0;
		int suffix=0;
		int place=1;
		for(int i=1;i<=4;i++) {
			prefix=prefix*10+i;
			int num=prefix*place+suffix;
			System.out.println(num);
			suffix=i*place+suffix;
			place=place*10;
		}

	}
}
