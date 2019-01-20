package papo.com.apppapolampion;

import com.papo.lib.Laumio;

import org.eclipse.paho.client.mqttv3.MqttException;

public class LaumioSingleton {
    private static Laumio laumio;

    public static Laumio getInstance() throws MqttException {
        if(laumio == null){
            laumio = new Laumio("tcp://mpd.lan:1883");
        }
        return laumio;
    }
}
