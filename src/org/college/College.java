package org.college;

public class College {
	public void collegeName() {
		System.out.println("collegeName=JPR");
	}
	public void collegeCode() {
		System.out.println("collegeCode=205");
	}
	public void collegeRank() {
       System.out.println("collegeRank");
	}
	public static void main(String[] args) {
		College p = new College();
				p.collegeName();
		p.collegeCode();
		p.collegeRank();
		
		Student q = new Student();
		   q.studentName();
           q.studentId();
           q.studentDept();
           
        Hostel r = new Hostel();
          r.hostelName();
          
          Dept s = new Dept();
            s.deptName();
	}
	

}
