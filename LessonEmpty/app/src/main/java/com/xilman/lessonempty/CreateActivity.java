package com.xilman.lessonempty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateActivity extends AppCompatActivity {

    private Button btnCreate;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                Intent listActivity = new Intent(getApplicationContext(), listActivity.class);
                startActivity(listActivity);
            }
        });





    }
}
