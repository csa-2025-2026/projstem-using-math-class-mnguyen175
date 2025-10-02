import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        
        int N;
        System.out.println("What is your upper bound?");
        N = scan.nextInt();
        printRandom3(N);
    }
    
    public static void printRandom3(int num)
    {
        // Random whole numbers between a and b 
        // (int) (Math.random() * (b-a+1) + a);
        int lowerBound = 2; 
        int upperBound = num + 2; 
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound)); 
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound)); 
        System.out.println( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound)); 
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        System.out.println("Enter x1, x2, y1, y2");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("Slope: " + calcSlope(x1, x2, y1, y2));
        return 0.0;
    }
    
    public static int roundedDist(double a, double b)
    {
        System.out.println("Enter two doubles");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println("Distance: " + roundedDist(d1, d2));
        return 0;
    }
}
