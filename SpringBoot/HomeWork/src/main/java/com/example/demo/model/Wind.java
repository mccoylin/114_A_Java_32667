package com.example.demo.model;

/*
假設您想提供一個天氣API，其JSON格式如下：

請利用上述內容來設計你所需要的model類別：
Coord、Weather、Main、Wind、Rain

請替這些類別定義適當的建構子及參數、欄位及Getter和Setter方法
讓用戶端不論是透過瀏覽器、curl、或是Postman，皆能得到上述天氣的JSON資料


JSON 範例:

"wind": {
    "speed": 4.09,
    "deg": 121
},

*/

public class Wind
{
    private double speed;
    private double deg;

    /** 無參數建構子
     * 這個建構子是為了讓 Jackson 可以反序列化 JSON
    */
    public Wind()
    {
    }


    /** 有參數建構子
     * 這個建構子可以用來直接建立 Wind 物件
     * @param speed 風速
     * @param deg 風向角度
    */
    public Wind(double speed, double deg)
    {
        this.speed = speed;
        this.deg = deg;
    }


    /**
     * 取得風速
     * @return 風速
    */
    public double getSpeed()
    {
        return speed;
    }


    /**
     * 設定風速
     * @param speed 風速
    */
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    /**
     * 取得風向角度
     * @return 風向角度
    */
    public double getDeg()
    {
        return deg;
    }

    /**
     * 設定風向角度
     * @param deg 風向角度
    */
    public void setDeg(double deg)
    {
        this.deg = deg;
    }

}
