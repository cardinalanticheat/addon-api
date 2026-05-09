package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.checks.CheckManager;
import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PunishFireEvent extends Event<PunishFireEvent> {

    /**
     *
     */
    public boolean isInstance(Object check) {
        return false;
    }

    /**
     *
     */
    public String getPunishment() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public String getCategory() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public String getCheckName() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

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
    public Checks getCheck() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}