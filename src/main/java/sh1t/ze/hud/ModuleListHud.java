package sh1t.ze.hud;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.minecraft.util.Mth;
import sh1t.ze.ZenClient;
import sh1t.ze.event.impl.GlRenderEvent;
import sh1t.ze.event.impl.Render2DEvent;
import sh1t.ze.modules.Module;
import sh1t.ze.modules.impl.render.Interface;
import sh1t.ze.render.FontPresets;
import sh1t.ze.render.FontRenderer;
import sh1t.ze.render.GlHelper;
import sh1t.ze.utils.render.ColorUtil;
import sh1t.ze.event.EventTarget;

public class ModuleListHud
        extends HudElement {
    public ModuleListHud() {
        super("ModuleList");
    }

    private List<Module> getVisibleModules() {
        return ZenClient.getInstance().getModuleManager().getModules().stream()
                .filter(module -> !(module instanceof ModuleListHud) && !(module instanceof Interface))
                .filter(Module::isEnabled).filter(module -> !module.getName().isEmpty())
                .sorted((a,
                        b) -> Mth.ceil(GlHelper.getStringWidth(b.getName(), FontPresets.pingfang(16.0f))
                                - GlHelper.getStringWidth(a.getName(), FontPresets.pingfang(16.0f))))
                .collect(Collectors.toList());
    }

    @Override
    public void onRender2D(Render2DEvent render2DEvent, float x, float y) {
    }

    @EventTarget
    public void onGlRenderDirect(GlRenderEvent glRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (!ZenClient.getInstance().getModuleManager().getModule(Interface.class).isEnabled()) {
            return;
        }
        FontRenderer fontRenderer = FontPresets.pingfang(16.0f);
        List<Module> visibleModules = this.getVisibleModules();
        GlHelper.drawTextShadowLegacy("Z", 4.0f, 4.0f, fontRenderer, ColorUtil.getRainbowColor(10, 1).getRGB());
        GlHelper.drawTextShadowLegacy("en (" + mc.getFps() + "FPS)", 4.0f + GlHelper.getStringWidth("Z", fontRenderer),
                4.0f, fontRenderer, -1);
        if (!visibleModules.isEmpty()) {
            float offsetY = 0.0f;
            for (Module module : visibleModules) {
                GlHelper.drawTextShadowLegacy(module.getName(), 4.0f, 16.0f + offsetY, fontRenderer,
                        ColorUtil.getRainbowColor(10, visibleModules.indexOf(module) * 8).getRGB());
                Objects.requireNonNull(mc.font);
                offsetY += (float) (9 + 2);
            }
        }
    }

    @Override
    public void onGlRender(GlRenderEvent glRenderEvent, float x, float y) {
    }

    @Override
    public void onSettings() {
    }
}