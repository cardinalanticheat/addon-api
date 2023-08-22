package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;

@SuppressWarnings("ALL")
public abstract class PacketEntityActionEvent implements Event<PacketEntityActionEvent> {

    public abstract EnumPlayerAction getAction();

    public static enum EnumPlayerAction {
        START_SNEAKING, STOP_SNEAKING, STOP_SLEEPING, START_SPRINTING, STOP_SPRINTING, RIDING_JUMP, OPEN_INVENTORY;
    }
}
