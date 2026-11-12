package practiceProgram;

public class Calculator {
	int a,b;
	Calculator(){
		int a=0;
		int b=0;
	}
	
	Calculator(int x,int y){
		a=x;
		b=y;
	}
	
	void Addition() {
		System.out.println("Addition : " +(a+b));
	}
	
	void Multiplication() {
		System.out.println("Multiplication : " +(a*b));
	}
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Calculator c2=new Calculator(10,5);
		System.out.println("Default Constructor");
		c1.Addition();
		c2.Multiplication();
		System.out.println("----------------------------");
		System.out.println("Parameterised Constructor");
		c1.Addition();
		c2.Multiplication();
	}
	

}
