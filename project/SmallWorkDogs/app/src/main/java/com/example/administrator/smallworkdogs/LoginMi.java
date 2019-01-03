package com.example.administrator.smallworkdogs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.smallworkdogs.database.User;
import com.example.administrator.smallworkdogs.functiontools.ActivityManager;
import com.example.administrator.smallworkdogs.functiontools.LoginCache;
import com.example.administrator.smallworkdogs.functiontools.Show;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class LoginMi extends AppCompatActivity {

    private Button btnLogin1;
    private EditText etName;
    private EditText etPwd;
    private TextView tvlogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginmi);
        ActivityManager.addActivity(this);

        etName=findViewById(R.id.et_name);
        etPwd=findViewById(R.id.et_pwd);
        tvlogin=findViewById(R.id.tv_loginya);
        btnLogin1=findViewById(R.id.btn_login1);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final User user = new User();
                String userName=etName.getText().toString();
                String pwd=etPwd.getText().toString();
                user.setUsername(userName);
                user.setPassword(pwd);
                user.login(new SaveListener<User>() {
                    @Override
                    public void done(User bmobUser, BmobException e) {
                        if (e == null) {
                            User user = BmobUser.getCurrentUser(User.class);
                            Log.e("LoginMi","登录成功");
                            LoginCache.fetchUserInfo();
                            startActivity(new Intent(LoginMi.this, HomeActivity.class));
                            finish();
                        } else {
                            Show.toast(LoginMi.this, "您输入的用户名或者密码不正确！");
                            Log.e("LoginMi","登录失败"+e.toString());
                        }
                    }
                });
            }
        });


        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMi.this,MainActivity.class));
                finish();
            }
        });


    }
}
