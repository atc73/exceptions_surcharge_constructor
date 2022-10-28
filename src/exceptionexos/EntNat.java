package exceptionexos;

public class EntNat {

    private int num;


    public EntNat (int number) throws ErrConst {
        if(number < 0) {
            throw new ErrConst();
        }
        num = number;
        System.out.println(num);
    }

    public static void add(int a, int b) throws ErrAdd {
        if (a < 0 || b < 0) {
            throw new ErrAdd();
        }
        int result = a + b;
        System.out.println(result);
    }

    public static void substract(int a, int b) throws ErrSubstract {
        if (a < 0 || b < 0) {
            throw new ErrSubstract();
        }
        int result = a - b;

        if (result < 0) {
            throw new ErrSubstract(result);
        }

        if (a - b < 0) {
            throw new ErrSubstract();
        }
        System.out.println(result);
    }

    public static void multiply(int a, int b) throws ErrMultiply {
        if (a < 0 || b < 0) {
            throw new ErrMultiply();
        }

        if (a == 0 || b == 0) {
            throw new ErrMultiply("a et b ne peuvent être égal à 0");
        }

    }

    public int getN() {
        return num;
    }
}
