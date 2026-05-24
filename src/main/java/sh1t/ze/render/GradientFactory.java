package sh1t.ze.render;

import sh1t.ze.render.Paint.LinearGradient;

public final class GradientFactory {
    public static Paint.LinearGradient buildLinearGradient(float[] stops, float angle) {
        return new Paint.LinearGradient(stops, angle);
    }
}