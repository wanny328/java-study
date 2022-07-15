package arrayexample;

public class Student {
	private String studentName;
	private int studentID;
	private static int serialNum = 1000;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName( ) {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void showStudentInfo() {
		System.out.println(studentName + ", " + studentID);
	}
}
