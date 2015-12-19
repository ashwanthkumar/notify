package in.ashwanthkumar.notify;

/**
 * Common Interface that all notifiers should implement
 */
public interface Notifier {
    /**
     * Notify an error message
     *
     * @param message Actual message that needs to be sent
     */
    void error(String message);

    /**
     * Notify a info message
     *
     * @param message Actual message that needs to be sent
     */
    void info(String message);
}
