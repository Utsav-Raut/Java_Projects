package java_basics;

interface MyInterface{
    default void defaultMethod(){
        System.out.println("This is from the default method.");
    }

    static void staticMethod(){
        System.out.println("This is from the static method.");
    }
}

public class Interface_Prac1 implements MyInterface{
    public static void main(String[] args) {
        Interface_Prac1 obj = new Interface_Prac1();
        obj.defaultMethod();

//        obj.staticMethod();               // Not allowed
//        Interface_Prac1.defaultMethod();  // Not allowed

        MyInterface.staticMethod();

        Interface_Prac1.main_static_method();
//        obj.main_static_method();  // Not allowed
    }

    static void main_static_method(){
        System.out.println("This is from main static method");
    }
}
