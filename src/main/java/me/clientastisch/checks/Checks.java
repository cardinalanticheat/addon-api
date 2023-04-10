package me.clientastisch.checks;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9999 patch 2
 */
public abstract class Checks {

    /**
     * Throws a flag message for each stuff who has alerts enabled
     *
     * @param player suspected player
     * @param information short information for the flag
     */
    public abstract void flag(Player player, String information);

    /**
     * Setback a player to a certain location in case if setback is enabled for
     * the current detection
     *
     * @param player suspected player
     * @param location setback location
     */
    public abstract void punish(Player player, Location location);

}
