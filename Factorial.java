import java.util.*;
public class Factorial
{
public static void main(String args[])
{
int fact=1;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.print("The factorial of" +a+ "is:" +fact);
}
}
