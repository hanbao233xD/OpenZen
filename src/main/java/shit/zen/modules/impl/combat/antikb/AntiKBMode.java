package sh1t.ze.modules.impl.combat.antikb;

import java.util.HashMap;
import java.util.Optional;
import sh1t.ze.ClientBase;
import sh1t.ze.event.impl.DisconnectEvent;
import sh1t.ze.event.impl.GameTickEvent;
import sh1t.ze.event.impl.MotionEvent;
import sh1t.ze.event.impl.PreMotionEvent;
import sh1t.ze.event.impl.ReceivePacketEvent;
import sh1t.ze.event.impl.Render2DEvent;
import sh1t.ze.event.impl.RenderEvent;
import sh1t.ze.event.impl.RotationEvent;
import sh1t.ze.event.impl.SprintEvent;
import sh1t.ze.event.impl.StrafeEvent;
import sh1t.ze.event.impl.TickEvent;
import sh1t.ze.modules.impl.combat.antikb.JumpResetMode;
import sh1t.ze.modules.impl.combat.antikb.MixMode;
import sh1t.ze.modules.impl.combat.antikb.NoXZMode;

public abstract class AntiKBMode
extends ClientBase {
    protected final String name;
    private static final HashMap<Class<? extends AntiKBMode>, AntiKBMode> modes = new HashMap<>();

    public AntiKBMode(String string) {
        this.name = string;
    }

    public static void initModes() {
        modes.put(JumpResetMode.class, new JumpResetMode());
        modes.put(MixMode.class, new MixMode());
        modes.put(NoXZMode.class, new NoXZMode());
    }

    public abstract void onEnable();

    public abstract void onDisable();

    public abstract String getName();

    public static Optional<AntiKBMode> findMode(String string) {
        return modes.values().stream().filter(antiKBMode -> antiKBMode.name.equals(string)).findFirst();
    }

    public abstract void onRotation(RotationEvent var1);

    public abstract void onReceivePacket(ReceivePacketEvent var1);

    public abstract void onDisconnect(DisconnectEvent var1);

    public abstract void onPreMotion(PreMotionEvent var1);

    public abstract void onGameTick(GameTickEvent var1);

    public abstract void onSprint(SprintEvent var1);

    public abstract void onTick(TickEvent var1);

    public abstract void onStrafe(StrafeEvent var1);

    public abstract void onMotion(MotionEvent var1);

    public void onRender(RenderEvent renderEvent) {
    }

    public void onRender2D(Render2DEvent render2DEvent) {
    }

    public boolean isActive() {
        return false;
    }
}