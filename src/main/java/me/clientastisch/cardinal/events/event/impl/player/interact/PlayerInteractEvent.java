package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class PlayerInteractEvent implements Event<PlayerInteractEvent> {

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
    public abstract Block getClickedBlock();

    /**
     *
     */
    public abstract Action getAction();

}