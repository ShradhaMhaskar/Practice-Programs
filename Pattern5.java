package tka.com;

public class Pattern5 {
	public static void main(String[] args) {
		int num=0;
		boolean flag=true;
		for(int i=1;i<=7;i++) {
			if(flag) {
				num=num*10+1;
			}else {
				num=num/10;
			}
			System.out.println(num + " ");
			if(num==1111) {
				flag=false;
			}
		}
	}

}
