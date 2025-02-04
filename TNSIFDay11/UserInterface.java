package TNSIFDay11;

public class UserInterface {

	public static void main(String[] args) {

		ArrayOperation obj = new ArrayOperation(new int[] {2, 4, 5,6});
		obj.displayArray();
		
		try {
			System.out.println("the element is : "+ obj.getElement(2));
			System.out.println("The element is : "+ obj.getElement(10));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error!...."+ e.getMessage());
		}
		
	}

}