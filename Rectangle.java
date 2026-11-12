package practiceProgram;

public class Rectangle {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		return length * breadth;
	}

	int perimeter() {
		return 2 * (length + breadth);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(15, 10);
		System.out.println("Length : " + r.length);
		System.out.println("Breadth : " + r.breadth);
		System.out.println("Area : " + r.area());
		System.out.println("Perimeter : " + r.perimeter());
	}

}
