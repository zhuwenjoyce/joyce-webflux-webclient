package com.joyce.webclient.demo.util;

import lombok.Data;

import java.util.HashMap;

@Data
public class MyResponse extends HashMap<String, Object> {

    public static MyResponse of(String code, Object obj) {
        MyResponse res = new MyResponse();
        res.put(code, obj);
        return res;
    }

}
