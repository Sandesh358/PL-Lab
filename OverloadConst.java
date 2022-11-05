import java.util.*;
class Overload
{
    Overload(float x)
    {
        System.out.println("The area of square is " + Math.pow(x, 2) + " sq units");
    }

    Overload(float x, float y)
    {
        System.out.println("The area of rectangle is " + x * y + " sq units");
    }

    Overload(float x, float y, float n)
    {
	double p = 0.5*n;
	double m = x*y;
	double r = m * p;
        System.out.println("The area of triangle is " + r + " sq units");
    }

    Overload(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of circle is " + z + " sq units");
    }

}

class OverloadConst
{
public static void main(String args[])
    {
	System.out.println("Name : Sayali ");
	System.out.println("Roll No. : 20141244");
	System.out.println("Batch : I3");
	System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length and breadth of rectangle:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter radius of circle:");
        double r = input.nextDouble();

        System.out.print("Enter side of square:");
        int s = input.nextInt();
        
	System.out.print("Enter hieght and breadth of triangle:");
        int a = input.nextInt();
        int b = input.nextInt();
	int n = 1;

        Overload ob1 = new Overload(s);
        Overload ob2 = new Overload(num1, num2);
        Overload ob3 = new Overload(r);
	Overload ob4 = new Overload(a, b, n);
    }
}