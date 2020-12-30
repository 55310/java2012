package com.oop;
/*
 *  클래스 선언하는 방법을 설명한다.
 *  접근제어자 class 클래스이름 {멤버변수; 메서드;}
  */
public class Student {
	// 멤버변수 선언
	private int studentID;  // 학번
	private String studentName; //이름
	private int grade; // 학년
	private String address; //주소
	
//	public void Student() {
//	System.out.println("기본 생성자가 동작 하였습니다.");
//	}
	

	
	
//	public int getGrade() {
//		return grade;
//	}
//
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}

	/*세터 setter, private 선언된 멤버 변수의 값을 변경 할 수 있도록 하는
	  외부에 오픈된 메서드 */
	public void setStudentID(int id) {
		studentID = id;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
	
	// 메서드
	// 접근제어자 리턴타입  메서드이름(패러미터리스트) { }
	public void study( ) {
		System.out.println(studentName + "이(가) 공부를 합시다.");
	} // end of study()
	
	public void showInfo() {
		System.out.println(studentID + studentName + grade + address);
	}
	

} //end of class
