

public class excepcion extends Exception{

    private String message;

    public excepcion(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;

    }
}
