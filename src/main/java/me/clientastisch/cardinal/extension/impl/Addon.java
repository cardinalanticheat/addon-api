package me.clientastisch.cardinal.extension.impl;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public interface Addon {

    /**
     * Initialize method of your addon
     */
    void onEnable();

    /**
     * Terminate method of your addon
     */
    void onDisable();

}