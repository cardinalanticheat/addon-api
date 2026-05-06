package me.clientastisch.cardinal.extension.impl;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public interface Addon {

    /**
     * Initialize method of your addon
     */
    public void onEnable();

    /**
     * Terminate method of your addon
     */
    public void onDisable();

}