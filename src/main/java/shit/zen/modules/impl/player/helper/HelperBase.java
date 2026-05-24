package sh1t.ze.modules.impl.player.helper;

import lombok.Getter;
import sh1t.ze.ClientBase;
import sh1t.ze.event.impl.MotionEvent;
import sh1t.ze.event.impl.PreMotionEvent;
import sh1t.ze.event.impl.RenderEvent;
import sh1t.ze.event.impl.TickEvent;
import sh1t.ze.utils.rotation.Rotation;

public abstract class HelperBase
extends ClientBase {
    @Getter
    private final String name;

    public HelperBase(String string) {
        this.name = string;
    }

    public void onEnable() {
    }

    public void onDisable() {
    }

    public void onTick(TickEvent tickEvent) {
    }

    public void onMotion(MotionEvent motionEvent) {
    }

    public void onRender(RenderEvent renderEvent) {
    }

    public void onPreMotion(PreMotionEvent preMotionEvent) {
    }

    public boolean isActive() {
        return false;
    }

    public Rotation getTargetRotation() {
        return null;
    }

    }