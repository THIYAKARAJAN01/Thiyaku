package episode;

public class Constructor {
	
	public Constructor(int x , String s , float y) {
		this.x = x;
		this.name = s;
		this.y = y;
	}

	int x;                      
	String name;
	float y;
	
	void display() {
		System.out.println( y +"--->" + x + "---->" + name);
	}
	public static void main(String[] args) {
		
		Constructor Cs = new Constructor(100, "hi", 121);
		Cs.display();
		Constructor Cs1 = new Constructor(1000, "Thiyaku" , 152);
		Cs1.display();
	}

}
