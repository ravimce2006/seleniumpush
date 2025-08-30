package day2;

class A {

     void display()
     {
    	 System.out.println("Base clase");
     }
}
class B extends  A
{
	void show() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
        		// TODO Auto-generated method stub

		B obj=new B();
		obj.display();
		obj.show();
	}
}

