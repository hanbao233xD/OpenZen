package sh1t.ze.event.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import sh1t.ze.event.EventMarker;

@Data
@AllArgsConstructor
public class JumpMarkerEvent
        implements EventMarker {
    private float yaw;
}