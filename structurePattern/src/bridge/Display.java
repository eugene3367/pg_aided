package bridge;

public class Display {
	private DisplayImp1 imp1;	//교량 역할을 하는 클래스를 선언
	
	public Dispaly(DisplayImp1 imp1){
		this.imp1 = imp1;
	}
	
	public void open() { imp1.rawOpen(); }
	public void print() { imp1.rawPrint(); }
	public void close() { imp1.rawClose(); }
	public final void display(){
		open();
		Print();
		close();
	}
}
