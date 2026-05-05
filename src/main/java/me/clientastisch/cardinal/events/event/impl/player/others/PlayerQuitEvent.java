package me.clientastisch.cardinal.events.event.impl.player.others;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PlayerQuitEvent implements Event<PlayerQuitEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

}