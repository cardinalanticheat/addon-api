package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class NotifyFlagEvent extends Event<NotifyFlagEvent> {

    /**
     *
     */
    public Object getPacket() {
        return null;
    }

    /**
     *
     */
    public Player getPlayer() {
        return null;
    }

    /**
     *
     */
    public Player getSuspect() {
        return null;
    }

    /**
     *
     */
    public Checks getChecks() {
        return null;
    }

}