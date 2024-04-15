package lambdabasics;

public class LambdasDemo1 {

    public static Double returnDouble(Double j){
        return j * 2;
    }

    public static void main(String[] args) {
        Double res = returnDouble(2.55);
        System.out.println(res);

//        OR To do the same using lambdas

        ToReturnDoubles returnDoubleWithLambdas = (Double k) -> k * 2;
        Double result = returnDoubleWithLambdas.foo(5.1);
        System.out.println(result);

        ToAddNumbers addFunction = (int a, int b) -> a + b;
        int sum_result = addFunction.sum(20, 30);
        System.out.println("Result from addition "+sum_result);

        ToDivideSafely safeDivideFuntion = (int a, int b) -> {
            if (b == 0) return 0;
            return a / b;
        };

        int res_from_safe_div = safeDivideFuntion.divide_safe(20, 5);
        System.out.println("Reply from safe divide : "+res_from_safe_div);

        GetStringLenth stringLengthCountFunction = (String str) -> str.length();
        int get_len = stringLengthCountFunction.stringLengthCountFunction("Happy");
        System.out.println("Result from string length function " + get_len);


//        returnDoubleWithLambdas(5.2);
    }
}


interface ToReturnDoubles{
    Double foo(Double k);
}

interface ToAddNumbers{
    int sum(int a, int b);
}

interface ToDivideSafely{
    int divide_safe(int a, int b);
}

interface GetStringLenth{
    int stringLengthCountFunction(String s);
}