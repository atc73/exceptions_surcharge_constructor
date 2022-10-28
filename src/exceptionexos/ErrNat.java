package exceptionexos;

public class ErrNat extends Exception {

    public ErrNat() {
        super("Je suis ErrNat");
    }

    public ErrNat(String message) {
        super(message);
    }
}
