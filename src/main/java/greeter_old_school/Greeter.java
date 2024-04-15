package greeter_old_school;

public class Greeter {

    public void greet(Greeting greet){
        greet.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        System.out.println("***********");
        helloWorldGreeting.perform();

//        Above we created a class for the implementation of the interface
//        Next we create a lambda implementation of the interface

        Greeting lambdaGreeting = () -> System.out.println("Hello World!");
        lambdaGreeting.perform(); // This is how we execute a lambda expression
    }
}
