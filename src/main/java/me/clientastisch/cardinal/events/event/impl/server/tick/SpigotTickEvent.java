package me.clientastisch.cardinal.events.event.impl.server.tick;

import me.clientastisch.cardinal.events.event.Event;

/**
 * Will be called every 50 milliseconds
 *
 * @author Clientastisch
 * @since CAC v. 3.0.0
 */
public abstract class SpigotTickEvent implements Event<SpigotTickEvent> {

    public abstract long getState();

}
