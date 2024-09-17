public class PRE_ASSO {
    public static void main(String[] args) {
     int a= 6*5-34/2;
     int b= 60/5-34*2;
        System.out.println(a);
        System.out.println(b);
        /*
        Expression: int a = 6 * 5 - 34 / 2;
        Precedence: * and / have higher precedence than -.
        Associativity: * and / are left-to-right.
        First, multiply: 6 * 5 = 30
        Then, divide: 34 / 2 = 17
        Finally, subtract: 30 - 17 = 13
        So, a = 13.

        2. Expression: int b = 60 / 5 - 34 * 2;
        Precedence: * and / have higher precedence than -.
        Associativity: Left-to-right.
        First, divide: 60 / 5 = 12
        Then, multiply: 34 * 2 = 68
        Finally, subtract: 12 - 68 = -56
        So, b = -56.
         */
     int x = 1;
     int y = 4;
     int z = 5;
     int k = (y*y-4*x*z)/(2*x);
        System.out.println(k);
    }
}
