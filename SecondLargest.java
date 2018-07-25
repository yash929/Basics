import java.util.Scanner;
class SecondLargest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
	    int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i : arr)
		{   
	        System.out.print(i +" ");
		}
		System.out.println();
		int f_largest = arr[0],s_largest = arr[0];
		for(int m=1;m<n;m++)
		{
			if(arr[m]>f_largest)
			{
				s_largest = f_largest;
				f_largest = arr[m];
			}
		}
		System.out.println("The second largest integer is : "+s_largest);
	}
}
		
		