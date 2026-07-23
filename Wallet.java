import java.util.Scanner;

class Value
{
private static float gold_value=12100f;
private static float balance_gold;
private static float Amount;
Scanner scan=new Scanner(System.in);

void top()
{
System.out.print("Enter the amount to top up the wallet:");
float amount=scan.nextFloat();
System.out.println("Current gold value for 1g:"+gold_value);
balance_gold=balance_gold+(amount/gold_value);
Amount=Amount+amount;
System.out.println("Your total gold is: "+balance_gold+"g");
System.out.println("Your total balance in INR is: "+Amount);
}

void change()
{
System.out.print("Enter the current gold price:");
float current_value=scan.nextFloat();
//if(current_value>gold_value)

gold_value=current_value;
Amount=balance_gold*gold_value;

//System.out.println("Your total gold is: "+balance_gold+"g");
//System.out.println("Your total balance in INR is: "+Amount);
}

void balance()
{
System.out.println("Your total gold is: "+balance_gold+"g");
System.out.println("Your total balance in INR is: "+Amount);
}
//End of class
}

class Wallet
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Value vob=new Value();
int choice;
do
{
System.out.print("\n1.Top-Up \n2.Check Balance \n3.Change in gold price \n4.Exit \nEnter your choice:");
choice=scan.nextInt();
switch(choice)
{
case 1:vob.top();
	break;
case 2:vob.balance();
	break;
case 3:vob.change();
	break;
case 4:System.out.print("Exiting.......");
	break;
default:System.out.print("Enter a valid option");
	break;
}
}while(choice!=4);
}

//End
}