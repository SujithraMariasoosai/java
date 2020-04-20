public class Main{
     public static void main(String []args){
        lady l;
        l=new employee();
        System.out.println("Mode of work: "+l.modeOfWork());
        l=new homemaker();
        System.out.println("Mode of work: "+l.modeOfWork());
        l=new member();
        System.out.println("Mode of work: "+l.modeOfWork());
     }
}
class lady{
    String modeOfWork(){ return null;};
}
class employee extends lady
{
   String modeOfWork(){
       return ("Employee ");
   }  
}
class homemaker extends lady
{
   String modeOfWork(){
       return ("Home Maker ");
   }  
}
class member extends lady
{
   String modeOfWork(){
       return ("Member ");
   }  
}
