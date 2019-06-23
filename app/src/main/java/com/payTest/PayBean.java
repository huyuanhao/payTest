package com.payTest;

public class PayBean {
    /*
    *    business_id    商户自己平台id
     money          金额
     platform_id    平台订单号
     qrcode         二维码链接*/

    private String business_id;
    private String money;
    private String platform_id;
    private String qrcode;

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPlatform_id() {
        return platform_id;
    }

    public void setPlatform_id(String platform_id) {
        this.platform_id = platform_id;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}
