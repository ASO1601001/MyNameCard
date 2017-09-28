package com.example.izumin.mynamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tap = (Button)findViewById(R.id.nick);
        tap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView text = (TextView)findViewById(R.id.name);
                Button b = (Button)findViewById(R.id.nick);
                if(text.getText().toString().equals("今泉　駿一")){
                    text.setText("げり");
                    b.setText("ニックネーム");
                }else{
                    text.setText("今泉　駿一");
                    b.setText("名前");
                }
            }
        });
    }
}
