
public class ObjectChildMain {

	public static void main(String[] args) {
		ObjectChild oc1 = new ObjectChild();
		String returnStr = oc1.toString();
		System.out.println(returnStr);
		int hashCode1 = oc1.hashCode();
		System.out.println(hashCode1);
		
		ObjectChild oc2 = new ObjectChild();
		String returnStr2 = oc2.toString();
		System.out.println(returnStr2);		
		int hashCode2 = oc2.hashCode();
		System.out.println(hashCode2);
		
		
	}

}
