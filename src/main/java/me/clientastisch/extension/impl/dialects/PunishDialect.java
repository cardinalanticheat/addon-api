package me.clientastisch.extension.impl.dialects;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public interface PunishDialect {

    /**
     * Punish a player
     *
     * @param uniqueId UUID of the player
     * @param reason reason of the punishment
     * @param replay replay id
     * @param minutes the punish duration
     */
    void punish(String uniqueId, String reason, String replay, long minutes);

    /**
     * Unban a player
     *
     * @param uniqueId UUID of the player
     */
    void pardon(String uniqueId);

    /**
     * Check if the player is banned
     *
     * @param uniqueId UUID of the player
     * @return whether the player is banned or not
     */
    boolean isBanned(String uniqueId);

    /**
     * Returns the Unix time when the ban expires
     *
     * @param uniqueId UUID of the player
     * @return the Unix time when the ban expires
     */
    long getExpire(String uniqueId);

    /**
     * Returns the replay id
     *
     * @param uniqueId UUID of the player
     * @return the replay id
     */
    String getReplay(String uniqueId);

    /**
     * Returns the reason for a punishment
     *
     * @param uniqueId UUID of the player
     * @return the reason
     */
    String getReason(String uniqueId);

}
