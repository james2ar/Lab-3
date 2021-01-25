import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n;
    
    System.out.println("Enter a number to count down or up from:");
    n = s.nextInt();

    if (n > 0)
    while (n > 0)
    {System.out.println(n);
    n--;
    }
    else if (n < 0)
    while (n < 0)
    {System.out.println(n);
    n++;
    }

    System.out.println("Blast off!");


  }
}
