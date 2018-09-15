
import java.util.Scanner;
public class Sumdigits
{

public void sum()
{
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
String is=String.valueOf(a);
char [] c= is.toCharArray();
long k=0;

int l=c.length;
for(int i=0;i<l;i++)
{
k=k+Character.getNumericValue(c[i]);
}

System.out.println(k);


}

public static void main(String [] args)
{
Sumdigits sd=new Sumdigits();
sd.sum();

}

}
