package ProxyRunner;

import java.awt.TrayIcon;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProxyRunner implements Runnable{
    
    ProxySettings get = new ProxySettings();
    BatchFile run = new BatchFile();
    NetworkSSID wifi = new NetworkSSID();
    String oldWifi = "";
    boolean proxyEnabled = false;

    @Override
    public void run() {
        while(true){
            if(wifi.getNetworkSSID().equals(oldWifi)){
                //do nothing.
            }
            else if(wifi.getNetworkSSID().equals(get.getProxySettings().getWifiSSID())){
                run.writeProxyBatch(get.getProxySettings());
                run.enableProxyServer();
                oldWifi = wifi.getNetworkSSID();
                DisplayTrayIcon.trayIcon.displayMessage("Proxy Enabled", "Proxy has been enabled for: " + oldWifi, TrayIcon.MessageType.INFO);
                proxyEnabled = true;
            }else if(proxyEnabled) {
                run.disableProxyServer();
                oldWifi = "";
                DisplayTrayIcon.trayIcon.displayMessage("Proxy Disabled", "Proxy has been disabled", TrayIcon.MessageType.INFO);
                proxyEnabled = false;
            }
            
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProxyRunner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}
