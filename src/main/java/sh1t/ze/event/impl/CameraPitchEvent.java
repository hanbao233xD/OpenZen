package sh1t.ze.event.impl;

import lombok.Generated;
import sh1t.ze.event.EventMarker;

public class CameraPitchEvent
        implements EventMarker {
    private float pitch;

    public float getPitch() {
        return this.pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    @Generated
    public CameraPitchEvent(float pitch) {
        this.pitch = pitch;
    }
}