package me.clientastisch.checks;

import java.util.Optional;

/**
 * @author Clientastisch
 * @since CAC v. 0.9945
 */
public class CheckManager {

    /**
     * Disable a check for a certain plugin, addon or case to
     * decrease the amount of possible false positives.
     *
     * @param check the name of the detection that will be modified
     * @param toggle set the new toggle-state of a check
     * @return returns whether the check exists or not
     */
    public static boolean toggleCheck(String check, boolean toggle) {
        return false;
    }

    /**
     * Get a check instance by name
     *
     * @param name the name of the detection
     * @return returns an optional of the potential instance
     */
    public static Optional<Checks> getByName(String name) {
        return Optional.empty();
    }
}
