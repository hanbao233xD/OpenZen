package sh1t.ze.event.impl;

import lombok.Generated;
import net.minecraft.network.protocol.Packet;
import sh1t.ze.event.Event;

public class PacketSendEvent
extends Event {
    private final Packet<?> packet;

    @Generated
    public PacketSendEvent(Packet<?> packet) {
        this.packet = packet;
    }
}