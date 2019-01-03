package com.example.administrator.smallworkdogs.fragment.myChildren;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.smallworkdogs.HomeActivity;
import com.example.administrator.smallworkdogs.R;
import com.example.administrator.smallworkdogs.functiontools.ActivityManager;

public class AboutUs extends AppCompatActivity {

    private ImageView ivReturn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_aboutus);
        ActivityManager.addActivity(this);

        ivReturn = (ImageView)findViewById(R.id.btn_zuojiantou);
        ivReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AboutUs.this, HomeActivity.class);
                intent.putExtra("signMark","5");
                startActivity(intent);
                finish();
            }
        });
    }
}
