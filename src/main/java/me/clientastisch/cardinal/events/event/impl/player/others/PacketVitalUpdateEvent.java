package me.clientastisch.cardinal.events.event.impl.player.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketVitalUpdateEvent extends Event<PacketVitalUpdateEvent> {

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
    public float getHealth() {
        return 0F;
    }

    /**
     *
     */
    public float getSaturation() {
        return 0F;
    }

    /**
     *
     */
    public int getFoodLevel() {
        return 0;
    }

}