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

public final class aps extends c {
    private final int height = 42;
    private final int width = 36;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 36;
            case 1:
                return 42;
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
                Paint a = c.a(i2, looper);
                a.setColor(-352965);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(10.8f, 34.663235f);
                j.cubicTo(10.8f, 34.42369f, 10.99419f, 34.2295f, 11.233735f, 34.2295f);
                j.lineTo(24.766266f, 34.2295f);
                j.cubicTo(25.005812f, 34.2295f, 25.2f, 34.42369f, 25.2f, 34.663235f);
                j.lineTo(25.2f, 36.195766f);
                j.cubicTo(25.2f, 36.43531f, 25.005812f, 36.6295f, 24.766266f, 36.6295f);
                j.lineTo(11.233735f, 36.6295f);
                j.cubicTo(10.99419f, 36.6295f, 10.8f, 36.43531f, 10.8f, 36.195766f);
                j.lineTo(10.8f, 34.663235f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(27.390879f, 33.116867f);
                j.cubicTo(27.726053f, 32.8283f, 28.047869f, 32.52449f, 28.355242f, 32.206463f);
                j.cubicTo(30.932549f, 29.539848f, 32.4f, 25.983932f, 32.4f, 22.2f);
                j.cubicTo(32.4f, 14.2471f, 25.9529f, 7.8f, 18.0f, 7.8f);
                j.cubicTo(10.0471f, 7.8f, 3.6f, 14.2471f, 3.6f, 22.2f);
                j.cubicTo(3.6f, 26.00756f, 5.0859246f, 29.583832f, 7.691916f, 32.255028f);
                j.cubicTo(7.9839187f, 32.554337f, 8.288776f, 32.84089f, 8.605573f, 33.113808f);
                j.cubicTo(9.107681f, 33.546375f, 9.865385f, 33.49f, 10.297952f, 32.987892f);
                j.cubicTo(10.730517f, 32.485783f, 10.674143f, 31.72808f, 10.172034f, 31.295513f);
                j.cubicTo(9.907755f, 31.067837f, 9.653421f, 30.828775f, 9.40981f, 30.57907f);
                j.cubicTo(7.2368464f, 28.351734f, 6.0f, 25.374937f, 6.0f, 22.2f);
                j.cubicTo(6.0f, 15.572583f, 11.372583f, 10.2f, 18.0f, 10.2f);
                j.cubicTo(24.627417f, 10.2f, 30.0f, 15.572583f, 30.0f, 22.2f);
                j.cubicTo(30.0f, 25.355255f, 28.778545f, 28.315071f, 26.629532f, 30.538553f);
                j.cubicTo(26.373098f, 30.803873f, 26.104616f, 31.057335f, 25.825005f, 31.298063f);
                j.cubicTo(25.322758f, 31.730467f, 25.266136f, 32.48815f, 25.69854f, 32.990402f);
                j.cubicTo(26.130943f, 33.49265f, 26.88863f, 33.54927f, 27.390879f, 33.116867f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(14.451507f, 40.61775f);
                j.cubicTo(15.604354f, 40.785107f, 16.769964f, 40.8695f, 17.944061f, 40.8695f);
                j.cubicTo(19.138338f, 40.8695f, 20.323826f, 40.78218f, 21.496016f, 40.60905f);
                j.cubicTo(22.043661f, 40.528164f, 22.432756f, 39.931957f, 22.365084f, 39.277386f);
                j.cubicTo(22.29741f, 38.622814f, 21.798594f, 38.15775f, 21.250948f, 38.238636f);
                j.cubicTo(20.160011f, 38.399765f, 19.056368f, 38.481056f, 17.944061f, 38.481056f);
                j.cubicTo(16.850542f, 38.481056f, 15.7653885f, 38.40249f, 14.69244f, 38.24673f);
                j.cubicTo(14.144653f, 38.16721f, 13.64665f, 38.633514f, 13.580118f, 39.28825f);
                j.cubicTo(13.513587f, 39.94299f, 13.903721f, 40.538227f, 14.451507f, 40.61775f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(23.078135f, 25.76822f);
                j.cubicTo(23.50241f, 26.277353f, 24.259089f, 26.346142f, 24.76822f, 25.921865f);
                j.cubicTo(25.277353f, 25.49759f, 25.346142f, 24.740911f, 24.921865f, 24.23178f);
                j.lineTo(20.921865f, 19.431778f);
                j.cubicTo(20.44245f, 18.85648f, 19.559004f, 18.856f, 19.078966f, 19.430782f);
                j.lineTo(15.999788f, 23.117685f);
                j.lineTo(12.920861f, 19.432774f);
                j.cubicTo(12.495919f, 18.924196f, 11.739152f, 18.856396f, 11.230575f, 19.281338f);
                j.cubicTo(10.721997f, 19.70628f, 10.654198f, 20.463047f, 11.079139f, 20.971624f);
                j.lineTo(15.079139f, 25.75889f);
                j.cubicTo(15.558899f, 26.333075f, 16.441404f, 26.332975f, 16.921034f, 25.758682f);
                j.lineTo(19.998987f, 22.073246f);
                j.lineTo(23.078135f, 25.76822f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(16.8f, 2.6294985f);
                j.cubicTo(16.8f, 1.9667568f, 17.337257f, 1.4294986f, 18.0f, 1.4294986f);
                j.cubicTo(18.662743f, 1.4294986f, 19.2f, 1.9667568f, 19.2f, 2.6294985f);
                j.lineTo(19.2f, 4.257601f);
                j.cubicTo(19.2f, 4.920343f, 18.662743f, 5.457601f, 18.0f, 5.457601f);
                j.cubicTo(17.337257f, 5.457601f, 16.8f, 4.920343f, 16.8f, 4.257601f);
                j.lineTo(16.8f, 2.6294985f);
                j.close();
                j.moveTo(32.541836f, 9.06067f);
                j.cubicTo(33.05688f, 8.643594f, 33.81252f, 8.723014f, 34.229595f, 9.238061f);
                j.cubicTo(34.64667f, 9.753108f, 34.567253f, 10.508744f, 34.052204f, 10.92582f);
                j.lineTo(32.78693f, 11.950418f);
                j.cubicTo(32.271885f, 12.367496f, 31.516249f, 12.288075f, 31.09917f, 11.773028f);
                j.cubicTo(30.682095f, 11.257981f, 30.761515f, 10.502345f, 31.276562f, 10.085268f);
                j.lineTo(32.541836f, 9.06067f);
                j.close();
                j.moveTo(1.9477956f, 10.92582f);
                j.cubicTo(1.4327486f, 10.508744f, 1.3533281f, 9.753108f, 1.7704049f, 9.238061f);
                j.cubicTo(2.1874819f, 8.723014f, 2.9431176f, 8.643594f, 3.4581645f, 9.06067f);
                j.lineTo(4.723438f, 10.085268f);
                j.cubicTo(5.238485f, 10.502345f, 5.3179054f, 11.257981f, 4.9008284f, 11.773028f);
                j.cubicTo(4.483752f, 12.288075f, 3.7281158f, 12.367496f, 3.213069f, 11.950418f);
                j.lineTo(1.9477956f, 10.92582f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
