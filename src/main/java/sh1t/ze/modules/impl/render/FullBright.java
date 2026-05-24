package sh1t.ze.modules.impl.render;

import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.settings.impl.NumberSetting;
import sh1t.ze.utils.misc.Triple;
import sh1t.ze.utils.misc.TripleProvider;

public class FullBright
extends Module
implements TripleProvider {
    public static FullBright INSTANCE;
    public final NumberSetting brightnessSetting = new NumberSetting("Brightness", 100.0f, 0.0f, 100.0f, 1.0f);

    public FullBright() {
        super("FullBright", Category.RENDER);
        INSTANCE = this;
    }

    @Override
    public Triple getTriple() {
        if (this.isEnabled()) {
            return new Triple(this.getName(), String.valueOf(this.brightnessSetting.getValue().intValue()), true);
        }
        return null;
    }
}