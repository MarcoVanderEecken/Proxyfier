/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyRunner;

/**
 *
 * @author Temporary
 */
public class ProxyScript extends ProxyBasic{
    
    private String proxyScript;
    private Boolean autodetect;
    
    public ProxyScript(String wifiSSID, String proxyScript, Boolean autodetect){
        super.setWifiSSID(wifiSSID);
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
