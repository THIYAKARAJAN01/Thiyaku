package ifladder;

public class Ifelse {

	public static void main(String[] args) {
		
		String attendance = "On duty";
		int percentage = 75;
		
		if(attendance == "present") {
			
			System.out.println("done");
			
		}
		else if(attendance == "On duty")
		{
			if(percentage == 75)
			{
				System.out.println("super");
			}
			
			System.out.println("working");
		}
		else {
			System.out.println("Not done");
		}
		// TODO Auto-generated method stub

	}

}