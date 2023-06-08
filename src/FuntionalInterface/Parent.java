package FuntionalInterface;


public interface Parent {

    static  void Bye(){
        System.out.println("innovapath");
    }

    default  void hello(){
        System.out.println("my name is vikas");
    }
}
