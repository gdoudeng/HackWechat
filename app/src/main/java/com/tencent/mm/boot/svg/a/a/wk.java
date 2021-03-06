package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class wk extends c {
    private final int height = 132;
    private final int width = 132;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 132;
            case 1:
                return 132;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix f = c.f(looper);
                float[] e = c.e(looper);
                Paint i2 = c.i(looper);
                i2.setFlags(385);
                i2.setStyle(Style.FILL);
                Paint i3 = c.i(looper);
                i3.setFlags(385);
                i3.setStyle(Style.STROKE);
                i2.setColor(WebView.NIGHT_MODE_COLOR);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                c.a(i3, looper).setStrokeWidth(1.0f);
                i3 = c.a(i2, looper);
                i3.setColor(-1907998);
                canvas.save();
                Paint a = c.a(i3, looper);
                Path j = c.j(looper);
                j.moveTo(65.38f, 0.0f);
                j.lineTo(68.18f, 0.0f);
                j.cubicTo(85.21f, 0.57f, 101.88f, 7.96f, 113.62f, 20.32f);
                j.cubicTo(124.75f, 31.8f, 131.3f, 47.43f, 132.0f, 63.38f);
                j.lineTo(132.0f, 66.62f);
                j.cubicTo(131.9f, 83.95f, 124.61f, 101.09f, 112.16f, 113.16f);
                j.cubicTo(100.64f, 124.56f, 84.79f, 131.31f, 68.62f, 132.0f);
                j.lineTo(63.81f, 132.0f);
                j.cubicTo(47.0f, 131.44f, 30.52f, 124.23f, 18.82f, 112.13f);
                j.cubicTo(6.97f, 100.12f, 0.08f, 83.42f, 0.0f, 66.54f);
                j.lineTo(0.0f, 65.4f);
                j.cubicTo(0.1f, 48.3f, 7.18f, 31.4f, 19.33f, 19.36f);
                j.cubicTo(31.36f, 7.2f, 48.27f, 0.11f, 65.38f, 0.0f);
                j.lineTo(65.38f, 0.0f);
                j.close();
                j.moveTo(43.89f, 43.93f);
                j.cubicTo(39.92f, 44.73f, 38.86f, 49.15f, 40.22f, 52.51f);
                j.cubicTo(39.07f, 53.92f, 37.35f, 55.16f, 37.21f, 57.14f);
                j.cubicTo(37.06f, 58.92f, 38.18f, 60.48f, 38.79f, 62.08f);
                j.cubicTo(37.49f, 63.78f, 35.58f, 65.5f, 36.05f, 67.89f);
                j.cubicTo(36.16f, 70.06f, 38.14f, 71.22f, 39.59f, 72.52f);
                j.cubicTo(38.44f, 74.14f, 36.68f, 75.73f, 37.02f, 77.93f);
                j.cubicTo(37.17f, 80.87f, 39.95f, 83.2f, 42.86f, 82.97f);
                j.cubicTo(49.81f, 83.1f, 56.76f, 82.95f, 63.71f, 82.99f);
                j.cubicTo(62.69f, 87.61f, 62.31f, 92.38f, 63.05f, 97.07f);
                j.cubicTo(63.6f, 100.51f, 63.89f, 104.86f, 67.46f, 106.59f);
                j.cubicTo(69.15f, 107.71f, 72.47f, 108.45f, 73.28f, 105.92f);
                j.cubicTo(73.72f, 101.08f, 72.82f, 96.08f, 74.5f, 91.38f);
                j.cubicTo(76.47f, 85.0f, 81.87f, 78.59f, 89.07f, 78.7f);
                j.cubicTo(90.86f, 78.38f, 93.95f, 78.6f, 93.92f, 76.02f);
                j.cubicTo(94.0f, 66.77f, 94.24f, 57.49f, 93.74f, 48.25f);
                j.cubicTo(88.93f, 47.98f, 84.07f, 47.45f, 79.68f, 45.33f);
                j.cubicTo(68.56f, 40.0f, 55.49f, 40.72f, 43.89f, 43.93f);
                j.lineTo(43.89f, 43.93f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-5000269);
                float[] a2 = c.a(e, 1.0f, 0.0f, 35.0f, 0.0f, 1.0f, 41.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(8.89f, 2.93f);
                j.cubicTo(20.49f, -0.28f, 33.56f, -1.0f, 44.68f, 4.33f);
                j.cubicTo(49.07f, 6.45f, 53.93f, 6.98f, 58.74f, 7.25f);
                j.cubicTo(59.24f, 16.49f, 59.0f, 25.77f, 58.92f, 35.02f);
                j.cubicTo(58.95f, 37.6f, 55.86f, 37.38f, 54.07f, 37.7f);
                j.cubicTo(46.87f, 37.59f, 41.47f, 44.0f, 39.5f, 50.38f);
                j.cubicTo(37.82f, 55.08f, 38.72f, 60.08f, 38.28f, 64.92f);
                j.cubicTo(37.47f, 67.45f, 34.15f, 66.71f, 32.46f, 65.59f);
                j.cubicTo(28.89f, 63.86f, 28.6f, 59.51f, 28.05f, 56.07f);
                j.cubicTo(27.31f, 51.38f, 27.69f, 46.61f, 28.71f, 41.99f);
                j.cubicTo(21.76f, 41.95f, 14.81f, 42.1f, 7.86f, 41.97f);
                j.cubicTo(4.95f, 42.2f, 2.17f, 39.87f, 2.02f, 36.93f);
                j.cubicTo(1.68f, 34.73f, 3.44f, 33.14f, 4.59f, 31.52f);
                j.cubicTo(3.14f, 30.22f, 1.16f, 29.06f, 1.05f, 26.89f);
                j.cubicTo(0.58f, 24.5f, 2.49f, 22.78f, 3.79f, 21.08f);
                j.cubicTo(3.18f, 19.48f, 2.06f, 17.92f, 2.21f, 16.14f);
                j.cubicTo(2.35f, 14.16f, 4.07f, 12.92f, 5.22f, 11.51f);
                j.cubicTo(3.86f, 8.15f, 4.92f, 3.73f, 8.89f, 2.93f);
                j.lineTo(8.89f, 2.93f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
