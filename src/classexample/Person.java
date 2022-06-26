package classexample;

public class Person {
	int age;
	String name;
	boolean married;
	int kids;

public void setAge(int num) {
	age = num;
}

public void setName(String nam) {
	name = nam;
}

public void setMarried(String mar) {
	if(mar.equals("yes")) {
		married = true;
	}
	else if(mar.equals("no")) {
		married = false;
	}
}

public void setKids(int num) {
	kids = num;
}

public int getAge() {
	return age;
}

public String getName() {
	return name;
}

public boolean getMarried() {
	return married;
}

public int getKids() {
	return kids;
}

public static void main(String[] args) {
	
	}
}