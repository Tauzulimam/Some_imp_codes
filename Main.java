import java.util.Scanner;

class Main
{
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[3];
        System.out.print("\nHow was the array experiment:");
	String choose=scan.nextLine();
	System.out.print(choose);
	System.out.print("\nenter the values for array:");
	for(int i=0;i<3;i++)
	arr[i]=scan.nextInt();
	System.out.println("\nArray elements are:");
	for(int i=0;i<3;i++)
	System.out.print(arr[i]+" ");
	
}
}