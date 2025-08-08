package com.example.demo.model;

/*
假設您想提供一個天氣API，其JSON格式如下：

請利用上述內容來設計你所需要的model類別：
Coord、Weather、Main、Wind、Rain

請替這些類別定義適當的建構子及參數、欄位及Getter和Setter方法
讓用戶端不論是透過瀏覽器、curl、或是Postman，皆能得到上述天氣的JSON資料


JSON 範例:

"coord": {
   "lon": 7.367,
   "lat": 45.133
},

*/

public class Coord
{
    private double lon;
    private double lat;


    /** 無參數建構子
     * 這個建構子是為了讓 Jackson 可以反序列化 JSON
    */
    public Coord()
    {
    }


    /** 有參數建構子
     * 這個建構子可以用來直接建立 Coord 物件
     * @param lon 經度
     * @param lat 緯度
    */
    public Coord(double lon, double lat)
    {
        this.lon = lon;
        this.lat = lat;
    }


    /**
     * 取得經度
     * @return 經度
    */
    public double getLon()
    {
        return lon;
    }


    /**
     * 設定經度
     * @param lon 經度
    */
    public void setLon(double lon)
    {
        this.lon = lon;
    }


    /**
     * 取得緯度
     * @return 緯度
    */
    public double getLat()
    {
        return lat;
    }


    /**
     * 設定緯度
     * @param lat 緯度
    */
    public void setLat(double lat)
    {
        this.lat = lat;
    }

}
