/*
 난 절대로 자식클래스타입을 사용안할래요 
 난 부모타입[GajumOnOff,GajunVolume] 만사용할래요 
 그래야 가전제품검사 프로그램을
 한번만들어서 변경없이 계속사용할수있으니까요~~~
 */
public class GajunGumsa {
	
	private GajunOnOff[] gajuns;
	
	public GajunGumsa() {
	}	
	
	public GajunGumsa(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
	public void gumsa() {
		for (GajunOnOff gajunOnOff : gajuns) {
			gajunOnOff.on();
			GajunVolume tempGajun = (GajunVolume) gajunOnOff;
			tempGajun.up();
			tempGajun.down();
			gajunOnOff.off();
			System.out.println("---------검사끝 출고----------");
		}
	}
	
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
}
