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
        throw new IllegalStateException("Implementation is provided by runtime");
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
    public int getViolation() {
        return 0;
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