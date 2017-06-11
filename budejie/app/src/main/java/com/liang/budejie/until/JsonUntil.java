package com.liang.budejie.until;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.liang.budejie.bean.CommentBean;
import com.liang.budejie.bean.DrawBean;
import com.liang.budejie.bean.DuanZi;
import com.liang.budejie.bean.JHLengZhiShiBean;
import com.liang.budejie.bean.JHMeiNvBean;
import com.liang.budejie.bean.JHPaiHangBean;
import com.liang.budejie.bean.JHSheHuiBean;
import com.liang.budejie.bean.JHTuiJianBean;
import com.liang.budejie.bean.JHWangHongBean;
import com.liang.budejie.bean.JHYouXiBean;
import com.liang.budejie.bean.PingLunBean;
import com.liang.budejie.bean.VideoJingHua;
import com.liang.budejie.bean.XTShengyinBean;

/**
 * Created by Administrator on 2016/11/1 0001.
 */
public class JsonUntil {

    public static VideoJingHua parseVideoJinghua(String json) {
        VideoJingHua videoJingHua = null;
        try {
            videoJingHua = new Gson().fromJson(json, VideoJingHua.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return videoJingHua;
    }


    public static DrawBean paresDrawBean(String json){
        DrawBean drawBean=null;
        try {
            drawBean=new Gson().fromJson(json,DrawBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  drawBean;
    }

    public static DuanZi paresDuanZiBean(String json){
        DuanZi duanZi=null;
        try {
            duanZi=new Gson().fromJson(json,DuanZi.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  duanZi;
    }

    public static JHLengZhiShiBean paresJHLengZhiShiBean(String json){
        JHLengZhiShiBean jhLengZhiShiBean=null;
        try {
            jhLengZhiShiBean=new Gson().fromJson(json,JHLengZhiShiBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhLengZhiShiBean;
    }

    public static JHMeiNvBean paresJHMeiNvBean(String json){
        JHMeiNvBean jhMeiNvBean=null;
        try {
            jhMeiNvBean=new Gson().fromJson(json,JHMeiNvBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhMeiNvBean;
    }

    public static JHPaiHangBean paresJHPaiHangBean(String json){
        JHPaiHangBean jhPaiHangBean=null;
        try {
            jhPaiHangBean=new Gson().fromJson(json,JHPaiHangBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhPaiHangBean;
    }

    public static JHSheHuiBean paresJHSheHuiBean(String json){
        JHSheHuiBean jhSheHuiBean=null;
        try {
            jhSheHuiBean=new Gson().fromJson(json,JHSheHuiBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhSheHuiBean;
    }

    public static JHTuiJianBean paresJHTuiJianBean(String json){
        JHTuiJianBean jhTuiJianBean=null;
        try {
            jhTuiJianBean=new Gson().fromJson(json,JHTuiJianBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhTuiJianBean;
    }

    public static JHWangHongBean paresJHWangHongBean(String json){
        JHWangHongBean jhWangHongBean=null;
        try {
            jhWangHongBean=new Gson().fromJson(json,JHWangHongBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhWangHongBean;
    }

    public static JHYouXiBean paresJHYouXiBean(String json){
        JHYouXiBean jhYouXiBean=null;
        try {
            jhYouXiBean=new Gson().fromJson(json,JHYouXiBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  jhYouXiBean;
    }

    public static XTShengyinBean paresXTShengyinBean(String json){
        XTShengyinBean xtShengyinBean=null;
        try {
            xtShengyinBean=new Gson().fromJson(json,XTShengyinBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  xtShengyinBean;
    }

    public static CommentBean paresCommentBean(String json){
        CommentBean commentBean=null;
        try {
            commentBean=new Gson().fromJson(json,CommentBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return  commentBean;
    }

    public static PingLunBean paresPinglunBean(String json) {
        PingLunBean pingLunBean = null;
        try {
            pingLunBean = new Gson().fromJson(json, PingLunBean.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return pingLunBean;
    }


}
