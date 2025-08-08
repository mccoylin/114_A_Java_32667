package com.example.demo.controller;

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


import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

import com.example.demo.model.Main;
import com.example.demo.model.Coord;
import com.example.demo.model.Rain;
import com.example.demo.model.Weather;
import com.example.demo.model.Wind;
import com.example.demo.model.WeatherJson;

@RestController
public class WeatherController
{

    /**
     * 模擬從 API 獲取的 JSON 資料
     * @return WeatherJson
     */
    private static WeatherJson weatherJson = new WeatherJson(
        new Coord(7.367, 45.133),
        Arrays.asList(new Weather(501, "Rain", "moderate rain", "10d")),
        new Main(284.2, 282.93, 283.06, 286.82, 1021, 60),
        new Wind(4.09, 121),
        new Rain(2.73)
    );


    /**
     * 獲取模擬的天氣 API 資料
     * @return WeatherJson
     */
    @GetMapping("/weatherApi")
    public WeatherJson getWeatherApi()
    {
        return weatherJson;
    }


    /**
     * 更新模擬的天氣 API 資料
     * @param partialWeather 新的天氣資料
     * @return WeatherJson
    */
    @PatchMapping("/weatherApi")
    public WeatherJson patchWeatherApi(@RequestBody WeatherJson partialWeather)
    {
        // 檢查傳入的物件中哪些欄位不是 null，然後只更新那些欄位
        if (partialWeather.getCoord() != null)
        {
            weatherJson.setCoord(partialWeather.getCoord());
        }

        if (partialWeather.getWeather() != null)
        {
            weatherJson.setWeather(partialWeather.getWeather());
        }

        if (partialWeather.getMain() != null)
        {
            weatherJson.setMain(partialWeather.getMain());
        }

        if (partialWeather.getWind() != null)
        {
            weatherJson.setWind(partialWeather.getWind());
        }

        if (partialWeather.getRain() != null)
        {
            weatherJson.setRain(partialWeather.getRain());
        }

        return weatherJson;
    }

}


/*

如何更新 JSON 資源？

通常有兩種方法：
    •PUT：通常用於完整替換一個資源。
    •PATCH：被設計用來部分更新一個資源。

PUT 和 PATCH 的區別在於，PUT 通常需要提供整個資源的完整表示，而 PATCH 只需要提供要更新的部分。

如何使用:
$ curl -X PATCH http://localhost:8080/weatherApi \
-H "Content-Type: application/json" \
-d '{
    "wind": {
        "speed": 10.5,
        "deg": 180
    },
    "rain": {
        "1h": 5.5
    }
}'

或是
$ http PATCH :8080/weatherApi \
  wind:='{"speed": 10.5, "deg": 180}' \
  rain:='{"1h": 5.5}'

================================================

*/
