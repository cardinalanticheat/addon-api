package me.clientastisch.cardinal.controller;

import me.clientastisch.cardinal.controller.processor.SensitivityProcessor;
import me.clientastisch.cardinal.version.Version;

/**
 * @author Clientastisch
 * @since CAC v. 0.9945
 */
public abstract class PlayerController {

    /**
     * Get the version of a player based on its packet protocol id.
     *
     * @return Version enum
     */
    public abstract Version.Type getVersion();

    /**
     * Check if a player is a bedrock player using the floodgate api.
     *
     * @return true if player is on bedrock
     */
    public abstract boolean isFloodgatePlayer();

    /**
     * Check if a player is whitelisted / exempt from being detected.
     * Players in creative / spectator are considered whitelisted.
     *
     * @return true if player shall be ignored
     */
    public abstract boolean isWhitelisted();

    /**
     * Verified players are not checked for many things.
     * Mostly packet based cheats and some other things here and there.
     * This is not being used by the anticheat beside some commands that can be used by staff.
     * So it is your responsibility to incorperate this into your server system if wanted.
     *
     * @param verify the state
     * @param state the type of verification {@link Verify}
     */
    public abstract void setVerified(boolean verify, Verify state);

    /**
     * Get the sensitivity processor
     *
     * @return sensitivity processor
     */
    public abstract SensitivityProcessor getSensitivityProcessor();

    /**
     * Get the network processor
     *
     * @return network processor
     */
    public abstract PlayerNetwork getNetwork();

    /**
     * Get a PlayerController for a bukkit player outside of events.
     * This method is being used inside of the events as well, but hidden behind abstraction.
     *
     * @param player bukkit player
     * @return Reference of PlayerController for player
     */
    public static PlayerController of(Object player) {
        return null;
    }

    public enum Verify {

        PRIVATE,
        PUBLIC;

    }

}