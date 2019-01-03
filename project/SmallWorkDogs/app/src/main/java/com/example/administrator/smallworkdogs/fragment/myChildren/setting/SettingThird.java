package com.example.administrator.smallworkdogs.fragment.myChildren.setting;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.smallworkdogs.R;
import com.example.administrator.smallworkdogs.functiontools.ActivityManager;


public class SettingThird extends AppCompatActivity {
    private ImageView ivPre;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_third);
        ActivityManager.addActivity(this);

        ivPre=(ImageView)findViewById(R.id.iv_fanhui);
        ivPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(SettingThird.this,SettingSafe.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
