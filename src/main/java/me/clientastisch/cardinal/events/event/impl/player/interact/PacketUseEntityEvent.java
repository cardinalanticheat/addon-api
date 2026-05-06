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
    public int getEntityId() {
        return 0;
    }

    /**
     *
     */
    public Object getFacing() {
        return null;
    }

    /**
     *
     */
    public Location getPlayerLocation() {
        return null;
    }

    /**
     *
     */
    public Location getEntityLocation() {
        return null;
    }

    /**
     *
     */
    public Action getCause() {
        return null;
    }

    /**
     *
     */
    public Entity getEntity() {
        return null;
    }

    public enum Action {

        INTERACT,
        ATTACK;

    }

}