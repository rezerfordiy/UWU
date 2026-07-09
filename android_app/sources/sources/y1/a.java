package y1;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static ArrayList<Double> a(Context context, String str) {
        ArrayList<Double> arrayList = new ArrayList<>();
        AssetManager assets = context.getAssets();
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = assets.open(str);
            byte[] bArr = new byte[1024];
            while (inputStreamOpen.read(bArr) >= 0) {
                sb.append(new String(bArr));
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        String[] strArrSplit = sb.toString().split("[,\\n]");
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(Double.valueOf(Double.parseDouble(str2)));
            }
        }
        return arrayList;
    }

    public static double[] b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str2 : context.getAssets().list(str)) {
                arrayList.addAll(a(context, str2));
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return c(arrayList);
    }

    public static double[] c(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            dArr[i4] = list.get(i4).doubleValue();
        }
        return dArr;
    }
}
