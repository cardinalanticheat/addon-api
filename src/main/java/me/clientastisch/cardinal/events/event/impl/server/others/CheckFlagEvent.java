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
    public CheckType getCategory() {
        return null;
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
    public void setPlayer(Player player) {}

    /**
     *
     */
    public double getViolation() {
        return 0D;
    }

    /**
     *
     */
    public void setViolation(double violation) {}

    /**
     *
     */
    public Checks getCheck() {
        return null;
    }

    /**
     *
     */
    public void setCheck(Checks check) {}

}