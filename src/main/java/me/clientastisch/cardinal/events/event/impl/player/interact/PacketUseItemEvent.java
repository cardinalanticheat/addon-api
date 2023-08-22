package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.inventory.ItemStack;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketUseItemEvent implements Event<PacketUseItemEvent> {

    public abstract ItemStack getItem();

}
