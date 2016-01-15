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
        Slack client = new Slack(webHookUrl);

        if(config.hasPath("channel")) {
            client.sendToChannel(config.getString("channel"));
        }

        if(config.hasPath("user")) {
            client.sendToUser(config.getString("user"));
        }

        if(config.hasPath("botname")) {
            client.displayName(config.getString("botname"));
        }

        if(config.hasPath("icon")) {
            client.icon(config.getString("icon"));
        }

        return new BasicSlackNotifier(client);
    }
}
