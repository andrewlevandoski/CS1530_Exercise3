import java.util.*;

/**
 *  Main class
 */
public class Main {
  /**
   *  lazyCaterer
   *
   *  @return lazy caterer calculation for n
   */
  public static int lazyCaterer(int n) {
    return ((int)Math.pow(n, 2) + n + 2) / 2;
  }

  /**
   *  triangle
   *
   *  @return triangle calculation for n
   */
  public static int triangle(int n) {
    int returnVal = 0;
    for (int i = n; i > 0; i--) {
      returnVal += i;
    }
    return returnVal;
  }

  public static void main(String[] args) {
    String input = args[0];
    int n = 0;
    if(args.length != 1) {
      System.out.println("Incorrect number of arguments (should be 1)");
      System.exit(1);
    } else {
      try {
        n = Integer.parseInt(input);
      } catch(Exception e) {
        System.out.println("Argument must be an integer");
        System.exit(1);
      }
    }

    System.out.println("Tri(" + n + ") = " + triangle(n));
    System.out.println("Lazy(" + n + ") = " + lazyCaterer(n));
	}

}
