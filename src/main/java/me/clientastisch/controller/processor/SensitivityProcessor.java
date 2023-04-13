package me.clientastisch.controller.processor;

/**
 * @author Clientastisch
 * @since CAC v. 2.3.3
 */
public abstract class SensitivityProcessor {

    /**
     * Get the player mouse sensitivity that the player has
     * set in the settings in percent.
     *
     * Accuracy to within one percent.
     *
     * @return current mouse sensitivity
     */
    public abstract double getSensitivity();

}
