
package ProxyRunner;


public class ProxyAuto extends ProxyBasic{
    
    private Boolean autodetect;
    
    public ProxyAuto(String wifiSSID, Boolean autodetect){
        super.setWifiSSID(wifiSSID);
        this.autodetect = autodetect;
    }

    public Boolean getAutodetect() {
        return autodetect;
    }

    public void setAutodetect(Boolean autodetect) {
        this.autodetect = autodetect;
    }
    
    
}
