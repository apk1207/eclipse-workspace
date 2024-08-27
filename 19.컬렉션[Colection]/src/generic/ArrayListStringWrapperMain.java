package generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("----------------String-------------");
		List<String> nameList=new ArrayList<String>();
		System.out.println("---------1.add---------");
		nameList.add("KIM");
		nameList.add("JIM");
		nameList.add("SIM");
		nameList.add("AIM");
		nameList.add(new String("TIM"));
		nameList.add("BIM");
		nameList.add("FIM");
		System.out.println("#size:"+nameList.size());
		System.out.println(nameList);
		System.out.println("---------2.get---------");
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(6));
		System.out.println("---------3.remove(index)---------");
		System.out.println(nameList.remove(3));
		System.out.println("#size:"+nameList.size());
		System.out.println(nameList);
		System.out.println("---------4.remove(element)---------");
		/*
		Removes the first occurrence of the specified element from this list,if it is present
		 */
		boolean isRemove=nameList.remove("KIM");
		System.out.println(">> 삭제성공여부:"+isRemove);
		System.out.println(nameList);
		
		System.out.println("-----------------Wrapper-----------------");
		List<Integer> scoreList=new ArrayList<Integer>();
		System.out.println("---------------1.add------------");
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(new Integer(45));
		scoreList.add(78);
		scoreList.add(89);
		scoreList.add(99);
		System.out.println(scoreList);
		System.out.println("---------------2.get------------");
		int getScore = scoreList.get(2);
		System.out.println(getScore);
		System.out.println("---------------3.set------------");
		scoreList.set(1, 100);
		System.out.println(scoreList);
		System.out.println("---------------4.remove------------");
		scoreList.remove(5);
		System.out.println(scoreList);
		scoreList.remove(new Integer(90));
		System.out.println(scoreList);
		
	}

}