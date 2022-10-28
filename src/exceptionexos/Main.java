package exceptionexos;

public class Main {
    public static void main(String[] args) {

        try {
            EntNat number = new EntNat(-12);
        } catch(ErrConst e) {
            System.out.println(e.getMessage());
        }

        try{
            /*EntNat number2 = new EntNat(10);*/
            EntNat.add(-5, 6);
        } catch(ErrAdd e) {
            System.out.println(e.getMessage());
        } catch (ErrNat e) {
            System.out.println(e.getMessage());
        }


        try{
            EntNat number3 = new EntNat(10);
            EntNat.substract(-1, 6);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

       try{
            EntNat number4 = new EntNat(10);
            EntNat.multiply(0, 6);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
