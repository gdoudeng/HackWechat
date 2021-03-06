package com.tencent.mm.bf;

import com.tencent.mm.g.b.ca;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable$Columns;
import java.lang.reflect.Field;

public final class h extends ca {
    protected static a gJc;

    static {
        a aVar = new a();
        aVar.hSY = new Field[14];
        aVar.columns = new String[15];
        StringBuilder stringBuilder = new StringBuilder();
        aVar.columns[0] = "svrid";
        aVar.xjA.put("svrid", "LONG default '0'  PRIMARY KEY ");
        stringBuilder.append(" svrid LONG default '0'  PRIMARY KEY ");
        stringBuilder.append(", ");
        aVar.xjz = "svrid";
        aVar.columns[1] = DownloadInfo.STATUS;
        aVar.xjA.put(DownloadInfo.STATUS, "INTEGER");
        stringBuilder.append(" status INTEGER");
        stringBuilder.append(", ");
        aVar.columns[2] = DownloadSettingTable$Columns.TYPE;
        aVar.xjA.put(DownloadSettingTable$Columns.TYPE, "INTEGER");
        stringBuilder.append(" type INTEGER");
        stringBuilder.append(", ");
        aVar.columns[3] = "scene";
        aVar.xjA.put("scene", "INTEGER");
        stringBuilder.append(" scene INTEGER");
        stringBuilder.append(", ");
        aVar.columns[4] = "createtime";
        aVar.xjA.put("createtime", "LONG");
        stringBuilder.append(" createtime LONG");
        stringBuilder.append(", ");
        aVar.columns[5] = "talker";
        aVar.xjA.put("talker", "TEXT");
        stringBuilder.append(" talker TEXT");
        stringBuilder.append(", ");
        aVar.columns[6] = "content";
        aVar.xjA.put("content", "TEXT");
        stringBuilder.append(" content TEXT");
        stringBuilder.append(", ");
        aVar.columns[7] = "sayhiuser";
        aVar.xjA.put("sayhiuser", "TEXT");
        stringBuilder.append(" sayhiuser TEXT");
        stringBuilder.append(", ");
        aVar.columns[8] = "sayhicontent";
        aVar.xjA.put("sayhicontent", "TEXT");
        stringBuilder.append(" sayhicontent TEXT");
        stringBuilder.append(", ");
        aVar.columns[9] = "imgpath";
        aVar.xjA.put("imgpath", "TEXT");
        stringBuilder.append(" imgpath TEXT");
        stringBuilder.append(", ");
        aVar.columns[10] = "isSend";
        aVar.xjA.put("isSend", "INTEGER");
        stringBuilder.append(" isSend INTEGER");
        stringBuilder.append(", ");
        aVar.columns[11] = "sayhiencryptuser";
        aVar.xjA.put("sayhiencryptuser", "TEXT");
        stringBuilder.append(" sayhiencryptuser TEXT");
        stringBuilder.append(", ");
        aVar.columns[12] = "ticket";
        aVar.xjA.put("ticket", "TEXT");
        stringBuilder.append(" ticket TEXT");
        stringBuilder.append(", ");
        aVar.columns[13] = "flag";
        aVar.xjA.put("flag", "INTEGER");
        stringBuilder.append(" flag INTEGER");
        aVar.columns[14] = "rowid";
        aVar.xjB = stringBuilder.toString();
        gJc = aVar;
    }

    protected final a Ac() {
        return gJc;
    }
}
