package tech.washmore.eventbus;

/**
 * Created by Washmore on 2017/5/2.
 */
public class TestEvent {
    private final int message;

    public TestEvent(int message) {
        this.message = message;
        System.out.println("event message:" + message);
    }

    public int getMessage() {
        return message;
    }
}