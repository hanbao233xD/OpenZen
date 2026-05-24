package sh1t.ze.modules.impl.render;

import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;

public class ItemTags extends Module {
    public static ItemTags INSTANCE;

    public ItemTags() {
        super("ItemTags", Category.RENDER);
        INSTANCE = this;
    }
}
