import java.util.Scanner;

class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the n value:");
int n=sc.nextInt();
System.out.print("Prime number from 2 to "+n+" are:\n");
for(int i=2;i<=n;i++)
{
if(isPrime(i))
System.out.print(i+" ");
}
}

static boolean isPrime(int num)
{
for(int i=2;i*i<=num;i++)
{
if(num%i==0)
return false;
}
return true;
}	//End of prime method

}//End oof main