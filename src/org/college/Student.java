package org.college;

public class Student {
	public void studentName() {
       System.out.println("studentName=raja");
	}
	public void studentDept() {
       System.out.println("studentDept=IT");
	}
	public void studentId() {
       System.out.println("studentId=2106");
	}
	public static void main(String[] args) {
		Student q = new Student();
				q.studentName();
		q.studentId();
		q.studentDept();
	}

}
