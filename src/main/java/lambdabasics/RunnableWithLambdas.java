package lambdabasics;

public class RunnableWithLambdas {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed Inside Runnable");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside lambda runnable"));
        myLambdaThread.run();
    }
}
