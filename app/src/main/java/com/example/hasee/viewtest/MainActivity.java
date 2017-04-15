package com.example.hasee.viewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTevContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTevContent= (TextView) findViewById(R.id.tev_content);
        mTevContent.setText(R.string.text_feature2);
    }

    public void showToast(View view) {
        Toast.makeText(this, "SHOWTOAST", Toast.LENGTH_SHORT).show();
    }
}
