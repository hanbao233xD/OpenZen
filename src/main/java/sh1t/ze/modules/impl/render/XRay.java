package sh1t.ze.modules.impl.render;

import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;

public class XRay extends Module {
    public static XRay INSTANCE;

    public XRay() {
        super("XRay", Category.RENDER);
        INSTANCE = this;
    }
}
