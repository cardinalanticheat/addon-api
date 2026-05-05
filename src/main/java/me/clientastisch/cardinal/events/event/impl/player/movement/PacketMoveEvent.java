package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketMoveEvent implements Event<PacketMoveEvent> {

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
    public abstract void cancelled();

    /**
     *
     */
    public abstract Location getFrom();

    /**
     *
     */
    public abstract Location getTo();

    /**
     *
     */
    public abstract boolean isOnGround();

    /**
     *
     */
    public abstract boolean isRotation();

    /**
     *
     */
    public abstract boolean isJump();

    /**
     *
     */
    public abstract boolean isTeleport();

    /**
     *
     */
    public abstract boolean isTeleportFrom();

    /**
     *
     */
    public abstract double getDeltaXZ();

    /**
     *
     */
    public abstract double getDeltaY();

    /**
     *
     */
    public abstract double getDelta();

    /**
     *
     */
    public abstract double getDeltaX();

    /**
     *
     */
    public abstract double getDeltaZ();

    /**
     *
     */
    public abstract double getAccelerationY();

    /**
     *
     */
    public abstract double getAccelerationXZ();

}