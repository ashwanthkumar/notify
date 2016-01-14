package in.ashwanthkumar.notify.slack;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import in.ashwanthkumar.notify.Notifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlackNotifierFactoryTest {
    @Test
    public void shouldLoadSlackNotifierFromConfig() {
        Config config = ConfigFactory.parseResources("slack-notify.conf").getConfig("notify");
        Notifier notifier = SlackNotifierFactory.load(config);

        assertTrue(notifier instanceof BasicSlackNotifier);
    }

}