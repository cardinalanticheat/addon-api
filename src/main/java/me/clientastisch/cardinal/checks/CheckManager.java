package me.clientastisch.cardinal.checks;

import java.util.Optional;
import me.clientastisch.cardinal.checks.Checks;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public enum CheckManager {

    KILLAURA_A(null, false),
        KILLAURA_B(null, false),
        KILLAURA_C(null, false),
        HEURISTIC_A(null, false),
        REACH_A(null, false),
        REACH_B(null, false),
        HITBOX_A(null, false),
        BLOCKHIT_A(null, false),
        BLOCKHIT_B(null, false),
        WALLATTACK_A(null, false),
        NO_SWING(null, false),
        FLY_A(null, false),
        FLY_B(null, false),
        FLY_C(null, false),
        FLY_D(null, false),
        FLY_E(null, false),
        FLY_F(null, false),
        FLY_G(null, false),
        FLY_H(null, false),
        SPEED_A(null, false),
        SPEED_B(null, false),
        SPEED_C(null, false),
        SPEED_D(null, false),
        SPEED_G(null, false),
        SPEED_J(null, false),
        SPEED_K(null, false),
        SPEED_L(null, false),
        SPEED_M(null, false),
        SPEED_N(null, false),
        WEB_A(null, false),
        STRAFE_A(null, false),
        STRAFE_B(null, false),
        MOTION_A(null, false),
        MOTION_B(null, false),
        INVMOVE_A(null, false),
        JESUS_A(null, false),
        FASTLADDER(null, false),
        VELOCITY_A(null, false),
        VELOCITY_B(null, false),
        NOSLOWDOWN_A(null, false),
        NETFREQUENCE_A(null, false),
        NETFREQUENCE_B(null, false),
        NOFALL(null, false),
        NO_GROUND(null, false),
        PACKETPORT_A(null, false),
        PACKETPORT_B(null, false),
        PACKETPORT_C(null, false),
        BLINK_A(null, false),
        BADPACKET_A(null, false),
        BADPACKET_B(null, false),
        BADPACKET_C(null, false),
        BADPACKET_D(null, false),
        BADPACKET_E(null, false),
        BADPACKET_F(null, false),
        TRANSACTION_A(null, false),
        BEDFUCKER(null, false),
        SCAFFOLD_A(null, false),
        SCAFFOLD_B(null, false),
        SCAFFOLD_C(null, false),
        SCAFFOLD_D(null, false),
        SCAFFOLD_E(null, false),
        SCAFFOLD_F(null, false),
        SCAFFOLD_G(null, false),
        SCAFFOLD_H(null, false);

    private final Class<? extends Checks> clazz;
    private boolean initialize;

    CheckManager(Class<? extends Checks> clazz, boolean initialize) {
        this.clazz = clazz;
        this.initialize = initialize;
    }

    /**
     * Toggle a check by name
     *
     * @param check full name e.g. NetFrequence Type B
     * @param state true to enable, false to disable
     * @return true if enabled
     */
    public static boolean toggleCheck(String check, boolean state) {
        return false;
    }

    /**
     * Get a Check instance by name
     *
     * @param name full name e.g. NetFrequence Type B
     * @return Optional of Check if found, else empty optional
     */
    public static Optional<Checks> getByName(String name) {
        return null;
    }

}