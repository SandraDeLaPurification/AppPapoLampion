package papo.com.apppapolampion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class program_select_instruction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_select_instruction);

        List<String> planetsList = new ArrayList<String>();

        planetsList.add("Freddy Mercury");
        planetsList.add("Venus");
        planetsList.add("Mars");
        planetsList.add("Jupiter");
        planetsList.add("Saturn");
        planetsList.add("Uranus");
        planetsList.add("Neptune");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_program_select_instruction, planetsList);

        ListView listView = (ListView) findViewById(R.id.listInstruction);
        listView.setAdapter(adapter);
    }
}
