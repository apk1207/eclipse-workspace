package lang;

public class ObjectMain {

	public static void main(String[] args) {
			Object o1=new Object();
			Object o2=new Object();
			Object o3=o1;
			System.out.println("------------toString-----------");
			/*
			public String toString()
				Returns a string representation of the object.
			 */
			System.out.println(o1.toString());
			System.out.println(o2.toString());
			System.out.println(o3.toString());
			System.out.println("--------------equals---------------");
			/*
			 public boolean equals(Object obj);
				- Indicates whether some other object is "equal to" this one.
			    - 주소가 동일한지비교
				 Parameters:
					obj - the reference object with which to compare.	
				 
				 Returns:
					true if this object is the same as the obj argument; false otherwise.
			 */
			if(o1.equals(o2)) {
				System.out.println("o1과 o2의 주소가 동일하다[equals]");
			}else {
				System.out.println("o1과 o2의 주소가 동일하지않다.[equals]");
			}
			if(o1.equals(o3)) {
				System.out.println("o1과 o3의 주소가 동일하다.[equals]");
			}else {
				System.out.println("o1과 o3의 주소가 동일하지않다.[equals]");
			}
			
			if(o1==o2) {
				System.out.println("o1과 o2의 주소가 동일하다[==]");
			}else {
				System.out.println("o1과 o2의 주소가 동일하지않다.[!=]");
			}
			if(o1==o3) {
				System.out.println("o1과 o3의 주소가 동일하다.[==]");
			}else {
				System.out.println("o1과 o3의 주소가 동일하지않다.[!=]");
			}

	}

}