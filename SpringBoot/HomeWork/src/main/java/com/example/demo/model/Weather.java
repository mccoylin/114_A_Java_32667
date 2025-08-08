package com.example.demo.model;

/*
假設您想提供一個天氣API，其JSON格式如下：

請利用上述內容來設計你所需要的model類別：
Coord、Weather、Main、Wind、Rain

請替這些類別定義適當的建構子及參數、欄位及Getter和Setter方法
讓用戶端不論是透過瀏覽器、curl、或是Postman，皆能得到上述天氣的JSON資料


JSON 範例:

"weather": [
   {
      "id": 501,
      "main": "Rain",
      "description": "moderate rain",
      "icon": "10d"
   }
],

*/

public class Weather
{
    private int id;
    private String main;
    private String description;
    private String icon;


    /**
     * 無參數建構子
     * 這個建構子是為了讓 Jackson 可以反序列化 JSON
    */
    public Weather()
    {
    }


    /**
     * 有參數建構子
     * 這個建構子可以用來直接建立 Weather 物件
     * @param id 天氣 ID
     * @param main 天氣主類型
     * @param description 天氣描述
     * @param icon 天氣圖示代碼
    */
    public Weather(int id, String main, String description, String icon)
    {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }


    /**
     * 取得天氣 ID
     * @return 天氣 ID
    */
    public int getId()
    {
        return id;
    }


    /**
     * 設定天氣 ID
     * @param id 天氣 ID
    */
    public void setId(int id)
    {
        this.id = id;
    }


    /**
     * 取得天氣主類型
     * @return 天氣主類型
    */
    public String getMain()
    {
        return main;
    }


    /**
     * 設定天氣主類型
     * @param main 天氣主類型
    */
    public void setMain(String main)
    {
        this.main = main;
    }


    /**
     * 取得天氣描述
     * @return 天氣描述
    */
    public String getDescription()
    {
        return description;
    }


    /**
     * 設定天氣描述
     * @param description 天氣描述
    */
    public void setDescription(String description)
    {
        this.description = description;
    }


    /**
     * 取得天氣圖示代碼
     * @return 天氣圖示代碼
    */
    public String getIcon()
    {
        return icon;
    }


    /**
     * 設定天氣圖示代碼
     * @param icon 天氣圖示代碼
    */
    public void setIcon(String icon)
    {
        this.icon = icon;
    }

}
