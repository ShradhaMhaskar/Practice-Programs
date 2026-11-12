package practiceProgram;

public class ElectricityBill {
	void CalculateBill(int units) {
		int bill;
		if (units <= 100) {
			bill = units * 2;
		} else if (units <= 200) {
			bill = 100 * 2 + (units - 100) * 3;

		} else {
			bill=100*2 + 100*3 + (units-200)*5;

		}
		System.out.println("Units Consumed : " +units);
		System.out.println("Electricity Bill : " +bill);
	}
	public static void main(String[] args) {
		ElectricityBill e=new ElectricityBill();
		e.CalculateBill(270);
	}

}
