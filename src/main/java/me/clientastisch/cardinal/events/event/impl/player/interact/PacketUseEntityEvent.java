package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketUseEntityEvent implements Event<PacketUseEntityEvent> {

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
    public abstract int getEntityId();

    /**
     *
     */
    public abstract Object getFacing();

    /**
     *
     */
    public abstract Location getPlayerLocation();

    /**
     *
     */
    public abstract Location getEntityLocation();

    /**
     *
     */
    public abstract Action getCause();

    /**
     *
     */
    public abstract Entity getEntity();

    public enum Action {

        INTERACT,
        ATTACK;

    }

}