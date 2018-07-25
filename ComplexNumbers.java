class Complex
{
	int real_part;
	int imaginary_part;
	Complex(int real_part,int imaginary_part)
	{
		this.real_part = real_part;
		this.imaginary_part = imaginary_part;
	}
	void Display()
	{
		System.out.println("The complex number is : "+real_part+" +"+" "+imaginary_part+"i");
	}
}
class ComplexNumbers
{
	public static void main(String args[])
	{
		Complex n = new Complex(7,8);
		n.Display();
	}
}