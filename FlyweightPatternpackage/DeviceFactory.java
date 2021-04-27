package FlyweightPatternpackage;
/**
 * 享元工厂类DeviceFactory(网络设备工厂类)
 */

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

public class DeviceFactory {
    private ArrayList devices = new ArrayList();
    private int totalTerminal = 0;
    public DeviceFactory(){
        NetworkDevice nd1 = new Switch("Cisco-WS-c29520-24");
        devices.add(nd1);
        NetworkDevice nd2 = new Hub("TP-LINK-HF8m");
        devices.add(nd2);

    }
    public NetworkDevice getNetworkDevice(String type){
        if (type.equalsIgnoreCase("cisco")){
            totalTerminal++;
            return (NetworkDevice)devices.get(0);
        }
        else if (type.equalsIgnoreCase("tp")){
            totalTerminal++;
            return (NetworkDevice)devices.get(1);
        }
        else {
            return null;
        }
    }
    public int getTotalDevice(){
        return devices.size();
    }
    public int getTotalTerminal(){
        return totalTerminal;
    }
}
