package in.ashwanthkumar.notify.pagerduty;

import com.squareup.pagerduty.incidents.PagerDuty;
import com.squareup.pagerduty.incidents.Trigger;
import in.ashwanthkumar.notify.Notifier;

public class SimplePDNotifier implements Notifier {

    private String apiKey;

    public SimplePDNotifier(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void notify(String message) {
        PagerDuty pd = PagerDuty.create(apiKey);
        pd.notify(new Trigger.Builder(message).build());
    }
}
