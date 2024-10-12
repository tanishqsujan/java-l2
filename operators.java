public class operators {
    public static void main(String[] args){
        int a=5;
        int b=10;
        System.out.println("=====Guess the answer======");
        System.out.println("Uniary Operator= " +(a++));
        System.out.println("Uniary Operator= "+(++b));
        System.out.println("Binary Operator");
        System.out.println("1+2= "+1+2);
        System.out.println("1+2= " +(1+2));
        System.out.println(1+2 +"=3");
        int increment= ++a* b++;
        System.out.println(increment);
        System.out.println("Ternary operators");
        int largestnumber= (a>b)?a:b;
        System.out.println("Largest Number is "+largestnumber);
    }
}
