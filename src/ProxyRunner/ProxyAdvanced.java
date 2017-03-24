package ProxyRunner;

public class ProxyAdvanced extends ProxyBasic{
    
    private String username, password;
    private boolean autodetect;
    public ProxyAdvanced(){}
    
    public ProxyAdvanced(String wifiSSID, String url, int proxy, boolean autodetect){
        super(wifiSSID, url, proxy);
        this.autodetect = autodetect;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAutodetect() {
        return autodetect;
    }

    public void setAutodetect(boolean autodetect) {
        this.autodetect = autodetect;
    }
    
    
}
