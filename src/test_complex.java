public class test_complex {
    public static void main(String[] args) {
        complex a = new complex(82, 4);
        a.mod();
        a.arg();

        System.out.println();

        complex b = new complex(2, 4);
        b.mod();
        b.arg();

        System.out.println();

        a.plus(b);
        b.minus(a);
        b.minus(b);
    }
}
