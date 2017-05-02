package tech.washmore.eventbus;

import com.google.common.eventbus.Subscribe;

import java.util.Random;

/**
 * Created by Washmore on 2017/5/2.
 */
public class EventListener {
    public int lastMessage = 0;

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:" + lastMessage);
    }

    @Subscribe
    public void listen2(TestEvent event) {
        System.out.println("Message:" + new Random(10).nextInt());
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
