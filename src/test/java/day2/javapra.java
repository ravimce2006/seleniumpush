package day2;

public class javapra {
	
	
	int id=23;
	String name="ravi";
	static String company="TCS";
	/*javapra(int id,String name)
	{
		this.id=id;
		this.name=name;
	}*/
	static void display(){
		System.out.println(company);
	}
	void display1() {
		System.out.println("function 2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javapra obj=new javapra();
		System.out.println(javapra.company);
		javapra.display();
		obj.id=12;
		obj.name="ravi";
		System.out.println(obj.id+"----"+obj.name);
		obj.display1();
		
		
		
	}

}
