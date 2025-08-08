package com.example.demo.model;

/*
假設您想提供一個天氣API，其JSON格式如下：

請利用上述內容來設計你所需要的model類別：
Coord、Weather、Main、Wind、Rain

請替這些類別定義適當的建構子及參數、欄位及Getter和Setter方法
讓用戶端不論是透過瀏覽器、curl、或是Postman，皆能得到上述天氣的JSON資料


JSON 範例:

"rain": {
   "1h": 2.73
}

*/


import com.fasterxml.jackson.annotation.JsonProperty;

// 這個類別用來表示降雨量，猜測可能是 1 小時內的降雨量
public class Rain
{
    // 使用這個 get 命名方法可以獲得 key "1h" 的輸出。厡因如程式最後所示。
    // public double get1h()       //
    // 缺點是日後尋找 method 時會很難有聯想。
    //
    // AI (Gemini) 建議我的修改方法是:使用 @JsonProperty 明確指定 JSON 欄位名稱。

    @JsonProperty("1h")     // 在欄位上加上 @JsonProperty，明確指定對應的 JSON key 是 "1h"
    private double rainVolume1h;        // 無法用 "1h" 作為變數名稱，所以改用 "rainVolume1h"


    /**
     * 無參數建構子
     * 這個建構子是為了讓 Jackson 可以反序列化 JSON
    */
    public Rain()
    {
    }


    /**
     * 有參數建構子
     * 這個建構子可以用來直接建立 Rain 物件
     * @param rainVolume1h 1 小時內的降雨量
    */
    public Rain(double rainVolume1h)
    {
        this.rainVolume1h = rainVolume1h;
    }


    // getter 和 setter 方法
    // AI (Gemini) 建議我的修改方法是:使用 @JsonProperty 明確指定 JSON 欄位名稱。
    /**
     * 取得 1 小時內的降雨量
     * @return 1 小時內的降雨量
    */
    // public double get1h()       // 使用這個 get 命名方法可以獲得 key "1h" 的輸出。
    public double getRainVolume1h()       //
    {
        return rainVolume1h;
    }


    /**
     * 設定 1 小時內的降雨量
     * @param rainVolume1h 1 小時內的降雨量
    */
    // public void set1h(double rainVolume1h)
    public void setRainVolume1h(double rainVolume1h)
    {
        this.rainVolume1h = rainVolume1h;
    }

}


//
// 在 Java 中，變數名稱不能以數字開頭，所以無法直接使用 "1h" 作為變數名稱 ，所以改用 "rainVolume1h"
// 並提供 getter 和 setter 方法來存取這個值
// 而我們又需要輸出的 key 是 "1h"，這就需要一些額外的處理來確保 JSON 的輸出符合預期。
//
// public double get1h()
// 於是，當你使用 JSON 序列化函式庫 (如 Jackson) 將這個物件轉換為 JSON 時，
// 這是一個非常好的問題，也是在使用 JSON 序列化函式庫 (如 Jackson) 時常會遇到的情況。之所以輸出的 JSON 欄位名稱會是 1h，關鍵在於你的 getter 和 setter 方法的命名方式。
// 原因解析Spring Boot 預設使用 Jackson 這個函式庫來將 Java 物件轉換為 JSON 字串。
// Jackson 在決定 JSON 欄位名稱時，遵循的是 JavaBeans 的規範，
// 它的判斷邏輯如下：
// 1.優先看 public 的 getter/setter 方法，而不是看 private 的欄位名稱。
// 2.它會取 getter 的方法名稱 (例如 get1h)。
// 3.去掉 "get" 前綴，剩下 1h。
// 4.將剩餘字串的第一個字母轉為小寫。因為 1 不是大寫字母，所以它保持不變。
// 5.最終，它認定這個屬性的名稱就是 1h，所以在產生 JSON 時，就使用了 "1h" 作為 key。
//
// 簡單來說，get1h() 這個方法名稱，讓 Jackson 認為這個屬性就叫做 1h，而完全忽略了你實際的欄位變數名稱 rainVolume1h。
