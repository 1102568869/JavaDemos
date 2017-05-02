package tech.washmore.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Washmore on 2017/5/2.
 */
public class Client {

    @Subscribe
    public void sayHello(String word) {
    }
}
