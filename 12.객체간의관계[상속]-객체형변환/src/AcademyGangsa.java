public class AcademyGangsa extends AcademyMember{
	public String subject;//과목
	public AcademyGangsa() {
		// TODO Auto-generated constructor stub
	}
	public AcademyGangsa(int no,String name,String subject) {
		super(no, name);
		this.subject = subject;
	}
	public void print() {
		super.print();
		System.out.println( this.subject);
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}