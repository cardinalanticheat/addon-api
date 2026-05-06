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
        return "";
    }

    /**
     *
     */
    public String getCategory() {
        return "";
    }

    /**
     *
     */
    public String getCheckName() {
        return "";
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
    public Object getPacket() {
        return null;
    }

    /**
     *
     */
    public Checks getCheck() {
        return null;
    }

}