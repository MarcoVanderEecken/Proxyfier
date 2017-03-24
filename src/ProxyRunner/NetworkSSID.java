/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Temporary
 */
public class NetworkSSID {

    //This method is from: https://codereview.stackexchange.com/questions/110085/accessing-wi-fi-network-interface-details-from-java-using-netsh
    public String getNetworkSSID() {
        String ssid;
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "netsh wlan show interfaces");
        builder.redirectErrorStream(true);

        BufferedReader r = null;
        InputStreamReader inp = null;
        try {
            Process p = builder.start();
            inp = new InputStreamReader(p.getInputStream());
            r = new BufferedReader(inp);
            String line = r.readLine();
            while (line != null) {
                if (line.contains("SSID")) {
                    ssid = line.split("\\s+")[3];
                    return ssid;
                }
                line = r.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(NetworkSSID.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inp.close();
                r.close();
            } catch (IOException ex) {
                Logger.getLogger(NetworkSSID.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "noConnection";
    }
    
}
