package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.papo.lib.Laumio;

import org.eclipse.paho.client.mqttv3.MqttException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        startActivity(this.getIntent());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Laumio laumio = new Laumio("tcp://mpd.lan:1883");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void startProgramActivity(View view)
    {
        Intent intent = new Intent(this, program_add_event.class);
        startActivity(intent);
    }

    public void startChangeColorActivity(View view)
    {
        Intent intent = new Intent(this, pick_color.class);
        Intent intent2 = new Intent(this, program_select_instruction.class);
        startActivity(intent2);
    }
    
    public void startTurnOnActivity(View view)
    {
        Intent intent = new Intent(this, program_select_laumios.class);
        startActivity(intent);
    }
    public void startChangeAnimationActivity(View view)
    {
        Intent intent = new Intent(this, select_animation.class);
        startActivity(intent);
    }
    /*
    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent(MainActivity.this, program_select_instruction.class);
        startActivity(intent);
    }*/

}
