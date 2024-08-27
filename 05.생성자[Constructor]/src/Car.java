

public class Car {
	
	private String no;	//차량번호
	private int inTime;	//입차시간
	private int outTime;//출차시간
	private int fee;	//주차요금
	
	/*
	 * 입차데이타(번호,시간)대입
	 */
	public void setIpChaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
		return;
	}
	/*
	 * 출차시간 멤버필드 outTime에 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	/*
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime-this.inTime)*1000;
	}
	
	public void headerPrint() {
		System.out.printf("-----------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("-----------------------------------\n");
	}
	
	/*
	 * 차량정보출력
	 */
	public void print(){
	
		System.out.printf("%6s %8d %8d    ₩ %4d\n" , this.no,this.inTime,this.outTime,this.fee);
		return;
	}
	
	//getter,setter
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	
}