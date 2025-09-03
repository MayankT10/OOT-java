public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        // 1. AND ( & ) 
        int result1 = a & b;
        System.out.println("a & b: " +result1);

        // 2. OR ( | )
        int result2 = a | b;
        System.out.println("a|b: " + result2);

        // 3. XOR ( ^ )
        int result3 = a^b;
        System.out.println("a^b: "+result3);

        // 4. NOT ( ~ )
        int result4 = ~b;
        System.out.println("~b: "+result4);

        // 5. Left Shift ( << )
        int leftshift = a << 1;
        System.out.println("a<<1: " +leftshift);

        // 6. Right Shift ( >> )
        int rightshift = a >> 1;
        System.out.println("a>>1: " +rightshift);
        
    }
}

