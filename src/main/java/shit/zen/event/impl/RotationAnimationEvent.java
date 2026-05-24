package sh1t.ze.event.impl;

import lombok.*;
import sh1t.ze.event.EventMarker;

@ToString
@Data
@AllArgsConstructor
public class RotationAnimationEvent
implements EventMarker {
    @Getter @Setter
    private float yaw, lastYaw;
    @Getter @Setter
    private float pitch, lastPitch;
}