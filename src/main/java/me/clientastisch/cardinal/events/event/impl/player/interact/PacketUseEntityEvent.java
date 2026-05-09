package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketUseEntityEvent extends Event<PacketUseEntityEvent> {

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
    public int getEntityId() {
        return 0;
    }

    /**
     *
     */
    public Object getFacing() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Location getPlayerLocation() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Location getEntityLocation() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Action getCause() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Entity getEntity() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    public enum Action {

        INTERACT,
        ATTACK;

    }

}