package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class select_animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_animation);

        ListView listView = (ListView) findViewById(R.id.list_animation);
        List<String> animations = new ArrayList<String>();

        animations.add("Rainbow");

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.select_instruction_listview_line, R.id.select_instruction_textview, animations);


        listView.setAdapter(adapter);
    }

    public void setNextPage(View view){
        Intent intent = new Intent(select_animation.this, program_select_laumios.class);
        startActivity(intent);
    }
}
