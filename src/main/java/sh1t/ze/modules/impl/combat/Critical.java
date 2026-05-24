package sh1t.ze.modules.impl.combat;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import sh1t.ze.event.impl.EntityRemoveEvent;
import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.event.EventTarget;

public class Critical
        extends Module {
    public static Critical INSTANCE;

    public Critical() {
        super("Critical", Category.COMBAT);
        INSTANCE = this;
    }

    @EventTarget
    public void onEntityRemove(EntityRemoveEvent entityRemoveEvent) {
        if (mc.player == null) {
            return;
        }
        boolean canCrit = mc.player.fallDistance > 0.0f && !mc.player.onGround() && !mc.player.onClimbable()
                && !mc.player.isInWater() && !mc.player.hasEffect(MobEffects.BLINDNESS) && !mc.player.isPassenger()
                && entityRemoveEvent.entity() instanceof LivingEntity;
        boolean wasSprinting = mc.player.isSprinting();
        if (canCrit && !entityRemoveEvent.dead()) {
            mc.player.resetAttackStrengthTicker();
        }
        if (canCrit && wasSprinting && entityRemoveEvent.dead()) {
            mc.options.keySprint.setDown(false);
        }
    }
}