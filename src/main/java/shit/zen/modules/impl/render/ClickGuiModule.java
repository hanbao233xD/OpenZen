package sh1t.ze.modules.impl.render;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sh1t.ze.gui.NewClickGui;
import sh1t.ze.gui.OldClickGui;
import sh1t.ze.gui.PanelClickGui;
import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.settings.impl.ModeSetting;

public class ClickGuiModule
extends Module {
    public static final Logger LOGGER = LogManager.getLogger(ClickGuiModule.class);
    public final ModeSetting styleSetting = new ModeSetting("Mode", "Old", "Panel", "New").withDefault("Old");

    public ClickGuiModule() {
        super("ClickGui", Category.RENDER, 344);
    }

    @Override
    protected void onEnable() {
        try {
            if (this.styleSetting.is("Old")) {
                mc.setScreen(new OldClickGui());
            } else if (this.styleSetting.is("Panel")) {
                mc.setScreen(PanelClickGui.panelClickGui);
            } else {
                mc.setScreen(new NewClickGui());
            }
            LOGGER.info("ClickGUI opened successfully");
        } catch (Exception exception) {
            LOGGER.error("Error opening ClickGUI", exception);
        } finally {
            this.setEnabled(false);
        }
    }
}