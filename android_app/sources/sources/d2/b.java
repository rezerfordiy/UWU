package d2;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static String a(Context context, String str) {
        InputStream inputStreamOpen;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            inputStreamOpen = context.getResources().getAssets().open(str);
            inputStreamReader = new InputStreamReader(inputStreamOpen);
            bufferedReader = new BufferedReader(inputStreamReader);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            return sb.toString();
        }
        bufferedReader.close();
        inputStreamReader.close();
        inputStreamOpen.close();
        return sb.toString();
    }
}
