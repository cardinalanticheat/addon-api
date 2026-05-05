package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * Will be called when Cardinal shuts down
 *
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PluginShutdownEvent implements Event<PluginShutdownEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

}