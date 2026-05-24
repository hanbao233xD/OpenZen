package sh1t.ze.modules.impl.movement;

import sh1t.ze.event.impl.SneakEvent;
import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.event.EventTarget;

public class NoPush
extends Module {
    public NoPush() {
        super("NoPush", Category.MOVEMENT);
    }

    @EventTarget
    public void onSneak(SneakEvent sneakEvent) {
        if (!FireballBlink.INSTANCE.isEnabled()) {
            sneakEvent.setCancelled(true);
        }
    }
}