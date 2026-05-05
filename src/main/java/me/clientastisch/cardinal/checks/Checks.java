package me.clientastisch.cardinal.checks;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9999 patch 2
 */
public abstract class Checks {

    /**
     * Trigger a flag / alert for a suspected player.
     * It does not necessarily flag as it can be cancled, hidden, ...
     *
     * @param player suspect
     * @param value  flag information
     */
    public abstract void flag(Player player, String value);

}