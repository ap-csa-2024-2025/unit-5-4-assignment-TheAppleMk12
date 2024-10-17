public class Main
{
  public static void main(String[] args)
  {
    System.out.println(distance(3, 3, 6, 7));
    System.out.print(quadrticFormula(-4, 6, 2));
  }

  // Implement distance formula method here
  public static String distance(int a, int b, int c, int d)
  {
    int x = c - a;
    int y = d - b;
    x *= x;
    y *= y;

    int z = x+y;
    z = (int)Math.sqrt(z);

    String output = "The distance is " + z;
    return output;
  }
  // implement one of your quadratic formula methods here
  public static String quadrticFormula(double a, double b, double c)
  {
    double z = (b*b) -(4*a*c);
    z = -b + Math.sqrt(z);
    z /= 2*a;

    String sol1 = "Solution 1: " + z + "\n";

    double y = (b*b) -(4*a*c);
    y = -b - Math.sqrt(y);
    y /= 2*a;

    String sol2 = "Solution 2: " + y;
    String output = sol1 + sol2;
    return output;
  }
}
