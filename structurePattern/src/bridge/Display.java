package bridge;

public class Display {
    private DisplayImpl impl;	//교량 역할을 하는 추상클래스를 선언

    public Display(DisplayImpl impl) {        
    	this.impl = impl;    
    }

    public void open() {        impl.rawOpen();    }
    public void print() {        impl.rawPrint();    }
    public void close() {        impl.rawClose();    }
    public final void display() {
        open();
        print();
        close();
    }
}