package com.example.administrator.smallworkdogs.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.administrator.smallworkdogs.R;
import com.example.administrator.smallworkdogs.fragment.messageChildFragment.MessageComment;
import com.example.administrator.smallworkdogs.fragment.messageChildFragment.MyDynamic;
import com.example.administrator.smallworkdogs.fragment.messageChildFragment.PraiseActivity;

import java.util.ArrayList;
import java.util.List;

public class messageFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_message_layout,container,false);

        LinearLayout zhuanfa=(LinearLayout)view.findViewById(R.id.ll_zhuanfa);
        zhuanfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), MyDynamic.class);
                startActivity(intent);
            }
        });

        LinearLayout comment=(LinearLayout)view.findViewById(R.id.ll_pinglun);
        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getActivity(), MessageComment.class);
                startActivity(intent);
            }
        });

        LinearLayout zan=(LinearLayout)view.findViewById(R.id.ll_zan);
        zan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), PraiseActivity.class);
                //intent.putExtra("signMark","2");
                startActivity(intent);
            }
        });

        return view;

    }

}
