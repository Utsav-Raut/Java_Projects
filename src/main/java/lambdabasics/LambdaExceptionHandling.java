package lambdabasics;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {

    public static void main(String[] args) {
        int [] someNumbers = {1, 2, 3, 4};
        int key = 1;

        processNumbers(someNumbers, key, WrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void processNumbers(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i: someNumbers) {
            System.out.println("entering diff");
            consumer.accept(i, key);
            System.out.println("leaving diff");
        }
    }

    private static BiConsumer<Integer, Integer> WrapperLambda(BiConsumer<Integer, Integer> consumer){
        System.out.println("Came here");
        return (v, k) -> {
            try {
                System.out.println("Insider wrapper");
                consumer.accept(v, k);
                System.out.println("Leaving wrapper");
                System.out.println();
            } catch (ArithmeticException e) {
                System.out.println("Exception handled in the wrapper lambda.");
            }
        };
    }
}
