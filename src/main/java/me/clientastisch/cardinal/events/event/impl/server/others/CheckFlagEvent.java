package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.checks.CheckType;
import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class CheckFlagEvent extends Event<CheckFlagEvent> {

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
    public CheckType getCategory() {
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
    public Object getPacket() {
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
    public void setPlayer(Player player) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public double getViolation() {
        return 0D;
    }

    /**
     *
     */
    public void setViolation(double violation) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Checks getCheck() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public void setCheck(Checks check) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}