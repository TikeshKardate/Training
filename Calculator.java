import java.util.*;
public class Calculator
{
public static void main (String [] args)
{
Scanner sc= new Scanner (System.in);
System.out.println ("Enter First Number:");
int a=sc.nextInt();
System.out.println ("Enter Second Number:");
int b=sc.nextInt();
System.out.println ("Enter Name of the Operation:");
char operation = sc.next().charAt(0);

double result=0;

if (operation == '+');
{
result = a + b;
}
else System.out.println("Error found");
System.out.println (result);



}
}
