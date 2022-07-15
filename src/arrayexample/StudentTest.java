package arrayexample;

public class StudentTest {
	public static void main(String[] args) {
		Student[] school = new Student[3];
		school[0] = new Student();
		school[0].setStudentName("Tomas");
		school[0].showStudentInfo();
		school[1] = new Student();
		school[1].setStudentName("James");
		school[1].showStudentInfo();
		school[2] = new Student();
		school[2].setStudentName("Edward");
		school[2].showStudentInfo();
	}
}
