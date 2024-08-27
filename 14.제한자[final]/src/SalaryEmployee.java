public class SalaryEmployee extends Employee {
	private int annualSalary;//연봉
	public SalaryEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SalaryEmployee(int no,String name, int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}
	/*
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t"+this.pay+"\t");
	}
	*/
	@Override
	public void print() {
		super.print();
		System.out.println(this.annualSalary);
	}

	@Override
	public void calculatePay() {
		int calcPay=this.annualSalary/12;
		this.setPay(calcPay);
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}