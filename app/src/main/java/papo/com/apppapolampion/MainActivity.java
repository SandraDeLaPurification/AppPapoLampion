package papo.com.apppapolampion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        startActivity(this.getIntent());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startProgramActivity(View view)
    {
        Intent intent = new Intent(this, program_add_event.class);
        startActivity(intent);
    }

    public void startChangeColorActivity(View view)
    {
        Intent intent = new Intent(this, pick_color.class);
        startActivity(intent);
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
    }

}
