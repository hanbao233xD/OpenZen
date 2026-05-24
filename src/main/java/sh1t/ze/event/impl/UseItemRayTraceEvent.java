package sh1t.ze.event.impl;

import lombok.*;
import sh1t.ze.event.EventMarker;

@AllArgsConstructor
@Data
public class UseItemRayTraceEvent
        implements EventMarker {
    @Getter
    @Setter
    private float yaw;
    @Getter
    @Setter
    private float pitch;
}