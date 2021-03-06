package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ac.a;
import android.widget.RemoteViews;
import com.tencent.wcdb.FileUtils;
import java.util.ArrayList;

public class aa$a implements x, y {
    private Bundle mExtras;
    private Builder sN;

    public aa$a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2) {
        boolean z6;
        Builder lights = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        lights = lights.setOngoing(z6);
        if ((notification.flags & 8) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        lights = lights.setOnlyAlertOnce(z6);
        if ((notification.flags & 16) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        lights = lights.setAutoCancel(z6).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & FileUtils.S_IWUSR) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.sN = lights.setFullScreenIntent(pendingIntent2, z6).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
        this.mExtras = new Bundle();
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.mExtras.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    public final void a(a aVar) {
        aa.a(this.sN, aVar);
    }

    public final Builder bg() {
        return this.sN;
    }

    public final Notification build() {
        this.sN.setExtras(this.mExtras);
        return this.sN.build();
    }
}
