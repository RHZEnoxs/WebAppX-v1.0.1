package com.enoxs.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

public class JSONUtil {
    private static final String UTF8 = "UTF-8";
    private static final String STATUS = "status";
    private static final String DESC = "desc";
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";
    private static final int maxLogSize= 100 * 1024;
    public static String encodeString(String str) {
        String result = null;
        try {
            result = URLEncoder.encode(str, UTF8).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            result = "";
        }

        return result;
    }
    public static JSONObject generateAjaxResult() {
        return generateAjaxResult(StringUtils.EMPTY, null);
    }
    /**
     * 產生回傳Ajax訊息
     * @param successString
     * @param failString
     * @return
     */
    public static JSONObject generateAjaxResult(String successString, String failString) {
        JSONObject jo = new JSONObject();
        failString = ObjectUtils.defaultIfNull(failString, StringUtils.EMPTY);
        successString = ObjectUtils.defaultIfNull(successString, StringUtils.EMPTY);
        jo.put(STATUS, failString.length() == 0 ? SUCCESS : FAIL);
        jo.put(DESC, failString.length() == 0 ? successString : failString);
        return jo;
    }
}
