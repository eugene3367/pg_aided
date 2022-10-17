package bridge;

import java.util.Random;

public class RandomCountDisplay {
	private Random random = new Random();
	
	public RandomCountDisplay(DisplayImp1 imp1){
		Super(imp1);
	}
	
	public void randomDisplay(int times){
		MultiDisplay(random.nextInt(times));
	}
}
