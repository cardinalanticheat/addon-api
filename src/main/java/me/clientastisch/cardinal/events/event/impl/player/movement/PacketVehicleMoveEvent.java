package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketVehicleMoveEvent extends Event<PacketVehicleMoveEvent> {

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
    public Location getTo() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Location getFrom() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public double getDeltaY() {
        return 0D;
    }

    /**
     *
     */
    public double getDeltaXZ() {
        return 0D;
    }

    /**
     *
     */
    public double getDelta() {
        return 0D;
    }

}