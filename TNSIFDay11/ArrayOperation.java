package TNSIFDay11;

public class ArrayOperation {
	
	int intArray[];

	public ArrayOperation() {
		super();
	}

	public ArrayOperation(int[] intArray) {
		super();
		this.intArray = intArray;
	}
	
	
	public void displayArray()
	{
		for(int no:intArray)  
		{
			System.out.println("The array elements are : "+ no);
		}
	}
	
	public int getElement(int position)
	{
		return intArray[position];
	}

}