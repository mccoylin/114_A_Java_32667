package com.example.demo.model;

/*
假設您想提供一個天氣API，其JSON格式如下：

請利用上述內容來設計你所需要的model類別：
Coord、Weather、Main、Wind、Rain

請替這些類別定義適當的建構子及參數、欄位及Getter和Setter方法
讓用戶端不論是透過瀏覽器、curl、或是Postman，皆能得到上述天氣的JSON資料


JSON 範例:

{
   "coord": {
      "lon": 7.367,
      "lat": 45.133
   },
   "weather": [
      {
         "id": 501,
         "main": "Rain",
         "description": "moderate rain",
         "icon": "10d"
      }
   ],
   "main": {
      "temp": 284.2,
      "feels_like": 282.93,
      "temp_min": 283.06,
      "temp_max": 286.82,
      "pressure": 1021,
      "humidity": 60
   },
   "wind": {
      "speed": 4.09,
      "deg": 121
   },
   "rain": {
      "1h": 2.73
   }
}

*/

import java.util.List;

// 把五個 model 類別組合成一個 WeatherJson 類別，
// 想法是不用太多的類別來表示整個天氣資訊的 JSON 結構
// 這樣可以簡化程式碼，並且更容易理解
public class WeatherJson
{
    private Coord coord;
    private List<Weather> weather;      // 從範例 JSON 中可以看到，weather 是一個陣列，所以這裡使用 List<Weather>
    private Main main;
    private Wind wind;
    private Rain rain;


    /** 無參數建構子
     * 這個建構子是為了讓 Jackson 可以反序列化 JSON
    */
    public WeatherJson()
    {
    }


    /** 有參數建構子
     * 這個建構子可以用來直接建立 WeatherJson 物件
     * @param coord 地理座標
     * @param weather 天氣資訊列表
     * @param main 主要天氣資訊
     * @param wind 風速和風向資訊
     * @param rain 降雨量資訊
    */
    public WeatherJson(Coord coord, List<Weather> weather, Main main, Wind wind, Rain rain) {
        this.coord = coord;
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.rain = rain;
    }


    /**
     * 取得地理座標
     * @return 地理座標
    */
    public Coord getCoord()
    {
        return coord;
    }


    /**
     * 設定地理座標
     * @param coord 地理座標
    */
    public void setCoord(Coord coord)
    {
        System.out.println("setCoord() called with: " + coord);
        System.out.println(coord.getLat() + ", " + coord.getLon());
        this.coord = coord;
    }


    /**
     * 取得天氣資訊列表
     * @return 天氣資訊列表
    */
    public List<Weather> getWeather()
    {
        return weather;
    }


    /**
     * 設定天氣資訊列表
     * @param weather 天氣資訊列表
    */
    public void setWeather(List<Weather> weather)
    {
        this.weather = weather;
    }


    /**
     * 取得主要天氣資訊
     * @return 主要天氣資訊
    */
    public Main getMain()
    {
        return main;
    }


    /**
     * 設定主要天氣資訊
     * @param main 主要天氣資訊
    */
    public void setMain(Main main)
    {
        this.main = main;
    }


    /**
     * 取得風速和風向資訊
     * @return 風速和風向資訊
    */
    public Wind getWind()
    {
        return wind;
    }


    /**
     * 設定風速和風向資訊
     * @param wind 風速和風向資訊
    */
    public void setWind(Wind wind)
    {
        this.wind = wind;
    }


    /**
     * 取得降雨量資訊
     * @return 降雨量資訊
    */
    public Rain getRain()
    {
        return rain;
    }


    /**
     * 設定降雨量資訊
     * @param rain 降雨量資訊
    */
    public void setRain(Rain rain)
    {
        this.rain = rain;
    }

}
