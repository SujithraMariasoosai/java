public class HelloWorld{

     public static void main(String []args){
        entertainment e;
        e=new tv();
        System.out.println("Your selection : "+e.display());
        e=new dvd();
        System.out.println("Your selection: "+e.display());
        e=new radio();
        System.out.println("Your selection: "+e.display());
     }
}

class entertainment{
    String display(){
        return null;
    } 
}
class tv extends entertainment{
    String display(){
        return ("You have selected TV ");
    }
}
class dvd extends entertainment{
    String display(){
        return ("You have selected DVD ");
    }
}
class radio extends entertainment{
    String display(){
        return ("You have selected Radio ");
    }
}
