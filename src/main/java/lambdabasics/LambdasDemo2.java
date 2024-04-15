package lambdabasics;

public class LambdasDemo2 {
    public static void main(String[] args) {
        StringLengthLambda myLambda = a -> a.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

//        Another way of doing above
        int res = printLambda(a -> a.length());
        System.out.println("The length is : "+res);
    }

    public static int printLambda(StringLengthLambda str){
        return str.getLength("Hello Lambda from printLambda fn");
    }
}

interface StringLengthLambda{
    int getLength(String a);
}