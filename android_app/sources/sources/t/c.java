package t;

import java.util.ArrayList;
import t.e;
import v.j;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f11386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.EnumC0114e f11387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<Object> f11388c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f11389d;

    public c(e eVar, e.EnumC0114e enumC0114e) {
        this.f11386a = eVar;
        this.f11387b = enumC0114e;
    }

    public c a(Object... objArr) {
        for (Object obj : objArr) {
            this.f11388c.add(obj);
        }
        return this;
    }

    public void b() {
    }

    public j c() {
        return this.f11389d;
    }

    public e.EnumC0114e d() {
        return this.f11387b;
    }

    public void e(j jVar) {
        this.f11389d = jVar;
    }
}
