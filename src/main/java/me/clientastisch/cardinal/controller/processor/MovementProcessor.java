package me.clientastisch.cardinal.controller.processor;

import me.clientastisch.cardinal.controller.PlayerController;
import me.clientastisch.cardinal.controller.behaviors.Walking;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class MovementProcessor {

    /**
     * Get the movement direction relative to the players camera rotation.
     * E.g. player is moving sidewards or backwards
     *
     * @return enum
     */
    public Walking getWalking() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}