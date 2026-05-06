package me.clientastisch.cardinal.extension.impl.dialects;

import java.util.List;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public interface ViolationDialect {

    /**
     * Add numerus violations to the players
     * violation history
     *
     * @param uniqueId UUID of the player
     * @param violations List of violations
     */
    public void addViolations(String uniqueId, List<String> violations);

    /**
     * Remove violations which have been collected so far
     *
     * @param uniqueId UUID of the player
     */
    public void removeViolations(String uniqueId);

    /**
     * Returns a list of collected violations
     *
     * @param uniqueId UUID of the player
     * @return List of violations
     */
    public List<String> getViolations(String uniqueId);

    /**
     * Returns a list of collected violations
     *
     * @param uniqueId UUID of the player
     * @return List of violations
     */
    public List<String> getViolations();

}