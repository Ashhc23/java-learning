public class operators {
    public static void main(String[] args) {
      //arithmetic operator
      int a=1;
        int b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a>b);
        System.out.println(a<b);

        //ternary
        System.out.println(a>b ? a:b );
        //assignment operator
        a+=b;
        a-=b;
        a*=b;
        a/=b;
        a%=b;
        System.out.println(a);
        System.out.println(b);
        //increment and decrement operator
        System.out.println(++a);
        System.out.println(--a);
    }
    
}
    
