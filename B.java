public class B{

int count;

B(){

count++;
System.out.println(count);
}

public static void main(String [] args){

B obj=new B();

B obj2=new B();

B obj3=new B();

}


}