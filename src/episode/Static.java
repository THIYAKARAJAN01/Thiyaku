package episode;

public class Static {
	
	int x=0;
	static int y=0;
	
	void counter() {
		
		x++;
		y++;
		
		System.out.println("non-static ==>" + x + " static ==>"+ y);
		
	}

	public static void main(String[] args) {
		
		Static St = new Static();
		St.counter();
		St.counter();
		System.out.println("repeated again");
		Static St2 = new Static();
		St2.counter();
		St2.counter();
		Static St3= new Static();
		St3.counter();
		St3.counter();
		St3.counter();
	}
}
