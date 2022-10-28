package exceptionexos;

public class ErrSubstract extends ErrNat{
    public ErrSubstract() {
        super("a et b doivent être positifs : ErrSubstract");
    }

    public ErrSubstract(int resultOfSubstraction) {
        super("La différence de la soustraction doit être positive. Résulat : " + resultOfSubstraction);
    }

}
