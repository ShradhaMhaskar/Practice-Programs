package tka.com;

public class Pattern4 {
	public static void main(String[] args) {
		int num=1;
		boolean flag=true;
		for(int i=1;i<=7;i++) {
			System.out.println(num + " ");
			if(num==1000) {
				flag=false;
			}
			if(flag) {
				num=num*10;
			}else {
				num=num/10;
			}
		}
	}

}
