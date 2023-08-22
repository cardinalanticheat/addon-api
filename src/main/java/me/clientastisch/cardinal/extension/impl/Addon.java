package me.clientastisch.cardinal.extension.impl;

public interface Addon {

    /**
     * Initialize method of your addon
     */
    void onEnable() throws Exception;

    /**
     * Terminate method of your addon
     */
    void onDisable() throws Exception;

}
