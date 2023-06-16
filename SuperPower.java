class SuperPower {
    static int base = 1337;

    static public int superPow(int a, int[] b) {
        return superPow(a, b, b.length - 1);
    }

    static public int superPow(int a, int[] b, int index) {
        if (index == 0)
            return pow(a, b[index]) % base;
        int pre = superPow(a, b, index - 1);
        return (pow(pre, 10) * pow(a, b[index])) % base;
    }

    static public int pow(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x % base;
        int half = pow(x, n / 2);
        if (n % 2 == 0)
            return (half * half) % base;
        else
            return (((half * half) % base) * (x % base)) % base;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
