package in.ashwanthkumar.notify.slack;

import com.typesafe.config.Config;
import in.ashwanthkumar.notify.Notifier;
import in.ashwanthkumar.slack.webhook.Slack;

public class SlackNotifierFactory {

    public static final String NOTIFIER_NAME = "slack";

    public static Notifier load(Config config) {
        String type = config.getString("type");
        assert type.equalsIgnoreCase(NOTIFIER_NAME);
        String webHookUrl = config.getString("webhook-url");

        return new BasicSlackNotifier(new Slack(webHookUrl));
    }
}
