package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class program_select_instruction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_select_instruction);

        ListView listView = (ListView) findViewById(R.id.listInstruction);
        List<String> instructions = new ArrayList<String>();

        instructions.add("Freddy Mercury");
        instructions.add("Venus");
        instructions.add("Mars");
        instructions.add("Jupiter");
        instructions.add("Saturn");
        instructions.add("Uranus");
        instructions.add("Neptune");

        final ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.select_instruction_listview_line, R.id.select_instruction_textview, instructions);


        listView.setAdapter(adapter);
    }

    public void setNextPage(View view){
        Intent intent = new Intent(program_select_instruction.this, pick_color.class);
        startActivity(intent);
    }
}
