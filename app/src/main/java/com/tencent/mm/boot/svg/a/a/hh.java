package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class hh extends c {
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
                c.f(looper);
                c.e(looper);
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
                i2 = c.a(i2, looper);
                i2.setColor(-8617851);
                canvas.save();
                Paint a = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(88.98887f, 65.823074f);
                j.cubicTo(88.89869f, 63.170345f, 87.255264f, 60.917454f, 84.9405f, 59.961655f);
                j.lineTo(84.9405f, 59.71703f);
                j.lineTo(68.109055f, 54.481007f);
                j.lineTo(68.71548f, 54.481007f);
                j.cubicTo(68.71548f, 54.481007f, 66.46022f, 54.097507f, 66.46022f, 52.20633f);
                j.lineTo(66.46022f, 53.968163f);
                j.lineTo(66.44624f, 53.963623f);
                j.lineTo(66.44624f, 49.67024f);
                j.cubicTo(66.45075f, 49.66706f, 66.45481f, 49.663883f, 66.45932f, 49.66071f);
                j.lineTo(66.45932f, 51.29274f);
                j.cubicTo(66.45932f, 50.144054f, 67.36151f, 49.03304f, 67.36151f, 49.03304f);
                j.lineTo(67.33626f, 49.03304f);
                j.cubicTo(72.19574f, 45.30106f, 75.48529f, 38.039978f, 75.47853f, 29.270761f);
                j.cubicTo(75.46906f, 17.741253f, 68.396255f, 10.0f, 59.679577f, 10.0f);
                j.cubicTo(53.00083f, 10.0f, 47.299126f, 14.547539f, 45.000137f, 21.85764f);
                j.cubicTo(54.34443f, 25.274193f, 61.041206f, 34.628414f, 61.05248f, 47.25033f);
                j.cubicTo(61.060143f, 55.714108f, 58.636265f, 63.1649f, 54.675816f, 68.67596f);
                j.lineTo(55.6763f, 69.0f);
                j.lineTo(76.62464f, 69.0f);
                j.lineTo(88.300835f, 69.0f);
                j.lineTo(89.00014f, 69.0f);
                j.lineTo(89.00014f, 65.823074f);
                j.lineTo(88.98887f, 65.823074f);
                j.close();
                j.moveTo(61.913708f, 77.961655f);
                j.lineTo(61.913708f, 77.71748f);
                j.lineTo(44.97163f, 72.48101f);
                j.lineTo(45.581596f, 72.48101f);
                j.cubicTo(45.581596f, 72.48101f, 43.31146f, 72.09751f, 43.31146f, 70.20633f);
                j.lineTo(43.31146f, 71.967705f);
                j.lineTo(43.29739f, 71.96362f);
                j.lineTo(43.29739f, 68.124084f);
                j.cubicTo(43.30193f, 68.12091f, 43.306015f, 68.11773f, 43.31055f, 68.115005f);
                j.lineTo(43.31055f, 69.74658f);
                j.cubicTo(43.31055f, 68.59744f, 44.218697f, 67.486885f, 44.218697f, 67.486885f);
                j.lineTo(44.191013f, 67.486885f);
                j.cubicTo(49.083927f, 63.71043f, 52.3961f, 56.04134f, 52.388836f, 47.270763f);
                j.cubicTo(52.37976f, 35.741253f, 45.260277f, 28.0f, 36.48607f, 28.0f);
                j.cubicTo(27.711407f, 28.0f, 20.60463f, 35.741253f, 20.61416f, 47.270763f);
                j.cubicTo(20.621422f, 56.412132f, 24.235397f, 63.911938f, 29.476868f, 67.486885f);
                j.lineTo(29.235874f, 67.486885f);
                j.cubicTo(29.235874f, 67.486885f, 30.144022f, 68.59744f, 30.144022f, 69.74658f);
                j.lineTo(30.144022f, 67.928474f);
                j.cubicTo(30.148106f, 67.9312f, 30.152191f, 67.93438f, 30.156729f, 67.9371f);
                j.lineTo(30.156729f, 71.96362f);
                j.lineTo(30.143114f, 71.967705f);
                j.lineTo(30.143114f, 70.20633f);
                j.cubicTo(30.143114f, 72.09751f, 27.872974f, 72.48101f, 27.872974f, 72.48101f);
                j.lineTo(28.482944f, 72.48101f);
                j.lineTo(11.540868f, 77.71748f);
                j.lineTo(11.540868f, 77.79736f);
                j.cubicTo(8.977545f, 78.634705f, 7.108152f, 81.00197f, 7.0114827f, 83.823074f);
                j.lineTo(7.000137f, 83.823074f);
                j.lineTo(7.000137f, 87.0f);
                j.lineTo(7.704506f, 87.0f);
                j.lineTo(19.457306f, 87.0f);
                j.lineTo(53.54297f, 87.0f);
                j.lineTo(65.29577f, 87.0f);
                j.lineTo(66.00014f, 87.0f);
                j.lineTo(66.00014f, 83.823074f);
                j.lineTo(65.98879f, 83.823074f);
                j.cubicTo(65.89802f, 81.1708f, 64.24375f, 78.91746f, 61.913708f, 77.961655f);
                j.lineTo(61.913708f, 77.961655f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
