package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class program_select_laumios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_select_laumios);

        ListView listView = (ListView) findViewById(R.id.list_laumios);
        List<String> laumios = new ArrayList<String>();

        laumios.add("1");

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.select_instruction_listview_line, R.id.select_instruction_textview, laumios);


        listView.setAdapter(adapter);
    }

    public void setNextPage(View view){
        Intent intent = new Intent(program_select_laumios.this, pick_color.class);
        startActivity(intent);
    }
}
