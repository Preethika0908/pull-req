import java.util.Scanner;
class factorial
{
 public static void main(String args[])
 {
   Scanner numobj = new Scanner(System.in);
   int i,n=10,fact=1;
   System.out.println("Enter a number:");
   n=numobj.nextInt(); 
   for(i=1;i<=n;i++){ 
   fact=fact*i;
   }
   system.out.println(fact);
   }
}
