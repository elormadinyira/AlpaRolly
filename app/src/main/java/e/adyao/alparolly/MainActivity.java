package e.adyao.alparolly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this,EndActivity.class);
                startActivity(intent);

            }

        });
    }


}



