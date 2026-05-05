package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketVehicleMoveEvent implements Event<PacketVehicleMoveEvent> {

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
    public abstract Location getTo();

    /**
     *
     */
    public abstract Location getFrom();

    /**
     *
     */
    public abstract double getDeltaY();

    /**
     *
     */
    public abstract double getDeltaXZ();

    /**
     *
     */
    public abstract double getDelta();

}