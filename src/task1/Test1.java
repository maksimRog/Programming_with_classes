package task1;

public class Test1 {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "a is " + a + "\n b is " + b;
	}

	public  int countSum() {
		return a+b;
	}

	public  int findMax() {
		if (a > b) {
			return a;
		} else
			return b;
	}
}
