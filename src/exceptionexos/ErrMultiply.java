package exceptionexos;

public class ErrMultiply extends ErrNat{
    public ErrMultiply() {
        super("a et b doivent être positifs : ErrMultiply");
    }

    public ErrMultiply(String message) {
        super("a et b ne doivent pas être égal à zero");
    }
}
