package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (AcademyMember member : members) {
			member.print();
		}
	}
	
	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember tempMember = null;
		for ( AcademyMember member : members) {
			if(member.getNo() == no) {
				tempMember = member;
				break;
			}
		}
		return tempMember;
	}
	
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember findByName(String name) {
		AcademyMember tempMember = null;
		for ( AcademyMember member : members) {
			if(member.getName().equals(name)) {
				tempMember = member;
				break;
			}
		}
		
		return tempMember;
	}
	
	
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByStudentMember() {
		int count = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStudent) {
				count++;
			}
		}
		AcademyMember[] tempMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStudent) {
				tempMembers[index] = member;
				index++;
			}
		}

		return tempMembers;
	}
	/*
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByStaffMember() {
		int count = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStaff) {
				count++;
			}
		}
		AcademyMember[] tempMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStaff) {
				tempMembers[index] = member;
				index++;
			}
		}

		return tempMembers;
	}
	
	
	
	
	/*
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByGangsaMember() {
		int count = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyGangsa) {
				count++;
			}
		}
		AcademyMember[] tempMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyGangsa) {
				tempMembers[index] = member;
				index++;
			}
		}

		return tempMembers;
	}
	

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 */
	public AcademyMember[] findByStudentBanMember(String ban) {
		int count = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStudent) {
				AcademyStudent tempMembers = (AcademyStudent) member;
				if(tempMembers.getBan().equals(ban)) {
					count++;
				}
			}
		}
		AcademyMember[] tempMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStudent) {
				AcademyStudent tempStudents = (AcademyStudent) member;
				if(tempStudents.getBan().equals(ban)) {
					tempMembers[index] = member;
					index++;
				}
			}
		}
		
		
		return tempMembers;
	}
	
	
	
	/*
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 */
	public AcademyMember[] findByStaffBuseoMember(String depart) {
		int count = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStaff) {
				AcademyStaff tempMembers = (AcademyStaff) member;
				if(tempMembers.getDepart().equals(depart)) {
					count++;
				}
			}
		}
		AcademyMember[] tempMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyStaff) {
				AcademyStaff tempSaffs = (AcademyStaff) member;
				if(tempSaffs.getDepart().equals(depart)) {
					tempMembers[index] = member;
					index++;
				}
			}
		}
		
		
		return tempMembers;
	}
	/*
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findByGangsaSubjectMember(String subject) {
		int count = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyGangsa) {
				AcademyGangsa tempMembers = (AcademyGangsa) member;
				if(tempMembers.getSubject().equals(subject)) {
					count++;
				}
			}
		}
		AcademyMember[] tempMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if(member instanceof AcademyGangsa) {
				AcademyGangsa tempGangsas = (AcademyGangsa) member;
				if(tempGangsas.getSubject().equals(subject)) {
					tempMembers[index] = member;
					index++;
				}
			}
		}
		
		
		return tempMembers;
	}
	
	
	
	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

}