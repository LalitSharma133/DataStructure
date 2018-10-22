package array;

public class DisplayArray {
	
	static DisplayArray  display = null;
	
	private DisplayArray()
	{
	}
	
	public static DisplayArray getDisplayInstance()
	{
		return display = new DisplayArray();
	}
	
	public void displayArray(int[] a, int i, int length)
	{
		if(i==length)
			  return;
		  else
		  {
			  System.out.println("Element present in array on "+ i + " location is " + a[i]);
			  displayArray(a,i+1,length);
		  }
	}
	
	

}
