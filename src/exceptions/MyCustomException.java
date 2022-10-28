package exceptions;

public class MyCustomException extends Exception{
    public MyCustomException() {
        super("Je n'ai plus de points de vie");
    }
}
