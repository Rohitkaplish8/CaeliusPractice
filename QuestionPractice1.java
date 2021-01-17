package net.codejava;

interface One 
{
	public void Jump();
	public void eat();
	public void fight();
	
}


abstract class Two implements One
{
	abstract void sleep();
	 public void fight() {
			System.out.println("fight");

	}

}


public class QuestionPractice1 extends Two {

	public static void main(String[] args) {
		
		QuestionPractice1 qp= new QuestionPractice1();
		qp.sleep();
		qp.eat();
		qp.Jump();
		qp.fight();

	}

	@Override
	public void Jump() {
		
		System.out.println("jump");
	}

	
	@Override
	public void eat() {

		System.out.println("eat");
		
	}

	@Override
	void sleep() {

		System.out.println("sleep");
		
	}

}
