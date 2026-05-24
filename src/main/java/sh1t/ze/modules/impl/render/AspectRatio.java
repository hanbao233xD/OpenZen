package sh1t.ze.modules.impl.render;

import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.settings.impl.NumberSetting;

public class AspectRatio
        extends Module {
    public static AspectRatio INSTANCE;
    public final NumberSetting ratioSetting = new NumberSetting("Ratio", 1.78f, 0.1f, 5.0f, 0.1f);

    public AspectRatio() {
        super("AspectRatio", Category.RENDER);
        INSTANCE = this;
    }
}