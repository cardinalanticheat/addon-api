package me.clientastisch.cardinal.controller;

/**
 * @author Clientastisch
 * @since CAC v. 0.9991
 */
public abstract class PlayerNetwork {

    /**
     * Returns the current ping of the player
     *
     * @return the current ping
     */
    public abstract long getCurrentPing();

    /**
     * Returns the whole network delay.
     * That means how long a server request takes to
     * be send back to the server itself
     *
     * @return the network delay
     */
    public abstract long getNetworkDelay();

    /**
     * Returns the average ping of all network samples
     *
     * @return the average ping
     */
    public abstract long getAveragePing();

    /**
     * Returns the average ping of an amount
     * of network samples
     *
     * @param length the amount of samples
     * @return the average of <strong>length</strong> samples
     */
    public abstract long getAveragePing(int length);

}
