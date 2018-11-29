package com.tushu.sdk.ad;

/**
 * Created by A03 on 2018/6/7.
 */

public class AdModel {

    public String adid;// 唯一标识

    public int adClickInvalid = 1;//是否仅btn可点
    public int backClickable = 0;//是否返回键可用
    public int bigImgClickable = 0;//关闭按钮大小
    public long closeBtnTime = 800;//关闭按钮延迟显示时间
    public String screenPlacementId; //Facebook可替换Id
    public String channelName = "facebook";//facebook  adtiming

    public long backBtnTime;//多久返回按钮可以点击
    public int coverRate = 100;//大图点击几率
    public int descClickable = 1;//描述是否可点
    public int iconClickable = 1;//icon是否可点
    public int titleClickable = 1;//title是否可点


    //外插屏属性
    public int insertScreen;//是否为外插  外插为1
    public long screenIntervalTime = 30000L;//广告显示间隔时间
    public int screenNum = 30;//最大显示次数
    public int screenOpen = 1;//是否展示广告  1为显示  0为不显示
    public double screenOpenTime = 30*60*1000L;//安装后过多久可以弹广告

}