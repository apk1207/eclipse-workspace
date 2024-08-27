import java.util.Date;

public class ObjectChildOverridingMain {
	
	public static void main(String[] args) {
		ObjectChild oc = new ObjectChild();
		String str = oc.toString();
		System.out.println(str);
		
		Date now = new Date();
		String dateStr = now.toString();
		System.out.println(dateStr);
		
	}
}
