package task3;

public class Student {
	private String name;
	private String groupNumber;
	private int marks[] = new int[5];

	public Student(String name, String groupNumber, int[] marks) {
		super();
		this.name = name;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public static Boolean checkMarks(int[] studentMarks) {
		Boolean b = true;
		for (int i = 0; i < studentMarks.length; i++) {
			if (studentMarks[i] < 9) {
				b = false;
				break;
			}
		}
		return b;

	}

	public static void sout(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (checkMarks(students[i].getMarks())) {
				System.out.println("Name: " + students[i].getName() + ", Group: " + students[i].getGroupNumber());
			}

		}

	}

}
