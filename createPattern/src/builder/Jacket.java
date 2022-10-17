package builder;
//Builder Pattern : 빌더라고 하는 내부 클래스를 통해서 간접적으로 인스턴스를 생성하게 하는 패턴
public class Jacket {
	int number;
	String name;
	double size;
	
	private Jacket(int number, String name, double size) {
		this.number = number;
		this.name = name;
		this.size = size;
	}
	
	public static class Builer {
		int number = 0;
		String name = null;
		double size = 0.0;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	

}
