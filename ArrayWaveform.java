import java.util.Scanner;
class ArrayWaveform 
{
	public static void main(String args[])
	{   
	    //Code for taking array as an input from the user
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
		//Code for sorting the array 
		System.out.println();
		System.out.println("Array after sorting : ");
		for (int m = 0;m < n-1;m++)
			for(int j =0;j < n-m-1;j++)
				if(arr[j+1]<arr[j])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr [j]=temp;
					
				}
				for(int k : arr)
		{   
	        System.out.print(k +" ");
		}
		System.out.println();	
		System.out.println("Waveform for array : ");
		int x;
		for ( x=0;x<n-1;x +=2)
		{ int swap = arr[x];
		arr[x] = arr[x+1];
		arr[x] = swap;}
		for(int y : arr)
		{   
	        System.out.print(y +" ");
		}
	}
}