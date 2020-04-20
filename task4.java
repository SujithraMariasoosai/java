import java.lang.*;
 interface I1
{
  void run();
}
 interface I2
{
  void run();
}
interface I3
{
    void delete();
}
interface I4
{
     void addProduct();
}
interface I5 extends I4
{
    void createUser();
}
public class inter{

     public static void main(String []args){
        A a =new A();
        a.run();
        B b=new B();
        b.run();
        b.delete();
        b.addProduct();
        b.createUser();
     }
}
 class A implements I1,I2
{
   public  void run(){
        System.out.println("Run of class A");
    }
  
}

 class B implements I2,I3,I5 
{
    public void run()
    {
        System.out.println("Run of class B");
    }
    public void delete()
    {
        System.out.println("Delete of class B");
    }
    public void addProduct()
    {
        System.out.println("Add product of class B");
    }
    public void createUser()
    {
        System.out.println("CreateUser of class B");
    }
}
