package main.java.com.ericsson.jmsspy2.utils;

public enum Browser {
    CHROME,
    FIREFOX,
    IE;

    private static Browser browser = null;

    public static Browser getCurrentBrowser() {
        if (browser == null) {
            browser = Browser.valueOf(System.getProperty("browser", "chrome").toUpperCase());
        }
        return browser;
    }


}
