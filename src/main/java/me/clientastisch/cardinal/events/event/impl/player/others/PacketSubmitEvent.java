package me.clientastisch.cardinal.events.event.impl.player.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9977
 */
public abstract class PacketSubmitEvent implements Event<PacketSubmitEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

}