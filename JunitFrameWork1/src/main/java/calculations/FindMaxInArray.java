package calculations;

public class FindMaxInArray {
	
	public static int findMaxInArray(int a[])
	{
		int g = a[0];
		int i;
		for(i=1;i<a.length;i++)
		{
			if(g < a[i])
				g=a[i];
		}
		return g;
	}
}
