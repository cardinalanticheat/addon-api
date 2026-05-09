package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketLookEvent extends Event<PacketLookEvent> {

    /**
     *
     */
    public Object getPacket() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Player getPlayer() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public float getYaw() {
        return 0F;
    }

    /**
     *
     */
    public float getPitch() {
        return 0F;
    }

    /**
     *
     */
    public boolean isOnGround() {
        return false;
    }

}