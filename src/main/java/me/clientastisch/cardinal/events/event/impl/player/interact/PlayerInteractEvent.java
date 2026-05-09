package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PlayerInteractEvent extends Event<PlayerInteractEvent> {

    /**
     *
     */
    public Player getPlayer() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Object getPacket() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Block getClickedBlock() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Action getAction() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}