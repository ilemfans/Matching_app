package com.example.testmatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView tvresult;
    private  Button btn;
    public static TextView tvresult2;
    private  Button btn2;
    private  Button send_button;

    public static String sensorid;
    public static String goodsid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvresult = (TextView) findViewById(R.id.tvresult);
        tvresult2 = (TextView) findViewById(R.id.tvresult2);

        btn = (Button) findViewById(R.id.btn);
        btn2 = (Button) findViewById(R.id.btn2);
        send_button = (Button) findViewById(R.id.send_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity2.class);
                startActivity(intent);
            }
        });

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SendActivity.class);
                startActivity(intent);
            }
        });

    }
}
