package tech.washmore.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * Created by Washmore on 2017/5/2.
 */
public class TestEventBus {
    @Test
    public void should_create_event_bus_instance() throws Exception {
        EventBus eventBus = new EventBus();
        //string构造参数，用于标识EventBus
        EventBus eventBus1 = new EventBus("My Event Bus");
    }

    @Test
    public void testReceiveEvent() throws Exception {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();
        Helloworld helloworld = new Helloworld();
        eventBus.register(listener);
        eventBus.register(helloworld);

        eventBus.post(new TestEvent(200));
        eventBus.post(listener);
//        eventBus.post(new TestEvent(300));
//        eventBus.post(new TestEvent(400));

        System.out.println("LastMessage:" + listener.getLastMessage());
        ;
    }
}
