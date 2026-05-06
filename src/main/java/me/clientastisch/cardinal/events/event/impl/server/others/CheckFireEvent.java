package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class CheckFireEvent extends Event<CheckFireEvent> {

    /**
     *
     */
    public String getPunishment() {
        return "";
    }

    /**
     *
     */
    public boolean isPunishable() {
        return false;
    }

    /**
     *
     */
    public boolean isHidden() {
        return false;
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
    public int getViolation() {
        return 0;
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