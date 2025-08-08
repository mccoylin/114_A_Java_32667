package com.example.demo.model;

/*
假設您想提供一個天氣API，其JSON格式如下：

請利用上述內容來設計你所需要的model類別：
Coord、Weather、Main、Wind、Rain

請替這些類別定義適當的建構子及參數、欄位及Getter和Setter方法
讓用戶端不論是透過瀏覽器、curl、或是Postman，皆能得到上述天氣的JSON資料


JSON 範例:

"main": {
   "temp": 284.2,
   "feels_like": 282.93,
   "temp_min": 283.06,
   "temp_max": 286.82,
   "pressure": 1021,
   "humidity": 60
}

*/


public class Main
{
    private double temp;
    private double feelsLike;
    private double tempMin;
    private double tempMax;
    private int pressure;
    private int humidity;


    /** 無參數建構子
     * 這個建構子是為了讓 Jackson 可以反序列化 JSON
    */
    public Main()
    {
    }


    /** 有參數建構子
     * 這個建構子可以用來直接建立 Main 物件
     * @param temp 當前溫度
     * @param feelsLike 體感溫度
     * @param tempMin 最低溫度
     * @param tempMax 最高溫度
     * @param pressure 氣壓
     * @param humidity 濕度
    */
    public Main(double temp, double feelsLike, double tempMin, double tempMax, int pressure, int humidity)
    {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }


    /**
     * 取得當前溫度
     * @return 當前溫度
    */
    public double getTemp()
    {
        return temp;
    }


    /**
     * 設定當前溫度
     * @param temp 當前溫度
    */
    public void setTemp(double temp)
    {
        this.temp = temp;
    }


    /**
     * 取得體感溫度
     * @return 體感溫度
    */
    public double getFeelsLike()
    {
        return feelsLike;
    }


    /**
     * 設定體感溫度
     * @param feelsLike 體感溫度
    */
    public void setFeelsLike(double feelsLike)
    {
        this.feelsLike = feelsLike;
    }


    /**
     * 取得最低溫度
     * @return 最低溫度
    */
    public double getTempMin()
    {
        return tempMin;
    }


    /**
     * 設定最低溫度
     * @param tempMin 最低溫度
    */
    public void setTempMin(double tempMin)
    {
        this.tempMin = tempMin;
    }


    /**
     * 取得最高溫度
     * @return 最高溫度
    */
    public double getTempMax()
    {
        return tempMax;
    }


    /**
     * 設定最高溫度
     * @param tempMax 最高溫度
    */
    public void setTempMax(double tempMax)
    {
        this.tempMax = tempMax;
    }


    /**
     * 取得氣壓
     * @return 氣壓
    */
    public int getPressure()
    {
        return pressure;
    }


    /**
     * 設定氣壓
     * @param pressure 氣壓
    */
    public void setPressure(int pressure)
    {
        this.pressure = pressure;
    }


    /**
     * 取得濕度
     * @return 濕度
    */
    public int getHumidity()
    {
        return humidity;
    }


    /**
     * 設定濕度
     * @param humidity 濕度
    */
    public void setHumidity(int humidity)
    {
        this.humidity = humidity;
    }

}
