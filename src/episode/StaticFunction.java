package episode;

public class StaticFunction {
	
	void eat(){
		System.out.println("Are you eat food");
	}
	public static void  sleep() {
		System.out.println("Dj is sleeping");
	}
	
	public static void main(String[] args) {
		
		
		String a = "10";
		String b = "20";
		// static string vachi int try panrathu
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
        System.out.println(c+d);
        
		StaticFunction Ts = new StaticFunction();
		Ts.eat();
		sleep();
		
		// TODO Auto-generated method stub

	}

}
