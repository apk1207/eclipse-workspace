package lang;

public class StringMain {

	public static void main(String[] args) {
		System.out.println("------------String.length()------------");
		String str1 = "Have a nice day!!!";
		String str2 = "오늘은 월요일 String 클래스를 공부해요";

		System.out.println(str1.length());
		System.out.println(str2.length());
		String emptyStr = "";
		System.out.println("empty string length:" + emptyStr.length());
		String id = null;
		if (id == null || id.equals("")) {
			System.out.println("아이디를 입력하세요~~~");
		}
		System.out.println("-----------charAt()---------------");
		String userId="testST&*%$$#@%@&543594";
		char firstChar=userId.charAt(0);
		char lastChar=userId.charAt(userId.length()-1);
		System.out.println(">>아이디의 첫문자는 영문대(소)문자여야한다");
		System.out.println(">>아이디의 영문대(소)문자,숫자 여야한다");
		if((firstChar>='a' && firstChar<='z') ||(firstChar>='A' && firstChar<='Z')) {
			System.out.println(firstChar+" 는 아이디의첫글자로 유효합니다.");
		}else {
			System.out.println(firstChar+" 는 아이디의첫글자로 유효안합니다.");
		}
		System.out.println("--------[Quiz]userId의 유효성체크---------");
		for(int i=0;i<userId.length();i++) {
			char tempChar=userId.charAt(i);
			System.out.print(tempChar+" ");
		}
		System.out.println();
		System.out.println("---------------substring()-------------------");
		/*
		System.out.println("Have a nice day!!!".substring(0));
		System.out.println("Have a nice day!!!".substring(1));
		System.out.println("Have a nice day!!!".substring(2));
		System.out.println("Have a nice day!!!".substring(3));
		System.out.println("Have a nice day!!!".substring(4));
		System.out.println("Have a nice day!!!".substring(5));
		System.out.println("Have a nice day!!!".substring(6));
		*/
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("오늘은 월요일 String 클래스를 공부해요".substring(4));
		System.out.println("오늘은 월요일 String 클래스를 공부해요".substring(4,7));
		System.out.println("-------------------indexOf------------------");
		String email="guard@gmail.com";
		int atSignPosition = email.indexOf("@");
		int dotPosition = email.indexOf(".");
		System.out.println("@ -->"+atSignPosition);
		System.out.println(". -->"+dotPosition);
		System.out.println(email.substring(0, atSignPosition));
		System.out.println(email.substring(atSignPosition+1));
		System.out.println("-------------split---------------");
		String phoneNumber="010-524-3267";
		String[] phoneNoArray = phoneNumber.split("-");
		for (String splitNo : phoneNoArray) {
			System.out.println(splitNo);
		}
		System.out.println("-------------replace()--------");
		String str3="자바는 객체지향언어입니다. 우리는 자바를 공부합니다.";
		System.out.println(str3.replace("자", "멀"));
		System.out.println(str3.replace("자바", "JAVA"));
		System.out.println("--------toUpperCase,toLowerCase--------");
		System.out.println("java".toUpperCase());
		System.out.println("JAVA".toLowerCase());
		System.out.println("JaVa".toLowerCase());
		System.out.println("equals           --> " + "java".equals("JAVA"));
		System.out.println("equalsIgnoreCase --> " + "java".equalsIgnoreCase("JAVA"));
		System.out.println("-----------startsWith--------------");
		String[] names= {"정경호","김미숙","최경녀","김은희","신명숙","김건수","정수근"};
		for (String name : names) {
			if(name.startsWith("김")) {
				System.out.println(name);
			}
		}
		/*
		 * 김씨를찾아서 새로운배열에 담아보세요
		 */
		int count=0;
		for (String name : names) {
			if(name.startsWith("김")) {
				count++;
			}
		}
		String[] kimArray=new String[count];
		int index=0;
		for (String name : names) {
			if(name.startsWith("김")) {
				kimArray[index]=name;
				index++;
			}
		}
		System.out.println("------------kim-------------");
		for (String kimName : kimArray) {
			System.out.println(kimName);
		}
		System.out.println("-------------endsWith---------");
		String[] fileNameArray= {"rabbit.jpg","man.gif","tiger.txt","Test.java","address.doc"};
		for (String fileName : fileNameArray) {
			if(fileName.endsWith(".jpg") || fileName.endsWith(".gif")) {
				System.out.println(">> 이미지파일:"+fileName);
			}
		}
		System.out.println("---------trim[공백제거]------------");
		String id2=" guard   ";
		System.out.println(id2);
		System.out.println(id2.length());
		System.out.println(id2.trim());
		System.out.println(id2.trim().length());
		
		String chatMessage="                  ";
		if(chatMessage.trim().equals("")) {
			System.out.println("전송안함1");
		}
		if(chatMessage.trim().length()==0) {
			System.out.println("전송안함2");
		}
		
		
		
	}

}