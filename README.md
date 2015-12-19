# Notify

Collection of libraries that I used for notification across various means.

Latest Project version - `1.0-rc1` (published on Maven Central)

## Integrations and Usage

Add the `notify-core` to your project and choose the required integration.

```xml
<dependency>
    <groupId>in.ashwanthkumar</groupId>
    <artifactId>notify-core</artifactId>
    <version>${project.version}</version>
</dependency>
```

### Slack
```xml
<dependency>
    <groupId>in.ashwanthkumar</groupId>
    <artifactId>notify-slack</artifactId>
    <version>${project.version}</version>
</dependency>
```

```java
Notifier notifier = new BasicSlackNotifier(new Slack("slack_webhook_url").sendToChannel("general"));
notifier.notify("Hello World from Notify :smile:");
```

### EMail
```xml
<dependency>
    <groupId>in.ashwanthkumar</groupId>
    <artifactId>notify-email</artifactId>
    <version>${project.version}</version>
</dependency>
```

```java
Notifier notifier = new SimpleEmailNotifier(new GMailConfig("from@example.com", "to@example.com", "Email Subject", "username", "password"));
notifier.notify("Hello World from Notify :smile:");
```

### PagerDuty
Note - As of now, we can only trigger incidents on PagerDuty not resolve them.

```xml
<dependency>
    <groupId>in.ashwanthkumar</groupId>
    <artifactId>notify-pagerduty</artifactId>
    <version>${project.version}</version>
</dependency>
```

```java
Notifier notifier = new SimplePDNotifier("API_KEY");
notifier.notify("Hello World from Notify :smile:");
```


## License
Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0
