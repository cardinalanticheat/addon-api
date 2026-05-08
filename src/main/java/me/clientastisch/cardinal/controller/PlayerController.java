package me.clientastisch.cardinal.controller;

import me.clientastisch.cardinal.controller.PlayerController;
import me.clientastisch.cardinal.controller.PlayerNetwork;
import me.clientastisch.cardinal.controller.processor.MovementProcessor;
import me.clientastisch.cardinal.controller.processor.SensitivityProcessor;
import me.clientastisch.cardinal.version.Version;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PlayerController {

    /**
     * Get the version of a player based on its packet protocol id.
     *
     * @return Version enum
     */
    public Version.Type getVersion() {
        return null;
    }

    /**
     * Check if a player is a bedrock player using the floodgate api.
     *
     * @return true if player is on bedrock
     */
    public boolean isFloodgatePlayer() {
        return false;
    }

    /**
     * Check if a player is whitelisted / exempt from being detected.
     * Players in creative / spectator are considered whitelisted.
     *
     * @return true if player shall be ignored
     */
    public boolean isWhitelisted() {
        return false;
    }

    /**
     * Whitelist a player for a certain amount of time.
     * If player is already whitelisted, it will not do anything.
     *
     * @param time time in millseconds
     */
    public void setWhitelistedForMs(long time) {}

    /**
     * Verified players are not checked for many things.
     * Mostly packet based cheats and some other things here and there.
     * This is not being used by the anticheat beside some commands that can be used by staff.
     * So it is your responsibility to incorperate this into your server system if wanted.
     *
     * @param verify the state
     * @param state the type of verification {@link Verify}
     */
    public void setVerified(boolean verify, Verify state) {}

    /**
     * Enable or disable flags / alerts for the current player.
     * Using this method ignores permission.
     *
     * @param showingFlags state
     */
    public void setShowingFlags(boolean showingFlags) {}

    /**
     * Get the sensitivity processor
     *
     * @return sensitivity processor
     */
    public SensitivityProcessor getSensitivityProcessor() {
        return null;
    }

    /**
     * Get the movement processor.
     * It offers some QoL improvements to handle and work with movement.
     *
     * @return movement processor
     */
    public MovementProcessor getMovementProcessor() {
        return null;
    }

    /**
     * Get the network processor
     *
     * @return network processor
     */
    public PlayerNetwork getNetwork() {
        return null;
    }

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