package markerinterface;

public class Driver {

	public static void main(String[] args) {

		Student gauri = new Student();
		Teacher t1 = new Teacher();
		 
		
		if(t1 instanceof Registerable)
		{
			System.out.println("Student is registered");
		}
		else
		{
			System.out.println("Student is not Registered");
		}
		
		
	}

}