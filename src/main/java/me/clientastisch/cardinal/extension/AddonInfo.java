package me.clientastisch.cardinal.extension;

import me.clientastisch.cardinal.extension.impl.Addon;

/**
 * @author Clientastisch
 * @since CAC v. 0.9945
 */
public class AddonInfo {

    public String name, author, version, main;
    private Class<? extends Addon> mainClass;
    private Addon addon;

    public Class<? extends Addon> getMainClass() {
        return null;
    }

    public Addon getAddon() {
        return null;
    }
}
