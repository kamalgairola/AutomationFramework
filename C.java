import java.util.Scanner;
public class C{


void palindrome(){

Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

char[] a=s.toCharArray();
int len=a.length;
String rev="";

for(int i=len-1;i>=0;i--)
{


rev=rev+ String.valueOf(a[i]);


}

System.out.println(rev);

if(rev.equals(s))
System.out.println("Entered text is a palindrome");
else
System.out.println("Entered text is not a palindrome");


}

public static void main(String [] args){

C obj=new C();
obj.palindrome();

}


}