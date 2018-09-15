import java.util.Scanner;
public class Compar
{

public static void  compare()
{

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

if(a>b) System.out.printf("%d > %d",a,b);
else if (b>a) System.out.printf("%d > %d",b,a);
else System.out.printf("%d = %d",a,b);



}

public static void main(String [] args)
{
Compar.compare();

}

}