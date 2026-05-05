package me.clientastisch.cardinal.events.event.impl.player.others;

import lombok.Getter;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class PacketKeepAliveEvent implements Event<PacketKeepAliveEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

}