package sh1t.ze.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.ChatScreen;
import org.lwjgl.glfw.GLFW;
import sh1t.ze.ClientBase;
import sh1t.ze.ZenClient;
import sh1t.ze.hud.HudElement;
import sh1t.ze.modules.Module;

@Patch(ChatScreen.class)
public class ChatScreenPatch {
    @Inject(method = "render", desc = "(Lnet/minecraft/client/gui/GuiGraphics;IIF)V")
    public static void onRender(ChatScreen screen, GuiGraphics graphics, int mouseX, int mouseY, float partialTick, CallbackInfo callbackInfo) {
        try {
            for (HudElement element : ZenClient.getInstance().getHudManager().getHudElements().stream().filter(Module::isEnabled).toList()) {
                if (!element.isDragging()) continue;
                element.mouseDragged(mouseX, mouseY);
                boolean leftDown = GLFW.glfwGetMouseButton(ClientBase.mc.getWindow().getWindow(), 0) == 1;
                if (!leftDown) {
                    element.setDragging(false);
                }
            }
        } catch (Exception exception) {
            ClientBase.logger.error(exception);
            ClientBase.logger.error(exception.getMessage());
        }
    }

    @Inject(method = "mouseClicked", desc = "(DDI)Z")
    public static void onMouseClicked(double mouseX, double mouseY, int button, CallbackInfo callbackInfo) {
        try {
            for (HudElement element : ZenClient.getInstance().getHudManager().getHudElements().stream().filter(Module::isEnabled).toList()) {
                if (element.mousePressed((int) mouseX, (int) mouseY, button)) {
                    break;
                }
            }
        } catch (Exception exception) {
            ClientBase.logger.error(exception);
            ClientBase.logger.error(exception.getMessage());
        }
    }
}
