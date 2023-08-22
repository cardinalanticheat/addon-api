package me.clientastisch.cardinal.extension.impl.dialects;

import java.util.List;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public interface ViolationDialect {

    /**
     * Add numerus violations to the players
     * violation history
     *
     * @param uniqueId UUID of the player
     * @param violations List of violations
     */
    void addViolations(String uniqueId, List<String> violations);

    /**
     * Remove violations which have been collected so far
     *
     * @param uniqueId UUID of the player
     */
    void removeViolations(String uniqueId);

    /**
     * Returns a list of collected violations
     *
     * @param uniqueId UUID of the player
     * @return List of violations
     */
    List<String> getViolations(String uniqueId);

    /**
     * Returns all uniqueIds which have
     * at least one violation stored
     *
     * @return List of uniqueId
     */
    List<String> getViolations();

}
