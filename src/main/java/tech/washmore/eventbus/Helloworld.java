package tech.washmore.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Washmore on 2017/5/2.
 */
public class Helloworld {
    @Subscribe
    public void hello(EventListener listener) {
        System.out.println("hello world!" + listener.getLastMessage());
    }
}
