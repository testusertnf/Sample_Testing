
public class Examples {

	int Exage;

	public Examples(String name){
		System.out.println("Name is Set as:" +name);
	}
	
	public void setAge(int age){
		Exage = age;
	}
	
	public int getAge(){
		
		System.out.println("Age is Set as:--"+Exage);
		return Exage;
	}
	
	public void pupage(){
		int age =0;
		age= age+7;
		System.out.println("The Age is :--" +age);
	}
	
	public static void main(String[] args) {
	
		Examples example= new Examples("Raju");
		
		example.setAge(5);
		
		example.getAge();
		
		System.out.println("Variable value is:--"+ example.Exage);
		
		/*Examples test=new Examples();
		test.pupage();*/

	}

}
