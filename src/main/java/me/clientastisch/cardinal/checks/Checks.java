package me.clientastisch.cardinal.checks;

import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public abstract class Checks {

    /**
     * Trigger a flag / alert for a suspected player.
     * It does not necessarily flag as it can be cancled, hidden, ...
     *
     * @param player suspect
     * @param value  flag information
     */
    public void flag(Player player, String value) {}

    /**
     * Enable or disable a check
     *
     * @param state true if enabled
     */
    public void setToggle(boolean state) {}

    /**
     * Set the ban type.
     * E.g. kick, ban, tempban or non
     *
     * @param banType type
     */
    public void setBanType(BanType banType) {}

    public enum BanType {

        PERMANENT(0),
        TEMPORARY(0),
        KICK(0),
        NONE(0);

        private final int index;

        BanType(int index) {
            this.index = index;
        }

    }

}