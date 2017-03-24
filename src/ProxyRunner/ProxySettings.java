package ProxyRunner;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProxySettings {
    
    private ObjectInputStream input;
    
    public ProxyBasic getProxySettings(){
        try {
            input = new ObjectInputStream(new FileInputStream("ProxySettings.ser"));
            return (ProxyBasic) input.readObject();
            
        } catch(EOFException eof){
        
        } catch (IOException ex) {
            Logger.getLogger(ProxySettings.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProxySettings.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(ProxySettings.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //in case of no saved settings.
        return new ProxyBasic("None", "", 0);
    }
}
