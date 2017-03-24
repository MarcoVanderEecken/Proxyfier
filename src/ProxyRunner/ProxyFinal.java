package ProxyRunner;

/**
 *
 * Contain normal proxy and contain automatically detect settings option and enable/disable script.
 */
public class ProxyFinal extends ProxyBasic{
    
    private String proxyScript;
    private Boolean autodetect;
    
    public ProxyFinal(String wifiSSID, String url, int proxy, String proxyScript, Boolean autodetect){
        super(wifiSSID, url, proxy);
        this.proxyScript = proxyScript;
        this.autodetect = autodetect;
    }

    public String getProxyScript() {
        return proxyScript;
    }

    public void setProxyScript(String proxyScript) {
        this.proxyScript = proxyScript;
    }

    public Boolean getAutodetect() {
        return autodetect;
    }

    public void setAutodetect(Boolean autodetect) {
        this.autodetect = autodetect;
    }
    
    
}
