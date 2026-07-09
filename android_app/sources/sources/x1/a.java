package x1;

import androidx.constraintlayout.widget.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ArrayList<ArrayList<double[]>> f12635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f12636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f12637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f12638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static double[] f12639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList<ArrayList<Integer>> f12640f;

    static {
        System.loadLibrary("needle_location");
        f12636b = 50;
        f12637c = e.m.f3286s3;
        f12638d = -1;
        f12640f = new ArrayList<>();
    }

    public static boolean a(int i4) {
        return f() != null && f().get(i4).size() >= d();
    }

    public static boolean b(int i4, double[] dArr) {
        if (i4 < 0) {
            return false;
        }
        if (f() == null) {
            l(new ArrayList(g()));
            for (int i5 = 0; i5 < g(); i5++) {
                f().add(new ArrayList<>());
            }
        }
        ArrayList<double[]> arrayList = f().get(i4);
        if (arrayList.size() > d()) {
            arrayList.remove(0);
        }
        arrayList.add(dArr);
        return arrayList.size() >= d();
    }

    public static int c() {
        return f12638d;
    }

    public static int d() {
        return f12636b;
    }

    public static double[] e() {
        return f12639e;
    }

    public static ArrayList<ArrayList<double[]>> f() {
        return f12635a;
    }

    public static int g() {
        return f12637c;
    }

    public static ArrayList<ArrayList<Integer>> h() {
        return f12640f;
    }

    public static void i(int i4) {
        f12638d = i4;
    }

    public static void j(int i4) {
        f12636b = i4;
    }

    public static void k(double[] dArr) {
        f12639e = dArr;
    }

    public static void l(ArrayList<ArrayList<double[]>> arrayList) {
        f12635a = arrayList;
    }

    public static void m(int i4) {
        f12637c = i4;
    }

    public static void n(ArrayList<ArrayList<Integer>> arrayList) {
        f12640f = arrayList;
    }
}
