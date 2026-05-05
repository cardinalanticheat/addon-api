package me.clientastisch.cardinal.events.event.impl.player.others;

import lombok.Getter;
import me.clientastisch.cardinal.controller.PlayerController;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class PacketFlyingEvent implements Event<PacketFlyingEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract Object getEvent();

    /**
     *
     */
    public abstract long getDelay();

    /**
     *
     */
    public abstract long getLastPacket();

    /**
     *
     */
    public abstract boolean isOnGround();

}