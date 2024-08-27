import java.nio.file.AccessDeniedException;

public class AcademyMemberTypeCastingArrayMain {

	public static void main(String[] args) {
		AcademyMember[] members= {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "DESIGN"),
				new AcademyStudent(3, "MIM", "ANDROID"),
				new AcademyGangsa(4, "OIM", "JAVA"),
				new AcademyGangsa(5, "PIM", "ANDROID"),
				new AcademyStaff(6, "QIM", "ACCOUNTING"),
				new AcademyStaff(7, "RIM", "MARKETING")
		};
		
		AcademyMember[] recvMembers = members;
		
		System.out.println("-------------AcademyMember전체출력-------------");
		for (int i = 0; i < recvMembers.length; i++) {
			recvMembers[i].print();
		}
		System.out.println("-----------enhanced for----------");
		for (AcademyMember academyMember : recvMembers) {
			academyMember.print();
			
		}
		
		System.out.println("-----------instanceof----------");
		/*
		 * 연산자 : instanceof
		 *  - 형태  	: 참조변수 instanceof 클래스이름(type)
		 *  - 연산결과  : true or false
		 *  - ex> AcademyMember m = new AcademyStudent(1,"김","리눅스");
		 *        boolean isStudentObject = m instanceof AcademyStudent;
		 */
		AcademyMember m = new AcademyStaff(90, "스탭", "홍보");
		if(m instanceof AcademyStaff) {
			AcademyStaff tempStaff = (AcademyStaff) m;
			String depart = tempStaff.getDepart();
			System.out.println("스탭부서: "+depart);
		}
		System.out.println("-------AcademyMember배열에 있는 객체들중에 AcademyStudent 판별 후 학생반 출력------");
		for (AcademyMember academyMember : recvMembers) {
			if(academyMember instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) academyMember;
				String ban = tempStudent.getBan();
				System.out.println(">> 학생반: "+ ban);
				academyMember.print();
			}
		}
		
	}

}