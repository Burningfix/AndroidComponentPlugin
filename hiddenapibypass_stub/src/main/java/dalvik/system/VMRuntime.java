package dalvik.system;

@SuppressWarnings("all")
public class VMRuntime {
    public static VMRuntime getRuntime() {
        throw new IllegalArgumentException("stub");
    }

    public native void setHiddenApiExemptions(String[] signaturePrefixes);
}
