package chainOfResponsibility;

public class ChainOfResposibilityEx {

	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob",100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new Limitsupprt("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo);
		
		for(int i=0; i<500;i+=33){
			alice.support(new Trouble(i));
		}

	}

}
