package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PluginShutdownEvent extends Event<PluginShutdownEvent> {

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

}