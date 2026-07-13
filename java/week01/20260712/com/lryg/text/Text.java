package com.lryg.text;

public class Text {
    public static void main(String[] args) {
        AndroidPhone ad = new AndroidPhone();
        ad.NFC();
        ad.call();
        ad.sendMessage();
        ad.NFC();
        ad.setBrand("华为");
        ad.setPrice(1880);
        System.out.println(ad.getBrand()+"品牌的价格是"+ad.getPrice()+"元");
        AppleAPhone ap = new AppleAPhone();
        ap.setBrand("苹果");
        System.out.println(ap.getBrand() );

    }
}
