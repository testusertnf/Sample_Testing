
public class Employee {
	
	String name;
	int age;
	String designation;
	double salary;
	public String surname;
    public double fullsal;
    
   
	public Employee(String name, String sur){
		this.name = name;
		this.surname= sur;
	}
	
	public void empage(int emage){
		 age= emage;
	}

	public void empDesig(String desig){
		designation = desig;
	}
	
	public void empSalary(double sal){
		salary=sal;
	}
	public void Printdetails()  {
		
		System.out.println("emp name:--"+name);
		System.out.println("emp age:--"+ age);
		System.out.println("emp disignation:--"+ designation);
		System.out.println("emp salary:--"+ salary);

	}
	public void empprint(){
		System.out.println();
	}

}
