
public class EmployeeTest {

	private static double salary;
	public static final String DEPARTMENT="Developement";
	
	public static void main(String[] args) {
		int x=10;
		Employee empone= new Employee("Vijay", "ravi");
		Employee emptwo= new Employee("Samuel", "rajeev");
		
		empone.empage(28);
		empone.empDesig("Manager");
		empone.empSalary(30000);
		empone.Printdetails();
		empone.empage(28);
		empone.empDesig("Gneral Manager");
		empone.empSalary(30000);
		empone.Printdetails();
		
		emptwo.empage(31);
		emptwo.empDesig("IT-Tech");
		emptwo.empSalary(35000);
		emptwo.Printdetails();
        salary=100000;
        System.out.println("Dept: "+DEPARTMENT+"> average salary--:"+salary );
        
        /*while(x<=20){
      
        	System.out.println(x);
        	 x++;
        }*/
        
        do{
        	System.out.println(x);
        	x++;
        }while(x<20);
        
        for(int i=10; i<=20; i++){
        	System.out.println(i);
        }
	}

}
