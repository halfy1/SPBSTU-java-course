public class MyFirstException extends Exception {

    public MyFirstException() {
        super();
    }

    public MyFirstException(String message) {
        super(message);
    }

    // конструктор с сообщением и причиной (другим исключением)
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}
