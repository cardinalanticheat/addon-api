package me.clientastisch.events.event.impl.player.interact;

import me.clientastisch.events.event.Event;
import org.bukkit.entity.Entity;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketUseEntityEvent implements Event<PacketUseEntityEvent> {

    public abstract Action getCause();

    public abstract Entity getEntity();

    public abstract Integer getEnityId();

    public static enum Action {
        INTERACT, ATTACK
    }
}
