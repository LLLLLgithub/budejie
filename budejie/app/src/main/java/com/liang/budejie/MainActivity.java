package com.liang.budejie;


import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.liang.budejie.fragments.GuanZhuFragment;
import com.liang.budejie.fragments.JingHuaFragment;
import com.liang.budejie.fragments.MineFragment;
import com.liang.budejie.fragments.XinTieFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "lzy";
    @Bind(R.id.flMainActivity)
    FrameLayout flMainActivity;
    @Bind(R.id.rbMianJinghua)
    RadioButton rbMianJinghua;
    @Bind(R.id.rbMianXintie)
    RadioButton rbMianXintie;
    @Bind(R.id.rbMianGuanzhu)
    RadioButton rbMianGuanzhu;
    @Bind(R.id.rbMianWode)
    RadioButton rbMianWode;
    @Bind(R.id.rgMainActivity)
    RadioGroup rgMainActivity;
    @Bind(R.id.tvMianFabu)
    TextView tvMianFabu;
    @Bind(R.id.rootLl)
    LinearLayout rootLl;
    @Bind(R.id.ivLogo)
    ImageView ivLogo;
    @Bind(R.id.send_video)
    ImageView sendVideo;
    @Bind(R.id.send_picture)
    ImageView sendPicture;
    @Bind(R.id.send_text)
    ImageView sendText;
    @Bind(R.id.send_voice)
    ImageView sendVoice;
    @Bind(R.id.audit)
    ImageView audit;
    @Bind(R.id.send_link)
    ImageView sendLink;
    @Bind(R.id.tubiaoLl)
    LinearLayout tubiaoLl;
    @Bind(R.id.cancel_btn)
    Button cancelBtn;
    @Bind(R.id.centerRl)
    RelativeLayout centerRl;


    private List<RadioButton> rbs = new ArrayList<>();
    private JingHuaFragment jingHuaFragment;
    private GuanZhuFragment guanZhuFragment;
    private XinTieFragment xinTieFragment;
    private MineFragment mineFragment;
    private ObjectAnimator open1;
    private ObjectAnimator open2;
    private ObjectAnimator close1;
    private ObjectAnimator close2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initRadioButtonList();//初始化radiobutton列表
        setRadioGrounpOnClickListener();//RadioGrounp的点击事件
        initFragments();//把Fragment实例添加进list里
        showCurrentFragment(jingHuaFragment);//利用Fragment事物动态显示隐藏Fragment

        initObjectAnimator();//初始化动画
    }

    private void initObjectAnimator() {
        open1 = ObjectAnimator.ofFloat(tubiaoLl, "translationY", -1500f, 100f);
        open2 = ObjectAnimator.ofFloat(tubiaoLl, "translationY", 100f, 0);
        close1 = ObjectAnimator.ofFloat(tubiaoLl, "translationY", 0, -100f);
        close2 = ObjectAnimator.ofFloat(tubiaoLl, "translationY", 100f, 1500f);
    }

    //首页的碎片集合
    private List<Fragment> fragments = new ArrayList<>();

    //实例化碎片并添加到碎片集合中
    private void initFragments() {
        jingHuaFragment = new JingHuaFragment();
        guanZhuFragment = new GuanZhuFragment();
        xinTieFragment = new XinTieFragment();
        mineFragment = new MineFragment();
        fragments.add(jingHuaFragment);
        fragments.add(xinTieFragment);
        fragments.add(guanZhuFragment);
        fragments.add(mineFragment);
    }

    //显示当前fragment
    private void showCurrentFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (!fragment.isAdded()) {
            ft.add(R.id.flMainActivity, fragment);
        }
        for (Fragment f : fragments) {
            if (fragment == f) {
                ft.show(f);
            } else {
                ft.hide(f);
            }
        }
        ft.commit();
    }

    //初始化radiobutton列表
    private void initRadioButtonList() {
        rbs.add(rbMianGuanzhu);
        rbs.add(rbMianJinghua);
        rbs.add(rbMianWode);
        rbs.add(rbMianXintie);
    }

    //RadioGrounp的点击事件
    private void setRadioGrounpOnClickListener() {
        rgMainActivity.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMianJinghua:
                        showCurrentFragment(jingHuaFragment);
                        setRadioButtonTextColor(rbMianJinghua);
                        break;
                    case R.id.rbMianXintie:
                        showCurrentFragment(xinTieFragment);
                        setRadioButtonTextColor(rbMianXintie);
                        break;
                    case R.id.rbMianGuanzhu:
                        showCurrentFragment(guanZhuFragment);
                        setRadioButtonTextColor(rbMianGuanzhu);
                        break;
                    case R.id.rbMianWode:
                        showCurrentFragment(mineFragment);
                        setRadioButtonTextColor(rbMianWode);
                        break;
                }
            }
        });
    }

    //设置RadioButton文字颜色
    private void setRadioButtonTextColor(RadioButton rb) {
        for (RadioButton radioButton : rbs) {
            if (radioButton == rb) {
                radioButton.setTextColor(getResources().getColor(R.color.rb_main_pressed));
            } else {
                radioButton.setTextColor(getResources().getColor(R.color.rb_main_normal));
            }
        }
    }

    //点击事件
    @OnClick({R.id.tvMianFabu, R.id.cancel_btn, R.id.send_video, R.id.send_picture, R.id.send_text, R.id.send_voice, R.id.audit, R.id.send_link})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvMianFabu:
                fabu_animator();
                break;
            case R.id.cancel_btn:
                cancel_animator();
                break;
            default:
                Toast.makeText(this, "呀，点不开", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //进入发布界面动画
    private void fabu_animator() {
        rootLl.setVisibility(View.GONE);
        centerRl.setVisibility(View.VISIBLE);
        cancelBtn.setVisibility(View.VISIBLE);
        ArrayList<Animator> list = new ArrayList<>();
        list.add(open1);
        list.add(open2);
        AnimatorSet set = new AnimatorSet();
        set.playSequentially(list);
        set.start();
    }

    //取消发布界面动画,从发布界面返回主页
    private void cancel_animator() {
        ArrayList<Animator> list = new ArrayList<>();
        list.add(close1);
        list.add(close2);
        AnimatorSet set = new AnimatorSet();
        set.playSequentially(list);
        set.start();
        cancelBtn.setVisibility(View.GONE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                centerRl.setVisibility(View.GONE);
                rootLl.setVisibility(View.VISIBLE);
            }
        }, 500);
    }

    //发布界面按了返回键相当模拟返回上一次
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            if (centerRl.getVisibility() == View.VISIBLE) {
                cancel_animator();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}

