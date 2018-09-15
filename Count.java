import java.util.Scanner;
class Count
{

static void count()
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int space=0;
int letters=0;
int numbers=0;
int others=0;

char [] c=s.toCharArray();

for(char c1: c)
{
if(String.valueOf(c1).equals(" ")) space++;
else if(Character.isDigit(c1)) numbers++;
else if(Character.isLetter(c1)) letters++;
else others++;

}

System.out.println("Space:"+space+"\nLetters:"+letters+"\nNumbers:"+numbers+"\nOthers:"+others);

}

public static void main(String [] args)

{
count();

}

}