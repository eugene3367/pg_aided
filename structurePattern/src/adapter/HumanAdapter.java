package adapter;

public class HumanAdapter extends Human implements Student{
	public HumanAdapter(String name, int age){
		super(name, age);
	}

	@Override
	public void showName() {
		printName();
		
	}

	@Override
	public void showAge() {
		printAge();
		
	}
	
	
}
