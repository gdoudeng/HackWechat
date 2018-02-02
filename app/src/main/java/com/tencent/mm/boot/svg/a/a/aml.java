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

public final class aml extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                canvas.save();
                float[] a = c.a(e, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f);
                f.reset();
                f.setValues(a);
                canvas.concat(f);
                Paint a2 = c.a(i2, looper);
                a2.setColor(-7829368);
                canvas.save();
                Paint a3 = c.a(a2, looper);
                Path j = c.j(looper);
                j.moveTo(19.0f, 0.0f);
                j.lineTo(23.0f, 0.0f);
                j.lineTo(23.0f, 7.0f);
                j.lineTo(19.0f, 7.0f);
                j.lineTo(19.0f, 0.0f);
                j.lineTo(19.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(28.0f, 0.0f);
                j.lineTo(32.0f, 0.0f);
                j.lineTo(32.0f, 7.0f);
                j.lineTo(28.0f, 7.0f);
                j.lineTo(28.0f, 0.0f);
                j.lineTo(28.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(37.0f, 0.0f);
                j.lineTo(41.0f, 0.0f);
                j.lineTo(41.0f, 7.0f);
                j.lineTo(37.0f, 7.0f);
                j.lineTo(37.0f, 0.0f);
                j.lineTo(37.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(46.0f, 0.0f);
                j.lineTo(50.0f, 0.0f);
                j.lineTo(50.0f, 7.0f);
                j.lineTo(46.0f, 7.0f);
                j.lineTo(46.0f, 0.0f);
                j.lineTo(46.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(55.0f, 0.0f);
                j.lineTo(59.0f, 0.0f);
                j.lineTo(59.0f, 7.0f);
                j.lineTo(55.0f, 7.0f);
                j.lineTo(55.0f, 0.0f);
                j.lineTo(55.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                Paint a4 = c.a(a2, looper);
                Path j2 = c.j(looper);
                j2.moveTo(11.338458f, 10.531358f);
                j2.cubicTo(12.756824f, 9.742569f, 14.484832f, 10.161925f, 16.033049f, 10.012156f);
                j2.cubicTo(32.044598f, 10.082048f, 48.056145f, 10.012156f, 64.07768f, 10.0421095f);
                j2.cubicTo(65.86562f, 9.762539f, 68.07308f, 10.890806f, 67.903275f, 12.957632f);
                j2.cubicTo(68.02314f, 29.98149f, 67.923256f, 47.025314f, 67.95322f, 64.05916f);
                j2.cubicTo(68.25288f, 65.876366f, 67.09421f, 68.08298f, 65.0166f, 67.90325f);
                j2.cubicTo(47.986225f, 68.02307f, 30.945864f, 67.923225f, 13.915488f, 67.95318f);
                j2.cubicTo(12.107572f, 68.252716f, 9.960046f, 67.0945f, 10.079908f, 65.06761f);
                j2.cubicTo(9.920092f, 48.383232f, 10.089896f, 31.698853f, 10.0f, 15.014474f);
                j2.cubicTo(10.059931f, 13.46685f, 9.790241f, 11.479901f, 11.338458f, 10.531358f);
                j2.lineTo(11.338458f, 10.531358f);
                j2.close();
                j2.moveTo(15.317875f, 14.379469f);
                j2.cubicTo(13.930113f, 15.038546f, 14.169726f, 16.706211f, 14.039936f, 17.964449f);
                j2.cubicTo(14.009984f, 31.295786f, 14.099839f, 44.62712f, 14.0f, 57.968445f);
                j2.cubicTo(14.019968f, 59.546234f, 13.980032f, 61.16397f, 14.359421f, 62.711803f);
                j2.cubicTo(15.317875f, 64.3595f, 17.474398f, 63.800278f, 19.051855f, 64.0f);
                j2.cubicTo(32.380367f, 63.95007f, 45.698895f, 63.95007f, 59.027405f, 64.0f);
                j2.cubicTo(60.59488f, 63.840225f, 62.631596f, 64.2896f, 63.669918f, 62.77172f);
                j2.cubicTo(64.02934f, 60.86439f, 63.99939f, 58.917114f, 63.99939f, 56.979828f);
                j2.cubicTo(63.859615f, 43.638508f, 64.07926f, 30.287197f, 63.89955f, 16.945875f);
                j2.cubicTo(64.21903f, 15.248253f, 62.7514f, 13.90014f, 61.084087f, 14.089874f);
                j2.cubicTo(47.40614f, 13.930098f, 33.71821f, 14.139804f, 20.040262f, 14.0f);
                j2.cubicTo(18.462805f, 14.029958f, 16.845413f, 13.960056f, 15.317875f, 14.379469f);
                j2.lineTo(15.317875f, 14.379469f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a4);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 19.0f);
                j.lineTo(7.0f, 19.0f);
                j.lineTo(7.0f, 23.0f);
                j.lineTo(0.0f, 23.0f);
                j.lineTo(0.0f, 19.0f);
                j.lineTo(0.0f, 19.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(71.0f, 19.0f);
                j.lineTo(78.0f, 19.0f);
                j.lineTo(78.0f, 23.0f);
                j.lineTo(71.0f, 23.0f);
                j.lineTo(71.0f, 19.0f);
                j.lineTo(71.0f, 19.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 28.0f);
                j.lineTo(7.0f, 28.0f);
                j.lineTo(7.0f, 32.0f);
                j.lineTo(0.0f, 32.0f);
                j.lineTo(0.0f, 28.0f);
                j.lineTo(0.0f, 28.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(71.0f, 28.0f);
                j.lineTo(78.0f, 28.0f);
                j.lineTo(78.0f, 32.0f);
                j.lineTo(71.0f, 32.0f);
                j.lineTo(71.0f, 28.0f);
                j.lineTo(71.0f, 28.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 37.0f);
                j.lineTo(7.0f, 37.0f);
                j.lineTo(7.0f, 41.0f);
                j.lineTo(0.0f, 41.0f);
                j.lineTo(0.0f, 37.0f);
                j.lineTo(0.0f, 37.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(71.0f, 37.0f);
                j.lineTo(78.0f, 37.0f);
                j.lineTo(78.0f, 41.0f);
                j.lineTo(71.0f, 41.0f);
                j.lineTo(71.0f, 37.0f);
                j.lineTo(71.0f, 37.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 46.0f);
                j.lineTo(7.0f, 46.0f);
                j.lineTo(7.0f, 50.0f);
                j.lineTo(0.0f, 50.0f);
                j.lineTo(0.0f, 46.0f);
                j.lineTo(0.0f, 46.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(71.0f, 46.0f);
                j.lineTo(78.0f, 46.0f);
                j.lineTo(78.0f, 50.0f);
                j.lineTo(71.0f, 50.0f);
                j.lineTo(71.0f, 46.0f);
                j.lineTo(71.0f, 46.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 55.0f);
                j.lineTo(7.0f, 55.0f);
                j.lineTo(7.0f, 59.0f);
                j.lineTo(0.0f, 59.0f);
                j.lineTo(0.0f, 55.0f);
                j.lineTo(0.0f, 55.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(71.0f, 55.0f);
                j.lineTo(78.0f, 55.0f);
                j.lineTo(78.0f, 59.0f);
                j.lineTo(71.0f, 59.0f);
                j.lineTo(71.0f, 55.0f);
                j.lineTo(71.0f, 55.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(19.0f, 71.0f);
                j.lineTo(23.0f, 71.0f);
                j.lineTo(23.0f, 78.0f);
                j.lineTo(19.0f, 78.0f);
                j.lineTo(19.0f, 71.0f);
                j.lineTo(19.0f, 71.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(28.0f, 71.0f);
                j.lineTo(32.0f, 71.0f);
                j.lineTo(32.0f, 78.0f);
                j.lineTo(28.0f, 78.0f);
                j.lineTo(28.0f, 71.0f);
                j.lineTo(28.0f, 71.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(37.0f, 71.0f);
                j.lineTo(41.0f, 71.0f);
                j.lineTo(41.0f, 78.0f);
                j.lineTo(37.0f, 78.0f);
                j.lineTo(37.0f, 71.0f);
                j.lineTo(37.0f, 71.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(46.0f, 71.0f);
                j.lineTo(50.0f, 71.0f);
                j.lineTo(50.0f, 78.0f);
                j.lineTo(46.0f, 78.0f);
                j.lineTo(46.0f, 71.0f);
                j.lineTo(46.0f, 71.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(55.0f, 71.0f);
                j.lineTo(59.0f, 71.0f);
                j.lineTo(59.0f, 78.0f);
                j.lineTo(55.0f, 78.0f);
                j.lineTo(55.0f, 71.0f);
                j.lineTo(55.0f, 71.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-2105377);
                e = c.a(a, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 13.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a5 = c.a(i2, looper);
                j2 = c.j(looper);
                j2.moveTo(2.3178751f, 1.3794688f);
                j2.cubicTo(3.8454125f, 0.96005595f, 5.462805f, 1.029958f, 7.0402617f, 1.0f);
                j2.cubicTo(20.71821f, 1.1398042f, 34.40614f, 0.9300979f, 48.084087f, 1.0898741f);
                j2.cubicTo(49.7514f, 0.9001398f, 51.219036f, 2.2482524f, 50.89955f, 3.945876f);
                j2.cubicTo(51.07926f, 17.287197f, 50.859615f, 30.638506f, 50.99939f, 43.979828f);
                j2.cubicTo(50.99939f, 45.917114f, 51.02934f, 47.86439f, 50.669918f, 49.77172f);
                j2.cubicTo(49.631596f, 51.289593f, 47.59488f, 50.840225f, 46.027405f, 51.0f);
                j2.cubicTo(32.698895f, 50.95007f, 19.380365f, 50.95007f, 6.051855f, 51.0f);
                j2.cubicTo(4.4743986f, 50.800278f, 2.3178751f, 51.359497f, 1.3594205f, 49.711803f);
                j2.cubicTo(0.9800322f, 48.16397f, 1.0199678f, 46.546234f, 1.0f, 44.968445f);
                j2.cubicTo(1.0998391f, 31.627123f, 1.0099839f, 18.295786f, 1.0399356f, 4.96445f);
                j2.cubicTo(1.1697264f, 3.7062113f, 0.93011266f, 2.038546f, 2.3178751f, 1.3794688f);
                j2.lineTo(2.3178751f, 1.3794688f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}