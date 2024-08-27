package generic;

import java.util.HashSet;
import java.util.Set;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("-------------String-----------------");
		Set<String> nameSet=new HashSet<String>();
		nameSet.add("KIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		nameSet.add("JIM");
		System.out.println("#set size:"+nameSet.size());
		System.out.println(nameSet);
		boolean isAdd = nameSet.add("KIM");
		System.out.println(">>추가여부:"+isAdd);
		System.out.println("#set size:"+nameSet.size());
		System.out.println(nameSet);
		System.out.println("------------------Wrapper(Integer)-----------");
		Set<Integer> lottSet=new HashSet<Integer>();
		while(lottSet.size() < 6) {
			boolean isadd = lottSet.add((int)(Math.random()*45+1));
			System.out.println(isadd);
		}
		System.out.println(lottSet);
	}

}