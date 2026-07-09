package r2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;
import q2.i;
import q2.l;
import q2.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10890b = "suite";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Properties f10891c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f10892d = k("maxmessage", 500);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10893e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10894a = true;

    public static String B(String str) {
        if (f10892d == -1 || str.length() <= f10892d) {
            return str;
        }
        return str.substring(0, f10892d) + "...";
    }

    public static boolean h(String str) {
        String[] strArr = {"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
        for (int i4 = 0; i4 < 8; i4++) {
            if (str.indexOf(strArr[i4]) > 0) {
                return true;
            }
        }
        return false;
    }

    public static String i(String str) {
        if (x()) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return stringWriter.toString();
                }
                if (!h(line)) {
                    printWriter.println(line);
                }
            } catch (Exception unused) {
                return str;
            }
        }
    }

    public static String j(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return i(stringWriter.getBuffer().toString());
    }

    public static int k(String str, int i4) {
        String strL = l(str);
        if (strL == null) {
            return i4;
        }
        try {
            return Integer.parseInt(strL);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    public static String l(String str) {
        return m().getProperty(str);
    }

    public static Properties m() {
        if (f10891c == null) {
            Properties properties = new Properties();
            f10891c = properties;
            properties.put("loading", "true");
            f10891c.put("filterstack", "true");
            r();
        }
        return f10891c;
    }

    public static File n() {
        return new File(System.getProperty("user.home"), "junit.properties");
    }

    public static void r() {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(n());
            try {
                w(new Properties(m()));
                m().load(fileInputStream2);
            } catch (IOException unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
        }
    }

    public static void t() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(n());
        try {
            m().store(fileOutputStream, s0.a.f11071l);
        } finally {
            fileOutputStream.close();
        }
    }

    public static void v(String str, String str2) {
        m().put(str, str2);
    }

    public static void w(Properties properties) {
        f10891c = properties;
    }

    public static boolean x() {
        return (l("filterstack").equals("true") && f10893e) ? false : true;
    }

    public abstract void A(String str);

    public boolean C() {
        return l("loading").equals("true") && this.f10894a;
    }

    @Override // q2.l
    public synchronized void a(i iVar) {
        A(iVar.toString());
    }

    @Override // q2.l
    public synchronized void b(i iVar, Throwable th) {
        z(1, iVar, th);
    }

    @Override // q2.l
    public synchronized void c(i iVar) {
        y(iVar.toString());
    }

    @Override // q2.l
    public synchronized void d(i iVar, q2.b bVar) {
        z(2, iVar, bVar);
    }

    public void e() {
    }

    public String f(long j4) {
        return NumberFormat.getInstance().format(j4 / 1000.0d);
    }

    public String g(String str) {
        return str.startsWith("Default package for") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    public i o(String str) {
        StringBuilder sb;
        String string;
        String string2;
        Class<?> clsP;
        StringBuilder sb2;
        String string3;
        if (str.length() <= 0) {
            e();
            return null;
        }
        try {
            clsP = p(str);
        } catch (ClassNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null) {
                str = message;
            }
            sb = new StringBuilder();
            sb.append("Class not found \"");
            sb.append(str);
            string = "\"";
            sb.append(string);
            string2 = sb.toString();
        } catch (Exception e5) {
            sb = new StringBuilder();
            sb.append("Error: ");
            string = e5.toString();
            sb.append(string);
            string2 = sb.toString();
        }
        try {
            Method method = clsP.getMethod(f10890b, new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                try {
                    i iVar = (i) method.invoke(null, new Class[0]);
                    if (iVar == null) {
                        return iVar;
                    }
                    e();
                    return iVar;
                } catch (IllegalAccessException e6) {
                    sb2 = new StringBuilder();
                    sb2.append("Failed to invoke suite():");
                    string3 = e6.toString();
                    sb2.append(string3);
                    string2 = sb2.toString();
                    s(string2);
                    return null;
                } catch (InvocationTargetException e7) {
                    sb2 = new StringBuilder();
                    sb2.append("Failed to invoke suite():");
                    string3 = e7.getTargetException().toString();
                    sb2.append(string3);
                    string2 = sb2.toString();
                    s(string2);
                    return null;
                }
            }
            string2 = "Suite() method must be static";
            s(string2);
            return null;
        } catch (Exception unused) {
            e();
            return new n(clsP);
        }
    }

    public Class<?> p(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public String q(String[] strArr) {
        String strG = null;
        int i4 = 0;
        while (i4 < strArr.length) {
            if (strArr[i4].equals("-noloading")) {
                u(false);
            } else if (strArr[i4].equals("-nofilterstack")) {
                f10893e = false;
            } else if (strArr[i4].equals("-c")) {
                i4++;
                if (strArr.length > i4) {
                    strG = g(strArr[i4]);
                } else {
                    System.out.println("Missing Test class name");
                }
            } else {
                strG = strArr[i4];
            }
            i4++;
        }
        return strG;
    }

    public abstract void s(String str);

    public void u(boolean z3) {
        this.f10894a = z3;
    }

    public abstract void y(String str);

    public abstract void z(int i4, i iVar, Throwable th);
}
