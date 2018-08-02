package bgm.seoulm;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button btn1 = (Button)findViewById(R.id.btn_market);
        Button btn2 = (Button)findViewById(R.id.btn_price);
        Button btn3 = (Button)findViewById(R.id.btn_etc);

        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                startActivity(new Intent(MainActivity.this,TabbedActivity.class));
            }
        });
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event

            }
        });
        btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
            }
        });
    }
}
