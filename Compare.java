import java.util.Scanner;
class Compare
{

void comparing()
{

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

if(a>b)
{
System.out.printf("%d>%d",a,b);
System.out.printf("%d>=%d",a,b);
}
else
{
System.out.printf("%d>%d",b,a);
System.out.printf("%d>=%d",b,a);
}


}
public static void main(String [] args)

{
Compare c=new Compare();
c.comparing();

}




}