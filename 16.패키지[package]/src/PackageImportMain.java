/*
      package 
      1. 관련있는(업무) 클래스의 모음(패키지)
      2. 패키지의 이름은 계층적으로 큰범위부터작은범위로구성  
      3. 클래스의 완전한이름은 패키지를 포함한이름이다.
      4. 이름충돌을 피하기위해서 
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile 방법 
			>javac -d . XXX.java  	
*/
import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.product.Product;
/*
<<The import com.itwill.shop.admin.Product collides with another import statement>>
import com.itwill.shop.admin.Product;
 */
import com.itwill.shop.product.ProductService;


public class PackageImportMain {

	public static void main(String[] args) {
		/*
		 * import 단축키
		 * ctrl + shft + o
		 */
		
		ShopService shopServiece = new ShopService();
		System.out.println(shopServiece);
		
		Member member = new Member();
		System.out.println(member);
		
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		
		System.out.println("----------com.itwill.shop.product, com.itwill.shop.product.productService---------");
		Product shopProduct = new Product();
		System.out.println(shopProduct);
		
		ProductService shopProductService = new ProductService();
		System.out.println(shopProductService);
		
		System.out.println("----------com.itwill.shop.admin, com.itwill.shop.admin.productService---------");
		com.itwill.shop.admin.Product adminProduct = new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		
		com.itwill.shop.admin.ProductService adminProductService = new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		
		
		
	}

}