package ProxyRunner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BatchFile {
    
    //batch commands: https://superuser.com/questions/419696/in-windows-7-how-to-change-proxy-settings-from-command-line
    
    public void writeBatch() {
        
        File file = new File("pingTest.bat");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {    
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            bw.write("ping mybroadband.co.za -t");
            file.deleteOnExit();
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void runBatch(){
        try {
            Runtime.getRuntime().exec("cmd /c start pingTest.bat");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeProxyBatch(ProxyBasic proxy){
        File file = new File("proxySet.bat");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {    
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            bw.write("reg add \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" ^\n    "
                    + "/v ProxyServer /t REG_SZ /d " + proxy.getUrl() + ":" + proxy.getPort() + " /f"+
                    "\r\nexit 0");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void enableProxyServer(){
        File file = new File("enableProxy.bat");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {    
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            bw.write("reg add \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" ^\n    /v ProxyEnable /t REG_DWORD /d 1 /f\""+
                    "\r\nexit 0");
            runBatchFile("enableProxy");
            file.delete();
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed to enable proxy server.");
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void disableProxyServer(){
        File file = new File("disableProxy.bat");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {    
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            bw.write("reg add \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" ^\n    /v ProxyEnable /t REG_DWORD /d 0 /f\""+
                    "\r\nexit 0");
            runBatchFile("disableProxy");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void writeAutdodetect(){
        
    }
    
    public void writeProxyScript(ProxyFinal proxyScript){
        File file = new File("proxySet.bat");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {    
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            bw.write("reg add \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" "
                    + "/v AutoConfigURL /t REG_SZ /d \"" + proxyScript.getProxyScript() + "\" /f");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void removeProxyScript(){
        File file = new File("proxySet.bat");
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {    
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            
            bw.write("reg add \"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Internet Settings\" "
                    + "/v AutoConfigURL /t REG_SZ /d /f");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void runBatchFile(String name){
        try {
            Runtime.getRuntime().exec("cmd /c start "+ name + ".bat");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void runProxyBasic(){
        try {
            Runtime.getRuntime().exec("cmd /c start proxySet.bat");
        } catch (IOException ex) {
            Logger.getLogger(BatchFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
