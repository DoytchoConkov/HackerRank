public class JavaSingletonPattern {
    public String str;
    private static JavaSingletonPattern instance;
    private JavaSingletonPattern() {}
    public static JavaSingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new JavaSingletonPattern();
        }
        return instance;
    }
}
