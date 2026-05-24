package sh1t.ze.event.impl;

import lombok.*;
import sh1t.ze.event.EventMarker;

@Data
@AllArgsConstructor
public class FallFlyingEvent
implements EventMarker {
    @Getter @Setter
    private float pitch;
}