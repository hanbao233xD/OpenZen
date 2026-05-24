package sh1t.ze.modules.impl.movement;

import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.settings.impl.BooleanSetting;

public class NoDelay
extends Module {
    public static NoDelay INSTANCE;
    public final BooleanSetting fastDig = new BooleanSetting("No Jump Delay", true);

    public NoDelay() {
        super("NoDelay", Category.MOVEMENT);
        INSTANCE = this;
    }
}