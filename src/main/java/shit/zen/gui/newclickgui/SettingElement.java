package sh1t.ze.gui.newclickgui;

import lombok.Getter;
import lombok.Generated;
import sh1t.ze.gui.newclickgui.CategoryPanel;
import sh1t.ze.gui.newclickgui.UIElement;
import sh1t.ze.settings.Setting;
import sh1t.ze.utils.animation.SmoothAnimationTimer;

public abstract class SettingElement<T extends Setting<?>>
extends UIElement {
    @Getter
    protected final CategoryPanel parentPanel;
    @Getter
    protected final T setting;
    @Getter
    protected final SmoothAnimationTimer visibilityTimer = new SmoothAnimationTimer();

    @Generated
    public SettingElement(CategoryPanel categoryPanel, T setting) {
        this.parentPanel = categoryPanel;
        this.setting = setting;
    }
}