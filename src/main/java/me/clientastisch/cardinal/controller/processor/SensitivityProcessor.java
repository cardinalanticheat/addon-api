package me.clientastisch.cardinal.controller.processor;

/**
 * @author Clientastisch
 * @since CAC v. 2.3.3
 */
public abstract class SensitivityProcessor {

    /**
     * Get the calculated mouse sensitivity
     * This value is not constant.
     *
     * @return player mouse sensitivity
     */
    public abstract double getSensitivity();

}