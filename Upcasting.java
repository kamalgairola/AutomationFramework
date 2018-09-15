public class Upcasting
{

public void display()
{

System.out.println("KC is Hero");
}

public static void main(String [] args)
{

Upcasting up=new Sub();


up.display();

//Sub.downcastingMthd(up);

Sub b=(Sub)up;
b.Subdisplay();


}


}

class Sub extends Upcasting
{

public void Subdisplay()
{
System.out.println("Gairo is Hero");

}



}