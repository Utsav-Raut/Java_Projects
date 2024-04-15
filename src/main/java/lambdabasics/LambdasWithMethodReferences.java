package lambdabasics;

public class LambdasWithMethodReferences {

    public static void main(String[] args) {

//        Thread t = new Thread(() -> printMessage()); //Shortcut to this even is using method reference
        Thread t = new Thread(LambdasWithMethodReferences::printMessage); // This method ref syntax is same as the lambda above
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello There!");
    }
}
