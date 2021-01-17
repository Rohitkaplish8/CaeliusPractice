package net.codejava;

public class FoodItems implements ListOfItems,SportsEquipment {

	public static void main(String[] args) {
		
		FoodItems f = new FoodItems();
		f.bread();
	f.football();
		
		ListOfItems a = new FoodItems();
		a.coffee();
		
		
	}

	@Override
	public void jam() {
	System.out.println("jam");
		
	}

	@Override
	public void tea() {
		System.out.println("tea");		
	}

	@Override
	public void coffee() {
		System.out.println("coffee");		
	}

	@Override
	public void soup() {
		System.out.println("soup");		
	}

	@Override
	public void bread() {
		System.out.println("bread");		
	}

	@Override
	public void cricket() {
		System.out.println("cricket");		
		
	}

	@Override
	public void football() {
		System.out.println("football");		
		
	}

	@Override
	public void basketball() {
		System.out.println("basketball");		
		
	}

	@Override
	public void hockey() {
		System.out.println("hockey");		
		
	}

	

}
