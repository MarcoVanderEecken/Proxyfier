package ProxyRunner;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DisplayTrayIcon {
    
    //all done using https://www.youtube.com/watch?v=xxJYWYhtwz4
      
    static TrayIcon trayIcon;
    public DisplayTrayIcon(){
        showTrayIcon();
    }
    
    public static void showTrayIcon(){
        ProxyInterface run = new ProxyInterface();
        run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run.setVisible(true);
        
        //first check if computer supports tray icon.
        if(!SystemTray.isSupported()){
            JOptionPane.showMessageDialog(null, "Your computer does not support the system tray.");
            System.exit(0);
            return;
        }
        
        trayIcon = new TrayIcon(createIcon("/Image/icon2.png", "Tray Icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        trayIcon.setToolTip("Auto Proxy changer");
         
        
        final PopupMenu popup = new PopupMenu();
        
        Menu displayMenu = new Menu("Menu");
       
        //add components/menu items to the popup menu.
        MenuItem open = new MenuItem("Open");
        MenuItem aboutItem = new MenuItem("About");
        MenuItem exitItem = new MenuItem("Exit");
        
        MenuItem proxyEnabled = new MenuItem("Proxy Enabled");
        MenuItem proxyDisabled = new MenuItem("Proxy Disabled");
        
        MenuItem proxyFailed = new MenuItem("Failed to connect to change proxy settings.");
            
        displayMenu.add(proxyEnabled);
        
        //populate popup menu.
        popup.add(open);
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(exitItem);
        
        trayIcon.setPopupMenu(popup);
        
        trayIcon.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                run.setVisible(true);
                run.toFront();
                run.setState(ProxyInterface.NORMAL);
            }
        });
        
        open.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                run.setVisible(true);
                run.toFront();
                run.setState(ProxyInterface.NORMAL);
            }
        });
        
        aboutItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                ProxyInterface.displayAbout();
            }
        });
        
        exitItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tray.remove(trayIcon);
                ProxyInterface.exit();
            }
        });
        
        
        try{
            tray.add(trayIcon);
        }catch(AWTException e){
            e.printStackTrace();
        }
    }
    
    protected static Image createIcon(String path, String desc){
        URL ImageURL = DisplayTrayIcon.class.getResource(path);
        return (new ImageIcon(ImageURL, desc)).getImage();
    }
    
    public void openProxyInterface(){
        
    }
}
