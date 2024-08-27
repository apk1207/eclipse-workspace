
public class AcademyMemberMain {

	public static void main(String[] args) {
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "MIM", "JAVA");
		
		AcademyGangsa gs1 = new AcademyGangsa(3, "SIM", "ANDROID");
		AcademyGangsa gs2 = new AcademyGangsa(4, "JIN", "IOS");
		
		AcademyStaff sf1 = new AcademyStaff(5, "HIN", "SALES");
		AcademyStaff sf2 = new AcademyStaff(6, "GIN", "ACCOUNT");
		
		System.out.println("------------Student-----------");
		st1.studentPrint();
		st2.studentPrint();
		
		System.out.println("------------Gangsa-----------");
		gs1.gansaPrint();
		gs2.gansaPrint();
		
		System.out.println("------------Staff-----------");
		sf1.staffPrint();
		sf2.staffPrint();
		
	}

}
