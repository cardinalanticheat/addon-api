package me.clientastisch.cardinal.events.event;

import io.netty.channel.Channel;
import java.util.concurrent.ScheduledExecutorService;
import me.clientastisch.cardinal.controller.PlayerController;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public abstract class Event<T extends Event<T>> {

    /**
     *
     */
    public Player getPlayer() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Object getPacket() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public PlayerController getController() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Channel getPipeline() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public boolean isContinue() {
        return false;
    }

    /**
     *
     */
    public void cancelled() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Push the event to the EventManager to publish and propagate it
     *
     * @return instance of event for chained calls
     */
    public T fire() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public ScheduledExecutorService getService() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}