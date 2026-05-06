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
        return null;
    }

    /**
     *
     */
    public Object getPacket() {
        return null;
    }

    /**
     *
     */
    public PlayerController getController() {
        return null;
    }

    /**
     *
     */
    public Channel getPipeline() {
        return null;
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
    public void cancelled() {}

    /**
     * Push the event to the EventManager to publish and propagate it
     *
     * @return instance of event for chained calls
     */
    public T fire() {
        return null;
    }

    /**
     *
     */
    public ScheduledExecutorService getService() {
        return null;
    }

}