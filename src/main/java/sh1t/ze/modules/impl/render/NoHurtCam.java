package sh1t.ze.modules.impl.render;

import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;

public class NoHurtCam
        extends Module {
    public static NoHurtCam INSTANCE;

    public NoHurtCam() {
        super("NoHurtCam", Category.RENDER);
        INSTANCE = this;
    }
}