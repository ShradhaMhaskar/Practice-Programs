package practiceProgram;

public class Student {
	int rollNo;
	String name;
	int marks;

	Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	void display() {
		System.out.println("Roll No : " + rollNo);
		System.out.println("Student Name : " + name);
		System.out.println("Marks : " + marks);
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Ram", 87);
		Student s2 = new Student(102, "Shyam", 70);
		Student s3 = new Student(103, "Veena", 85);
		s1.display();
		s2.display();
		s3.display();
	}

}
