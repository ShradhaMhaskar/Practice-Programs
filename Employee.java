package practiceProgram;

public class Employee {
	void CalculateBonus(int salary,int experience){
		double bonus;
		if(experience>=5) {
			bonus=salary*0.20;
		}else if(experience>=3) {
			bonus=salary*0.10;
		}else {
			bonus=salary*0.5;
		}
		double finalSalary=salary+bonus;
		System.out.println("Basic salary : Rs. " +salary);
		System.out.println("Bonus : Rs. " +bonus);
		System.out.println("Final salary : Rs. " +finalSalary);
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.CalculateBonus(30000, 5);
	}

}
