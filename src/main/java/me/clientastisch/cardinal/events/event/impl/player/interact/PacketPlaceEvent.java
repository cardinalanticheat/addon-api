package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Location;

/**
 * @author Clientastisch
 * @since CAC v. 0.9996
 */
public abstract class PacketPlaceEvent implements Event<PacketPlaceEvent> {

    public abstract Location getBlockLocation();

    public abstract ItemStack getItemStack();

    public abstract float getFacingX();

    public abstract float getFacingY();

    public abstract float getFacingZ();

    public abstract int getActionId();

}
