
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("----------MermaidPrincess-----------");
		MermaidPrincess mermaidPrincess = new MermaidPrincess();
		mermaidPrincess.speak();
		mermaidPrincess.think();
		mermaidPrincess.liveSea();
		mermaidPrincess.fastSwim();
		System.out.println("----------Mermaid----------------");
		Mermaid mermaid = mermaidPrincess;
		
		/*
		 mermaid.speak();
		 mermaid.think();
		 */
		
		mermaid.liveSea();
		mermaid.fastSwim();
		System.out.println("----------Princess----------------");
		Princess princess = mermaidPrincess;
		princess.speak();
		princess.think();
		
		/*
		princess.liveSea();
		princess.fastSwim();
		*/
		System.out.println("----------Mermaid <---> Princess----------------");
		Mermaid mermaid2 = new MermaidPrincess();
		mermaid2.liveSea();
		mermaid2.fastSwim();
		Princess princess2 = (Princess) mermaid2;
		princess2.speak();
		princess2.think();
		
		
	}

}
