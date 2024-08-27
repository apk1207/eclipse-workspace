
public class EmployeePayPrintFinalMain {

	public static void main(String[] args) {
		/*
		Employee e1=new SalaryEmployee(1, "KIM", 50000000);
		Employee e2=new HourlyEmployee(2,"SIM",100,15000);
		*/
		System.out.println(">>인센티브기준페이:"+Employee.INCENTIVE_PAY);
		System.out.println(">>인센티브율:"+Employee.INCENTIVE_RATE);
		
		
		Employee[] employees= {
			new  SalaryEmployee(1,"김미진",50000000),	
			new  SalaryEmployee(2,"김민섭",10000000),	
			new  SalaryEmployee(3,"김수환",12000000),	
			new HourlyEmployee(4, "최인호", 100, 20000),
			new HourlyEmployee(5, "최기창", 10, 30000)
		};
		
		for(Employee employee:employees) {
			employee.calculatePay();
			double tempIncentive = employee.calculateIncentive();
			System.out.println("----------"+employee.getName()+" 님 급여 명세표 ---------");
			employee.print();
			System.out.println("\t인센티브:"+tempIncentive);
			System.out.println("-----------------------------------------");
			System.out.println();
		}

	}

}