package me.clientastisch.controller;

import java.util.function.Consumer;

/**
 * @author Clientastisch
 * @since CAC v. 2.5.0
 */
public class PlayerTraffic {

    /**
     * Intercept packets
     *
     * @param address player host address (public ipv4)
     */
    public PlayerTraffic(String address, int port) { }

    /**
     * Intercept incomming tcp network traffic
     *
     * @param packet tcp packet in string representation
     */
    public void subscribeIncommingTraffic(Consumer<String> packet) { }

    /**
     * Intercepting outgoing tcp traffic
     *
     * @param packet tcp packet in string representation
     */
    public void subscribeOutgoingTraffic(Consumer<String> packet) { }

    /**
     * Stop intercepting traffic
     */
    public void destory() { }

}
