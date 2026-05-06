package me.clientastisch.cardinal.events.event.impl.player.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketFlyingEvent extends Event<PacketFlyingEvent> {

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
    public Object getEvent() {
        return null;
    }

    /**
     *
     */
    public long getDelay() {
        return 0;
    }

    /**
     *
     */
    public long getLastPacket() {
        return 0;
    }

    /**
     *
     */
    public boolean isOnGround() {
        return false;
    }

}