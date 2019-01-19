package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class program_select_laumios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_select_laumios);
    }

    public void setNextPage(View view){
        Intent intent = new Intent(program_select_laumios.this, pick_color.class);
        startActivity(intent);
    }
}
