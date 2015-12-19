package in.ashwanthkumar.notify.slack;

import in.ashwanthkumar.notify.Notifier;
import in.ashwanthkumar.slack.webhook.Slack;
import in.ashwanthkumar.slack.webhook.SlackMessage;

import java.io.IOException;

/**
 * Basic Slack Notifier that helps in notification to Slack
 */
public class BasicSlackNotifier implements Notifier {

    private Slack client;

    public BasicSlackNotifier(Slack client) {
        this.client = client;
    }

    @Override
    public void error(String message) {
        try {
            client.push(new SlackMessage(message));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void info(String message) {
        try {
            client.push(new SlackMessage(message));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
