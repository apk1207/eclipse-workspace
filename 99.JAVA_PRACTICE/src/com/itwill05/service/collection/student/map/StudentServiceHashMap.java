package com.itwill05.service.collection.student.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceHashMap {
	private HashMap<String, List<Student>> studentMap;
	
	public StudentServiceHashMap() {
		List<Student> studentsa = Arrays.asList(new Student(1, "A", "KIM", 89, 93, 94),
				new Student(2, "A", "KIM", 88, 77, 98), new Student(3, "A", "AIM", 65, 87, 99),
				new Student(4, "A", "KIM", 75, 97, 60), new Student(5, "A", "XDM", 85, 98, 90),
				new Student(6, "A", "DIM", 95, 88, 77), new Student(7, "A", "PIM", 99, 93, 95),
				new Student(8, "A", "AFM", 83, 80, 99), new Student(9, "A", "NIM", 73, 90, 80),
				new Student(10, "A", "XIM", 67, 77, 99));
		List<Student> studentsb = Arrays.asList(new Student(1, "B", "KIM", 89, 93, 94),
				new Student(2, "B", "HIM", 88, 77, 98), new Student(3, "B", "AIM", 65, 87, 99),
				new Student(4, "B", "KIM", 75, 97, 60), new Student(5, "B", "ZFM", 85, 98, 90),
				new Student(6, "B", "TIM", 95, 88, 77), new Student(7, "B", "WIM", 99, 93, 95),
				new Student(8, "B", "CIM", 83, 80, 99), new Student(9, "B", "TIM", 73, 90, 80),
				new Student(10, "B", "QIM", 67, 77, 99));
		List<Student> studentsc = Arrays.asList(new Student(1, "C", "KIM", 89, 93, 94),
				new Student(2, "C", "GIM", 88, 77, 98), new Student(3, "C", "AIM", 65, 87, 99),
				new Student(4, "C", "KIM", 75, 97, 60), new Student(5, "C", "FFM", 85, 98, 90),
				new Student(6, "C", "FGM", 95, 88, 77), new Student(7, "C", "VVM", 99, 93, 95),
				new Student(8, "C", "DDM", 83, 80, 99), new Student(9, "C", "QIM", 73, 90, 80),
				new Student(10, "C", "CIM", 67, 77, 99));
		studentMap=new HashMap<String, List<Student>>();
		studentMap.put("A", studentsa);
		studentMap.put("B", studentsb);
		studentMap.put("C", studentsc);

	}
	/*
	 *  1.전체학생출력
	 */
	public void print() {
		for(String ban:studentMap.keySet()) {
			System.out.println("---------------"+ban+" 반-------------------");
			Student.headerPrint();
			List<Student> studentBanList=studentMap.get(ban);
			for (Student student : studentBanList) {
				student.print();
			}
		}
	}
	/*
	 * 2.A(B,C)반학생출력
	 */
	public void printBan(String ban) {
		
	}
	
	/*
	 * 3.학생객체추가
	 */
	public void addStudent(Student student) {

	}

	/*
	 *4.전체학생총점,평균,평점계산
	 */
	public void calculate() {

	}
	/*
	 * 5.A(B,C)반 학생총점,평균,평점계산
	 */
	public void calculateBan(String ban) {

	}
	
	/*
	 * 6.전체학생 총점으로 전체석차계산
	 */
	public void calculateRank() {

	}
	/*
	 * 7.  A(B,C)반 학생 총점으로 반석차계산
	 */
	public void calculateBanRank() {
		
	}
	

	/*
	 * 8. 전체학생반환
	 */
	public List<Student> getStudentList() {
		return null;
	}
	/*
	 * 9.전체학생중 A(B,C)반학생반환
	 */
	public List<Student> getBanStudentList() {
		return null;
	}

	/*
	 *10.A(B,C)반 번호3번 학생한명 반환    
	 */
	public Student findByStudent(String ban,int no) {
		Student findStudent = null;

		return findStudent;
	}

	/*
	 * 11.전체학생중 학점A인 학생들 반환(List)
	 */
	public List<Student> findByGrade(char grade) {
		ArrayList<Student> findStudents = new ArrayList<Student>();

		return findStudents;
	}
	/*
	 * 11.전체학생중 학점A인 학생들  반별맵으로반환(Map)
	 */
	public Map<String,List<Student>> findByGradeByMap(char grade) {
		Map<String,List<Student>> findStudentMap = 
				new HashMap<String,List<Student>>();
		return findStudentMap;
	}
	/*
	 *12.A(B,C)반 학점A인 학생들 반환
	 */
	public List<Student> findByBanGrade(String ban,char grade) {
		ArrayList<Student> findStudents = new ArrayList<Student>();

		return findStudents;
	}
	/*
	 * 13.전체학생중 이름KIM 학생들 반환(List)
	 */
	public List<Student> findByName(String name) {
		ArrayList<Student> findStudents = new ArrayList<Student>();

		return findStudents;
	}
	/*
	 * 13.전체학생중 이름KIM 학생들 반별맵으로반환(Map)
	 */
	public Map<String,List<Student>> findByNameByMap(String name) {
		Map<String,List<Student>> findStudentMap = 
				new HashMap<String,List<Student>>();
		return findStudentMap;
	}
	/*
	 * 14.  A(B,C)반 이름KIM 학생들 반환
	 */
	public List<Student> findByBanName(String ban,String name) {
		List<Student> findStudents = new ArrayList<Student>();
		
		return findStudents;
	}

	/*
	 * 15.  A(B,C)반 학생총점으로 오름차순정렬
	 */
	public void sortByBanTotAsc() {

	}

	/*
	 8.  A(B,C)반 학생 이름순으로 오름차순정렬
	 */
	public void sortByBanNameAsc() {

	}

}