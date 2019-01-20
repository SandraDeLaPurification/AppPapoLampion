package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.papo.lib.Laumio;

import org.eclipse.paho.client.mqttv3.MqttException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program_select_laumios extends AppCompatActivity {

    private Laumio laumio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_select_laumios);

        ListView listView = (ListView) findViewById(R.id.list_laumios);
        try {
            laumio = LaumioSingleton.getInstance();
        } catch (MqttException e) {
            e.printStackTrace();
        }
        Set<String> laumios = new HashSet<>();

        try {
            laumio.refreshIDs(new Laumio.IDCallback() {
                @Override
                public void onIDReceived(String s) {
                    laumios.add(s);
                }
            });
        } catch (MqttException e) {
            e.printStackTrace();
        }

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.select_instruction_listview_line, R.id.select_instruction_textview, new ArrayList<String>(laumios));


        listView.setAdapter(adapter);
    }

    public void setNextPage(View view){
        Intent intent = new Intent(program_select_laumios.this, pick_color.class);
        startActivity(intent);
    }
}
