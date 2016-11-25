package acesso.exception;

public class LocalAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LocalAlreadyExistsException(final String message) {
        super(message);
    }
}
