package in.ashwanthkumar.notify;

/**
 * Common Interface that all notifiers should implement
 */
public interface Notifier {
    /**
     * Notify a message
     *
     * @param message Actual message that needs to be sent
     */
    void notify(String message);
}
