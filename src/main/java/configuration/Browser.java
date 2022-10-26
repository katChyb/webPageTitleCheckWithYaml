package configuration;

public class Browser {

    String browserName;
    String appUrl;
    boolean browserAttachScreenshot;
    boolean headlessMode;
    int browserTimeout;

    public Browser(String browserName, String appUrl, boolean browserAttachScreenshot, boolean headlessMode, int browserTimeout) {
        this.browserName = browserName;
        this.appUrl = appUrl;
        this.browserAttachScreenshot = browserAttachScreenshot;
        this.headlessMode = headlessMode;
        this.browserTimeout = browserTimeout;
    }


}
