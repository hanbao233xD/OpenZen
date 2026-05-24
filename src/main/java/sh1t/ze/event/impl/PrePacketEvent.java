package sh1t.ze.event.impl;

import lombok.Getter;
import lombok.Generated;
import net.minecraft.network.protocol.Packet;
import sh1t.ze.event.Event;

public class PrePacketEvent
extends Event {
    @Getter
    private final Packet<?> packet;

    @Generated
    public PrePacketEvent(Packet<?> packet) {
        this.packet = packet;
    }
}