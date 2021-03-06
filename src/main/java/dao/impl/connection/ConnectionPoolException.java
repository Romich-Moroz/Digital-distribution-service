package dao.impl.connection;

public class ConnectionPoolException extends Exception {
    public ConnectionPoolException () {
        super();
    }
    public ConnectionPoolException (String message) {
        super(message);
    }

    public ConnectionPoolException (Exception e) {
        super(e);
    }

    public ConnectionPoolException (String message, Exception e) {
        super(message, e);
    }

    protected ConnectionPoolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
