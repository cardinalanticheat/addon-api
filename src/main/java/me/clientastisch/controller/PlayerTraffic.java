package me.clientastisch.controller;

import java.util.function.Consumer;

/**
 * @author Clientastisch
 * @since CAC v. 2.5.0
 */
public abstract class PlayerTraffic {

    /**
     * Intercept incomming tcp network traffic
     *
     * @param packet tcp packet in string representation
     */
    public abstract void subscribeIncommingTraffic(Consumer<String> packet);

    /**
     * Intercepting outgoing tcp traffic
     *
     * @param packet tcp packet in string representation
     */
    public abstract void subscribeOutgoingTraffic(Consumer<String> packet);

    /**
     * Stop intercepting traffic
     */
    public abstract void destory();

}
