/*
 1.주차장에서 차객체를 생성할클래스(틀)
 2.Car객체의 주소를 저장할수있는타입
   
   - 구성요소
      
      1.멤버필드(변수)선언(속성)
         접근제한자(public,proected,없는거,private) 타입 indentifier;
         ex> public String carName;
         
      2.멤버메쏘드 선언(행위)    
         접근제한자 리턴타입 메쏘드이름(매개변수목록){
             - 매개변수: 나를 호출한놈이 데이타를 넣어줄 통로
         	 - 리턴타입: 나를 호출한놈에게 줄 데이타타입 
               void --> 줄데이타가 없는경우
         }
         ex> 
         	void print(){
         		
         	}
         	
         	public int test(int a,int b){
         	  	
             }
 
 
 */

public class Car {
	/*
	 * 클래스의 구성요소
	 * 	1.멤버필드(변수)[속성]: 차객체의 속성데이타를 저장할변수
	 *  2.멤버메쏘드[기능]    : 차객체가 외부에제공하는기능
	 */
	
	
	/*
	 * 멤버 필드(변수)
	 */
	String no;	//차량번호
	int inTime;	//입차시간
	int outTime;//출차시간
	int fee;	//주차요금
	
	/*
	 * 멤버메쏘드(기능)
	 */
	
	/*
	 * 입차데이터(번호,시간)대입
	 */
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
		return;
	}
	
	/*
	 * 출차시간 멤버필드 outTime에 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
		return;
	}
	
	/*
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime) * 1000;
	}
	
	
	
	
	/*
	 * 차량정보출력
	 */
	void print() {
		System.out.printf("------------------------------------\n");
		System.out.printf("%s %s %s %s \n","차량번호", "입차시간", "출차시간", "주차요금");
		System.out.printf("------------------------------------\n");
		System.out.printf("%6s %7d %8d %9d \n", this.no,this.inTime,this.outTime,this.fee);
	}
	
}
