package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketTeleportEvent implements Event<PacketTeleportEvent> {

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
    public abstract Location getLocation();

}