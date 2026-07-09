package com.sonoptek.magneticpositiondemo.jni;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CalInsideParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static double[] f4774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList<ArrayList<Integer>> f4775b;

    static {
        System.loadLibrary("needle_location");
        f4775b = new ArrayList<>();
    }

    public static double[] a() {
        return f4774a;
    }

    public static ArrayList<ArrayList<Integer>> b() {
        return f4775b;
    }

    public static void c(double[] dArr) {
        f4774a = dArr;
    }

    public static native double[] calInsideParam(int i4, double[] dArr);

    public static void d(ArrayList<ArrayList<Integer>> arrayList) {
        f4775b = arrayList;
    }
}
