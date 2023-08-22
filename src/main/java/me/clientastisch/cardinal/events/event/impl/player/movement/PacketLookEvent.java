package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketLookEvent implements Event<PacketLookEvent> {

    public abstract float getYaw();

    public abstract float getPitch();

}
