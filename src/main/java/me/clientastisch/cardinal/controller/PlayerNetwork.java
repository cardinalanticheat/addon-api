package me.clientastisch.cardinal.controller;

/**
 * @author Clientastisch
 * @since CAC v. 0.9991
 */
public abstract class PlayerNetwork {

    /**
     * Get the all-time average ping
     *
     * @return ping
     */
    public abstract long getAveragePing();

    /**
     * Get the all-time average ping
     *
     * @return ping
     */
    public abstract long getAveragePing(int length);

}