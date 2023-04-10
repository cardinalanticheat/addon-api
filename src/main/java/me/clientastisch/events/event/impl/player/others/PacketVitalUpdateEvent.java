package me.clientastisch.events.event.impl.player.others;

import me.clientastisch.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9996
 */
public abstract class PacketVitalUpdateEvent implements Event<PacketVitalUpdateEvent> {

    public abstract float getHealth();

    public abstract float getSaturation();

    public abstract int getFoodLevel();

}
