package com.github.zhixingheyi0712.bilibiliplayer.util.json.favlist;

public class FavListJsonBean {

    private int code;
    private String message;
    private int ttl;
    private Data data;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }
    public int getTtl() {
        return ttl;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public Data getData() {
        return data;
    }

}