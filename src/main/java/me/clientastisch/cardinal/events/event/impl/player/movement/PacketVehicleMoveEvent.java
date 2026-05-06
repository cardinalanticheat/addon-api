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
    public Location getTo() {
        return null;
    }

    /**
     *
     */
    public Location getFrom() {
        return null;
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