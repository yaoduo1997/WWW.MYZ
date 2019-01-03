package com.example.administrator.smallworkdogs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.administrator.smallworkdogs.database.User;
import com.example.administrator.smallworkdogs.functiontools.ActivityManager;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;

public class StartActivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "fea7d8cee695c4ddcac602c25b1b18a2");
        //Bmob.initialize(this,"9b186d38a4634301ffa01f5973221b1f");
        if(BmobUser.getCurrentUser(User.class)!=null){
            startActivity(new Intent(StartActivity.this,HomeActivity.class));
        }else{
            //全屏显示
            requestWindowFeature(Window.FEATURE_NO_TITLE);  //无title
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);  //全屏

            setContentView(R.layout.activity_start_layout);
            ActivityManager.addActivity(this);
            handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplication(),GuideActivity.class));
                    finish();
                }
            },3000);
        }

    }
}
