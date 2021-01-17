package net.codejava;

abstract class Bike{
	
	String title="hello";
	abstract void bhp();
 void hello()
{
	System.out.println("I love bikes");
}
 static void jump()
 {
	 System.out.print("jump");
 }
}



public class Abstraction extends Bike {

	public static void main(String[] args) {
	
		Bike b = new Abstraction();
		System.out.println(b.title);

		b.hello();
		b.bhp();
		jump();
	}

	@Override
	void bhp() {
		System.out.println("400 bhp");


		
	}

}
