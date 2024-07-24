package episode;

public class LocalVariable {
	
	int c;
	
	void subTwoNumbers(int a, int b) {
		int c = 30;
		System.out.println(c);
		System.out.println(a-b-this.c);
	}
	public static void main(String[] args) {
		LocalVariable Lv = new LocalVariable();
		Lv.subTwoNumbers(15,10);
	}
}
