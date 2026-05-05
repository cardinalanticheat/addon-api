package me.clientastisch.cardinal.events.event;

import io.netty.channel.Channel;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import me.clientastisch.cardinal.controller.PlayerController;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9978
 */
public interface Event<T extends Event<T>> {

    /**
     *
     */
    Player getPlayer();

    /**
     *
     */
    Object getPacket();

    /**
     *
     */
    PlayerController getController();

    /**
     *
     */
    Channel getPipeline();

    /**
     *
     */
    boolean isContinue();

    /**
     *
     */
    void cancelled();

    /**
     * Push the event to the EventManager to publish and propagate it
     *
     * @return instance of event for chained calls
     */
    T fire();

    /**
     *
     */
    ScheduledExecutorService getService();

}