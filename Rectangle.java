import java.util.Scanner;
class Rectangle 
{
	public static void main(String args[])
	{   
	    int area;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Specify the length and breadth of the Rectangle : ");
		int l = sc.nextInt();
        int b = sc.nextInt();
	    area = l * b;
		System.out.println("The area of the defined rectangle will be : "+area);
	}
}