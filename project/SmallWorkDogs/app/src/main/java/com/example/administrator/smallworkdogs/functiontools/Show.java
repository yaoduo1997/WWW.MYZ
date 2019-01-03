package com.example.administrator.smallworkdogs.functiontools;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.example.administrator.smallworkdogs.R;
import com.example.administrator.smallworkdogs.fragment.myChildren.setting.SettingNewPhone;

public class Show {
    static public void toast(Context context,String string){
        Toast toast = Toast.makeText(context,string,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
