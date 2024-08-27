package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService = new AcademyMemberService();
		
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findNoMember = academyMemberService.findByNo(1);
		findNoMember.print();
		
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember findNameMember = academyMemberService.findByName("KIM");
		findNameMember.print();
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStudentMembers = academyMemberService.findByStudentMember();
		for(AcademyMember member : findStudentMembers) {
			member.print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStaffMembers = academyMemberService.findByStaffMember();
		for(AcademyMember member : findStaffMembers) {
			member.print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findGangsaMembers = academyMemberService.findByGangsaMember();
		for(AcademyMember member : findGangsaMembers) {
			member.print();
		}
		
		
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findStudentBanMembers = academyMemberService.findByStudentBanMember("자바");
		for(AcademyMember member : findStudentBanMembers) {
			member.print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findStaffBuseoMembers = academyMemberService.findByStaffBuseoMember("영업");
		for(AcademyMember member : findStaffBuseoMembers) {
			member.print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findGangsaClassMembers = academyMemberService.findByGangsaSubjectMember("프로그래밍");
		for(AcademyMember member : findGangsaClassMembers) {
			member.print();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		
	}

}