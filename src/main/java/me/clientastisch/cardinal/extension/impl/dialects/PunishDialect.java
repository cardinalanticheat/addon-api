package me.clientastisch.cardinal.extension.impl.dialects;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public interface PunishDialect {

    /**
     * Punish a player
     *
     * @param uniqueId UUID of the player
     * @param reason reason of the punishment
     * @param minutes the punish duration
     */
    public void punish(String uniqueId, String reason, long minutes);

    /**
     * Unban a player
     *
     * @param uniqueId UUID of the player
     */
    public void pardon(String uniqueId);

    /**
     * Check if the player is banned
     *
     * @param uniqueId UUID of the player
     * @return whether the player is banned or not
     */
    public boolean isBanned(String uniqueId);

    /**
     * Returns the Unix time when the ban expires
     * When a player is banned indefinitly, return 0
     *
     * @param uniqueId UUID of the player
     * @return the Unix time when the ban expires
     */
    public long getExpire(String uniqueId);

    /**
     * Returns the reason for a punishment
     *
     * @param uniqueId UUID of the player
     * @return the reason
     */
    public String getReason(String uniqueId);

}