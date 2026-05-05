package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

/**
 * @author Clientastisch
 * @since CAC v. 0.9996
 */
public abstract class PacketVelocityAcceptEvent implements Event<PacketVelocityAcceptEvent> {

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Vector getVector();

}