class calculator{
    public static void main(String[] args){
        int a=5;
        int b=10;
        int sum=a+b;
        int difference=a-b;
        int multiply= a*b;
        int divide= a/b;
        String magic= "=======Magic=======";
        System.out.println("=====method1=======");
        System.out.println("Addition= " + sum);
        System.out.println("Subtraction= " + difference);
        System.out.println("Multiplication= " + multiply);
        System.out.println("Division= " + divide);
        System.out.println("======method2======");
        System.out.println("Addition of a&b= " +(a + b));
        System.out.println("Subtraction of a&b= " + (a - b));
        System.out.println("Multiplication of a&b= " + (a * b));
        System.out.println("Division of a&b= " + (a / b));
        System.out.println("Remainder of a&b= " + (a % b));
        System.out.println(magic);
        System.out.println("Addition= "+(a+b)+ "Subtraction= "+(a-b)+ "Multiplication= "+(a*b)+ "Division= "+(a/b));
    }
}