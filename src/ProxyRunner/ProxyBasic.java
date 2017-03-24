package ProxyRunner;

import java.io.Serializable;

public class ProxyBasic implements Serializable{
    
    private String url;
    private int port;
    private String wifiSSID;
    
    public ProxyBasic(){}
    
    public ProxyBasic(String wifiSSID){
        this.wifiSSID = wifiSSID;
    }
    
    public ProxyBasic(String wifiSSID, String url, int port){
        this.wifiSSID = wifiSSID;
        this.url = url;
        this.port = port;
    }

    public String getWifiSSID() {
        return wifiSSID;
    }

    public void setWifiSSID(String wifiSSID) {
        this.wifiSSID = wifiSSID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    
    
}
