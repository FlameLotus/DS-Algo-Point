import java.util.*;

class PrimeNumber
{
   void main()
   {
   int a;
   System.out.println("Please enter a number:");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   if(a%2==0)
   System.out.println(a + " is a prime number);
   else
   System.out.println(a + " is not a prime number);
   }
}


