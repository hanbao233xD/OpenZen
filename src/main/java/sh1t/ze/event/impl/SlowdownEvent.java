package sh1t.ze.event.impl;

import lombok.Setter;
import lombok.Generated;
import sh1t.ze.event.EventMarker;

public class SlowdownEvent
        implements EventMarker {
    @Setter
    private boolean slowDown;

    public boolean isSlowDown() {
        return this.slowDown;
    }

    @Generated
    public SlowdownEvent(boolean slowDown) {
        this.slowDown = slowDown;
    }
}