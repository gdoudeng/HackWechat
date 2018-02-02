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

public final class lt extends c {
    private final int height = 150;
    private final int width = 818;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 818;
            case 1:
                return 150;
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
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-16729600);
                Path j = c.j(looper);
                j.moveTo(62.37216f, 94.90883f);
                j.cubicTo(61.59827f, 95.296074f, 60.725517f, 95.51954f, 59.7987f, 95.51954f);
                j.cubicTo(57.656208f, 95.51954f, 55.79176f, 94.35015f, 54.812424f, 92.62209f);
                j.lineTo(54.438606f, 91.80781f);
                j.lineTo(38.82792f, 57.866478f);
                j.cubicTo(38.659546f, 57.49607f, 38.556053f, 57.079746f, 38.556053f, 56.674133f);
                j.cubicTo(38.556053f, 55.109848f, 39.833515f, 53.83944f, 41.41374f, 53.83944f);
                j.cubicTo(42.054787f, 53.83944f, 42.646404f, 54.050663f, 43.123714f, 54.404236f);
                j.lineTo(61.544205f, 67.39913f);
                j.cubicTo(62.89118f, 68.27158f, 64.49766f, 68.78281f, 66.22772f, 68.78281f);
                j.cubicTo(67.259575f, 68.78281f, 68.242004f, 68.59301f, 69.15955f, 68.2624f);
                j.lineTo(155.79068f, 30.055256f);
                j.cubicTo(140.26187f, 11.920561f, 114.68944f, 0.07056122f, 85.74803f, 0.07056122f);
                j.cubicTo(38.389225f, 0.07056122f, 4.6340853E-4f, 31.76954f, 4.6340853E-4f, 70.876686f);
                j.cubicTo(4.6340853E-4f, 92.21189f, 11.550149f, 111.41648f, 29.627714f, 124.39607f);
                j.cubicTo(31.07973f, 125.42311f, 32.02817f, 127.10679f, 32.02817f, 129.00934f);
                j.cubicTo(32.02817f, 129.63689f, 31.892239f, 130.21545f, 31.726955f, 130.81393f);
                j.cubicTo(30.28421f, 136.15271f, 27.971802f, 144.6981f, 27.863672f, 145.0976f);
                j.cubicTo(27.682943f, 145.768f, 27.40181f, 146.46597f, 27.40181f, 147.16852f);
                j.cubicTo(27.40181f, 148.73128f, 28.682362f, 150.00015f, 30.26104f, 150.00015f);
                j.cubicTo(30.882008f, 150.00015f, 31.388668f, 149.7721f, 31.91232f, 149.47209f);
                j.lineTo(50.684998f, 138.73332f);
                j.cubicTo(52.096848f, 137.92516f, 53.59057f, 137.42618f, 55.237213f, 137.42618f);
                j.cubicTo(56.1146f, 137.42618f, 56.961094f, 137.55934f, 57.758156f, 137.80118f);
                j.cubicTo(66.51658f, 140.2976f, 75.963936f, 141.68434f, 85.74803f, 141.68434f);
                j.cubicTo(133.10374f, 141.68434f, 171.4956f, 109.9823f, 171.4956f, 70.876686f);
                j.cubicTo(171.4956f, 59.031277f, 167.95515f, 47.876175f, 161.7285f, 38.06495f);
                j.lineTo(62.99776f, 94.55067f);
                j.lineTo(62.37216f, 94.90883f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(299.03845f, 79.546455f);
                j.cubicTo(298.41235f, 81.785255f, 297.79706f, 83.96225f, 297.19724f, 86.083626f);
                j.cubicTo(294.85672f, 94.35127f, 292.80838f, 101.589905f, 291.21762f, 108.865616f);
                j.cubicTo(289.65314f, 100.13754f, 286.96942f, 89.88603f, 284.12186f, 79.28225f);
                j.lineTo(270.46518f, 27.81457f);
                j.lineTo(263.38486f, 27.81457f);
                j.lineTo(248.36778f, 79.66697f);
                j.cubicTo(244.93275f, 90.85325f, 241.94139f, 100.848274f, 240.33673f, 108.94596f);
                j.cubicTo(238.81245f, 101.90047f, 236.64507f, 93.356255f, 234.36174f, 84.35625f);
                j.lineTo(219.79298f, 27.81457f);
                j.lineTo(212.0f, 27.81457f);
                j.lineTo(236.41164f, 120.19868f);
                j.lineTo(243.35281f, 120.19868f);
                j.lineTo(259.0501f, 67.26009f);
                j.cubicTo(262.8005f, 54.89648f, 265.22452f, 46.369263f, 266.74106f, 38.733547f);
                j.cubicTo(268.06744f, 46.91158f, 270.24103f, 55.563946f, 273.4287f, 67.240005f);
                j.lineTo(287.21988f, 120.19868f);
                j.lineTo(294.29556f, 120.19868f);
                j.lineTo(322.0f, 27.81457f);
                j.lineTo(314.19772f, 27.81457f);
                j.lineTo(299.03845f, 79.546455f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(350.6362f, 58.14302f);
                j.cubicTo(355.9471f, 58.14302f, 360.2386f, 59.77562f, 363.39f, 62.99628f);
                j.cubicTo(368.52084f, 68.23503f, 369.20456f, 76.02635f, 369.2183f, 79.65247f);
                j.lineTo(329.72678f, 79.65247f);
                j.cubicTo(331.13232f, 69.58811f, 337.3879f, 58.14302f, 350.6362f, 58.14302f);
                j.lineTo(350.6362f, 58.14302f);
                j.close();
                j.moveTo(370.224f, 110.298645f);
                j.cubicTo(366.48807f, 112.03722f, 361.7525f, 113.576126f, 353.3115f, 113.576126f);
                j.cubicTo(338.26086f, 113.576126f, 329.56348f, 103.48719f, 329.38644f, 85.87417f);
                j.lineTo(376.62457f, 85.87417f);
                j.lineTo(376.72073f, 85.441055f);
                j.cubicTo(377.0f, 84.16938f, 377.0f, 83.19259f, 377.0f, 81.41715f);
                j.cubicTo(377.0f, 78.97824f, 376.65967f, 70.44204f, 372.2919f, 63.046963f);
                j.cubicTo(367.82648f, 55.487553f, 360.80936f, 51.65563f, 351.4374f, 51.65563f);
                j.cubicTo(333.8305f, 51.65563f, 322.0f, 65.942024f, 322.0f, 87.20574f);
                j.cubicTo(322.0f, 106.93976f, 334.2609f, 120.19868f, 352.50876f, 120.19868f);
                j.cubicTo(364.13324f, 120.19868f, 370.69254f, 117.23143f, 372.97256f, 115.95668f);
                j.lineTo(373.34952f, 115.744736f);
                j.lineTo(370.224f, 110.298645f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(432.26022f, 114.520134f);
                j.cubicTo(408.7834f, 114.520134f, 394.76825f, 99.46808f, 394.76825f, 74.25805f);
                j.cubicTo(394.76825f, 48.11191f, 409.1839f, 32.501286f, 433.3293f, 32.501286f);
                j.cubicTo(440.02847f, 32.501286f, 446.31955f, 33.78244f, 451.1669f, 36.09719f);
                j.lineTo(454.56293f, 30.12155f);
                j.lineTo(454.2812f, 29.963726f);
                j.cubicTo(452.54358f, 28.993574f, 445.88702f, 25.827814f, 433.19528f, 25.827814f);
                j.cubicTo(405.564f, 25.827814f, 387.0f, 45.235497f, 387.0f, 74.12189f);
                j.cubicTo(387.0f, 108.86478f, 410.23166f, 121.192055f, 430.12515f, 121.192055f);
                j.cubicTo(441.4387f, 121.192055f, 450.21814f, 118.77982f, 454.66193f, 116.52078f);
                j.lineTo(455.0f, 116.35058f);
                j.lineTo(451.74557f, 110.622505f);
                j.cubicTo(446.53427f, 113.06413f, 439.32034f, 114.520134f, 432.26022f, 114.520134f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(498.02084f, 51.961708f);
                j.cubicTo(493.22336f, 51.961708f, 488.61435f, 53.295757f, 484.71936f, 55.80402f);
                j.cubicTo(481.5154f, 57.643723f, 478.59955f, 60.562344f, 476.54788f, 63.948193f);
                j.lineTo(476.54788f, 25.827814f);
                j.lineTo(469.0f, 25.827814f);
                j.lineTo(469.0f, 119.2053f);
                j.lineTo(476.54788f, 119.2053f);
                j.lineTo(476.54788f, 79.18528f);
                j.cubicTo(476.54788f, 76.56635f, 476.6674f, 74.8742f, 477.32013f, 72.90386f);
                j.cubicTo(480.28503f, 64.55374f, 488.07806f, 58.722645f, 496.2756f, 58.722645f);
                j.cubicTo(511.21964f, 58.722645f, 513.4506f, 72.301384f, 513.4506f, 80.39638f);
                j.lineTo(513.4506f, 119.2053f);
                j.lineTo(521.0f, 119.2053f);
                j.lineTo(521.0f, 79.72474f);
                j.cubicTo(521.0f, 53.30037f, 501.85757f, 51.961708f, 498.02084f, 51.961708f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(618.13556f, 113.98891f);
                j.cubicTo(616.8084f, 114.27251f, 614.9532f, 114.508064f, 612.4067f, 114.508064f);
                j.cubicTo(606.33905f, 114.508064f, 603.51385f, 110.412125f, 603.51385f, 101.6174f);
                j.lineTo(603.51385f, 59.797916f);
                j.lineTo(622.0f, 59.797916f);
                j.lineTo(622.0f, 53.385128f);
                j.lineTo(603.51385f, 53.385128f);
                j.lineTo(603.51385f, 38.741722f);
                j.lineTo(595.92975f, 38.741722f);
                j.lineTo(595.92975f, 53.385128f);
                j.lineTo(585.0f, 53.385128f);
                j.lineTo(585.0f, 59.797916f);
                j.lineTo(595.92975f, 59.797916f);
                j.lineTo(595.92975f, 100.39622f);
                j.cubicTo(595.92975f, 107.932556f, 597.29846f, 113.16135f, 600.0959f, 116.35999f);
                j.cubicTo(602.5547f, 119.52145f, 606.52997f, 121.192055f, 611.5968f, 121.192055f);
                j.cubicTo(615.2134f, 121.192055f, 618.3296f, 120.62795f, 620.86066f, 119.513695f);
                j.lineTo(621.2148f, 119.35717f);
                j.lineTo(618.13556f, 113.98891f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(697.5225f, 53.45243f);
                j.cubicTo(697.5225f, 67.199066f, 688.3594f, 75.08321f, 672.3794f, 75.08321f);
                j.cubicTo(669.0021f, 75.08321f, 664.74854f, 74.943634f, 661.479f, 73.891396f);
                j.lineTo(661.479f, 34.27125f);
                j.cubicTo(663.03705f, 33.95834f, 667.0826f, 33.300304f, 673.576f, 33.300304f);
                j.cubicTo(688.7937f, 33.300304f, 697.5225f, 40.644527f, 697.5225f, 53.45243f);
                j.moveTo(673.84326f, 26.821192f);
                j.cubicTo(667.3954f, 26.821192f, 660.8685f, 27.410202f, 654.448f, 28.575953f);
                j.lineTo(654.0f, 28.657248f);
                j.lineTo(654.0f, 119.2053f);
                j.lineTo(661.479f, 119.2053f);
                j.lineTo(661.479f, 80.65734f);
                j.cubicTo(664.4023f, 81.405876f, 667.65356f, 81.56233f, 671.8479f, 81.56233f);
                j.cubicTo(683.35266f, 81.56233f, 692.8574f, 77.914764f, 698.60376f, 71.29913f);
                j.cubicTo(702.90894f, 66.5303f, 705.0f, 60.47147f, 705.0f, 52.779057f);
                j.cubicTo(705.0f, 45.309055f, 702.5475f, 39.03395f, 697.91583f, 34.63938f);
                j.cubicTo(692.7132f, 29.52389f, 684.3883f, 26.821192f, 673.84326f, 26.821192f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(809.9401f, 53.642384f);
                j.lineTo(794.0691f, 95.931625f);
                j.cubicTo(792.6032f, 99.75302f, 791.3569f, 103.47597f, 790.2579f, 106.76046f);
                j.cubicTo(789.99384f, 107.54966f, 789.7391f, 108.31117f, 789.49347f, 109.03884f);
                j.cubicTo(788.198f, 104.82668f, 786.6017f, 100.166855f, 785.1389f, 96.32853f);
                j.lineTo(768.18726f, 53.990063f);
                j.lineTo(768.05066f, 53.642384f);
                j.lineTo(760.0f, 53.642384f);
                j.lineTo(784.2517f, 114.40326f);
                j.cubicTo(784.8841f, 115.98936f, 785.01764f, 116.707794f, 785.01764f, 117.02932f);
                j.cubicTo(785.01764f, 117.621605f, 784.7475f, 118.40927f, 784.2548f, 119.64615f);
                j.cubicTo(780.9716f, 127.456635f, 776.6554f, 132.73337f, 773.6178f, 135.77788f);
                j.cubicTo(769.4213f, 139.83311f, 764.8534f, 141.92073f, 762.505f, 142.80377f);
                j.lineTo(762.05835f, 142.97299f);
                j.lineTo(765.5334f, 149.00662f);
                j.cubicTo(767.254f, 148.3528f, 771.56256f, 146.45901f, 776.3807f, 142.38994f);
                j.cubicTo(784.77515f, 135.04713f, 790.1458f, 123.73061f, 798.32385f, 102.67291f);
                j.lineTo(818.0f, 53.642384f);
                j.lineTo(809.9401f, 53.642384f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(571.40564f, 97.479744f);
                j.cubicTo(571.40564f, 98.44234f, 571.29517f, 99.86476f, 570.7612f, 101.19828f);
                j.cubicTo(568.6989f, 107.25278f, 562.73615f, 113.722664f, 552.1854f, 113.722664f);
                j.cubicTo(546.485f, 113.722664f, 539.82715f, 110.34901f, 539.82715f, 100.83808f);
                j.cubicTo(539.82715f, 96.7808f, 541.17126f, 93.4194f, 543.82275f, 90.845856f);
                j.cubicTo(548.4046f, 86.39772f, 556.8501f, 84.149124f, 568.95056f, 84.149124f);
                j.cubicTo(569.7531f, 84.149124f, 570.57245f, 84.15832f, 571.40564f, 84.178246f);
                j.lineTo(571.40564f, 97.479744f);
                j.close();
                j.moveTo(579.8972f, 118.08037f);
                j.cubicTo(579.0763f, 113.020645f, 578.9612f, 107.77239f, 578.9612f, 102.85369f);
                j.lineTo(578.9612f, 77.598f);
                j.cubicTo(578.9612f, 60.627014f, 571.0512f, 51.65563f, 556.08746f, 51.65563f);
                j.cubicTo(549.34674f, 51.65563f, 542.1456f, 53.749413f, 536.8227f, 57.25489f);
                j.lineTo(536.7936f, 57.273285f);
                j.lineTo(539.87317f, 62.601242f);
                j.cubicTo(544.1051f, 59.724205f, 549.59375f, 58.13164f, 555.41846f, 58.13164f);
                j.cubicTo(555.4967f, 58.13164f, 555.5734f, 58.13011f, 555.65015f, 58.13011f);
                j.cubicTo(560.4299f, 58.13011f, 564.17236f, 59.439106f, 566.7809f, 62.02185f);
                j.cubicTo(569.8927f, 65.102745f, 571.40564f, 69.84671f, 571.40564f, 76.52352f);
                j.lineTo(571.40564f, 77.71296f);
                j.cubicTo(555.578f, 77.58574f, 544.35065f, 80.81838f, 537.8999f, 87.19936f);
                j.cubicTo(533.98553f, 91.06964f, 532.0f, 96.019005f, 532.0f, 101.91409f);
                j.cubicTo(532.0f, 110.71994f, 538.10706f, 120.19868f, 551.5149f, 120.19868f);
                j.cubicTo(561.2754f, 120.19868f, 568.3905f, 115.14202f, 572.06396f, 110.10376f);
                j.lineTo(572.937f, 118.719536f);
                j.lineTo(580.0f, 118.719536f);
                j.lineTo(579.8972f, 118.08037f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(745.4044f, 97.479744f);
                j.cubicTo(745.4044f, 98.4408f, 745.2955f, 99.86323f, 744.76306f, 101.19828f);
                j.cubicTo(742.69775f, 107.25278f, 736.73517f, 113.722664f, 726.1878f, 113.722664f);
                j.cubicTo(720.4861f, 113.722664f, 713.82684f, 110.34901f, 713.82684f, 100.83808f);
                j.cubicTo(713.82684f, 96.7808f, 715.17096f, 93.4194f, 717.8224f, 90.845856f);
                j.cubicTo(722.40405f, 86.39772f, 730.8493f, 84.149124f, 742.9494f, 84.149124f);
                j.cubicTo(743.7519f, 84.149124f, 744.5697f, 84.15832f, 745.4044f, 84.178246f);
                j.lineTo(745.4044f, 97.479744f);
                j.close();
                j.moveTo(753.8972f, 118.08037f);
                j.cubicTo(753.0763f, 113.01911f, 752.96277f, 107.77086f, 752.96277f, 102.85369f);
                j.lineTo(752.96277f, 77.598f);
                j.cubicTo(752.96277f, 60.627014f, 745.05304f, 51.65563f, 730.0867f, 51.65563f);
                j.cubicTo(723.6546f, 51.65563f, 716.82196f, 53.57774f, 711.5836f, 56.79812f);
                j.lineTo(714.6493f, 62.10309f);
                j.cubicTo(718.7645f, 59.54334f, 723.93994f, 58.13164f, 729.4208f, 58.13164f);
                j.cubicTo(729.499f, 58.13164f, 729.57574f, 58.13011f, 729.65247f, 58.13011f);
                j.cubicTo(734.43054f, 58.13011f, 738.17285f, 59.437576f, 740.7813f, 62.020317f);
                j.cubicTo(743.89307f, 65.10121f, 745.4044f, 69.84671f, 745.4044f, 76.52352f);
                j.lineTo(745.4044f, 77.71296f);
                j.cubicTo(729.64325f, 77.58574f, 718.35175f, 80.81838f, 711.8997f, 87.19936f);
                j.cubicTo(707.9855f, 91.06964f, 706.0f, 96.019005f, 706.0f, 101.91409f);
                j.cubicTo(706.0f, 110.71994f, 712.1068f, 120.19868f, 725.5142f, 120.19868f);
                j.cubicTo(735.2744f, 120.19868f, 742.38934f, 115.143555f, 746.0627f, 110.10529f);
                j.lineTo(746.93726f, 118.719536f);
                j.lineTo(754.0f, 118.719536f);
                j.lineTo(753.8972f, 118.08037f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i2);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}