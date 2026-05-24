package sh1t.ze.modules.impl.movement;

import java.util.HashMap;
import net.minecraft.client.KeyMapping;
import sh1t.ze.event.impl.RotationEvent;
import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.modules.impl.player.InventoryManager;
import sh1t.ze.event.EventTarget;

public class Sprint
        extends Module {
    private final HashMap<String, String> keyMappings = new HashMap<>();

    public Sprint() {
        super("Sprint", Category.MOVEMENT);
        this.setEnabled(true);
    }

    @EventTarget
    public void onRotation(RotationEvent rotationEvent) {
        if (GuiMove.INSTANCE.isEnabled() && InventoryManager.isPerformingAction) {
            return;
        }
        mc.options.toggleSprint().set(false);
        KeyMapping.set(mc.options.keySprint.getKey(), true);
    }
}