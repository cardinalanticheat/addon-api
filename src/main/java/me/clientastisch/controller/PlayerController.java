package me.clientastisch.controller;

import me.clientastisch.controller.processor.SensitivityProcessor;

/**
 * @author Clientastisch
 * @since CAC v. 0.9945
 */
public abstract class PlayerController {

    /**
     * If a player is whitelisted, he will no longer be detected.
     *
     * @return true if a player is whitelisted
     */
    public abstract boolean isWhitelisted();

    /**
     * If a player is whitelisted, he will no longer be detected.
     *
     * @param whitelisted The state of the player whitelist
     * @see PlayerController#isWhitelisted()
     */
    public abstract void setWhitelisted(boolean whitelisted);

    /**
     * If a player is whitelisted, he will no longer be detected.
     *
     * @param whitelisted The state of the player whitelist
     * @param time Time amount of seconds a player keeps the new state
     * @see PlayerController#isWhitelisted()
     */
    public abstract void setWhitelisted(boolean whitelisted, long time);


    /**
     * If a player is verified he will no longer be detected by the most
     * detections.
     *
     * @return The verified state
     */
    public abstract boolean isVerified();

    /**
     * Set a players verify state. He will no longer be detected by the most
     * detections.
     *
     * @param verified whether the player should be verified or not
     * @param state whether the player should be public verified or private
     * @see PlayerController#isVerified()
     */
    public abstract void setVerified(boolean verified, Verify state);

    /**
     * Returns whether a player is showing alerts or not.
     * He can see every violation caused by a player.
     */
    public abstract void isShowingFlags();

    /**
     * Show/Hide alerts caused by players.
     *
     * @param state whether the player can see flags or not
     * @see PlayerController#isShowingFlags()
     */
    public abstract void setShowingFlags(boolean state);

    /**
     * Returns the modification identifier,
     * for instance Vanilla
     *
     * @return Modification identifier
     */
    public abstract String getPaylaod();

    /**
     * Returns the Network controller of the player
     *
     * @see PlayerNetwork
     * @return network data of the player
     */
    public abstract PlayerNetwork getNetwork();

    /**
     * Returns the sensitvitity processor of the player
     *
     * @see SensitivityProcessor
     * @return mouse sensitivity processor
     * @since 2.3.3
     */
    public abstract SensitivityProcessor getSensitivityProcessor();

    /**
     * Returns the PlayerController of a player
     *
     * @param player The player
     * @return PlayerController of {@code player}
     */
    public static PlayerController of(Object player) {
        return null;
    }

    /**
     * Display property, used in order to hide an verification
     * or present the verification to the whole server
     *
     * @see PlayerController#isVerified()
     */
    public enum Verify {
        PRIVATE, PUBLIC
    }
}
