import java.util.Scanner;
public class Circle
{
    public static void main(String args[])
    {
        System.out.print('\f');
        float rad;
        double pi = 3.14;
        System.out.println("Enter Radius: ");
        Scanner in = new Scanner(System.in);
        rad = in.nextFloat();
        CalcArea(rad,pi);
        CalcPeri(rad,pi);
        System.out.println();
    }
    public static void CalcArea(float Rad, double pi)
    {
        double Area;
        Area = pi * Rad * Rad;
        System.out.println("Area of Circle: " + Area);
    }
    public static void CalcPeri(float Rad, double pi)
    {
        double Peri;
        Peri = 2 * pi * Rad;
        System.out.println("Circumference of Circle: " + Peri);
    }
}