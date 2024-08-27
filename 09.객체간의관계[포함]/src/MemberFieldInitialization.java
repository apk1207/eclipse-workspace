
public class MemberFieldInitialization {
	/*
	 * 1-1.인스턴스 멤버필드는 객체생성시 기본값으로 자동 초기화
	 */
	public int member1;		//0
	public double member2;	//0.0
	public char member3;	//0 ,'/u0000'
	public boolean member4;	//false
	public String member5;	//null
	public Account member6; //null
	/*
	 * 1-2.인스턴스 멤버필드선언시 초기값으로 초기화할수있다.
	 */
	
	public int member11=999;		//0
	public double member22=3.1;		//0.0
	public char member33='힣';		//0 ,'/u0000'
	public boolean member44=true;	//false
	public String member55="문자열";//null
	public Account member66=new Account(6666, "육육육", 6666, 6.6); //null
	public MemberFieldInitialization() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * 1-3.생성자초기화
	 */
	public MemberFieldInitialization(int member1, double member2, char member3, boolean member4, String member5,
			Account member6, int member11, double member22, char member33, boolean member44, String member55,
			Account member66) {
		
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member6 = member6;
		this.member11 = member11;
		this.member22 = member22;
		this.member33 = member33;
		this.member44 = member44;
		this.member55 = member55;
		this.member66 = member66;
	}
	
	
	
	
	
}