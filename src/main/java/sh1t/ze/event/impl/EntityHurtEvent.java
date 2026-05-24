package sh1t.ze.event.impl;

import lombok.Generated;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import sh1t.ze.event.EventMarker;

public record EntityHurtEvent(LivingEntity entity, DamageSource damageSource, float amount)
        implements EventMarker {
    @Override
    @Generated
    public LivingEntity entity() {
        return this.entity;
    }

    @Override
    @Generated
    public DamageSource damageSource() {
        return this.damageSource;
    }

    @Override
    @Generated
    public float amount() {
        return this.amount;
    }

    @Generated
    public EntityHurtEvent {
    }
}