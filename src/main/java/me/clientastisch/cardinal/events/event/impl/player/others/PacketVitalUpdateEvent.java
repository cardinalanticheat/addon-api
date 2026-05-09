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