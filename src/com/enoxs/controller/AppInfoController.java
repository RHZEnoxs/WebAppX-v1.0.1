package com.enoxs.controller;

import com.enoxs.domain.AppInfo;
import com.enoxs.util.JSONUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping({"/appInfo"})
public class AppInfoController {

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("app/appInfo");
        return view;
    }

    @RequestMapping(value = {"qunitSE"}, method = RequestMethod.GET)
    public ModelAndView qunitSE() {
        ModelAndView view = new ModelAndView("qunit/qunitSE");
        return view;
    }

    //Enoxs TO-DO : GET WebPage

    /**
     * Post Integer
     * Return JSONObject
     */
    @ResponseBody
    @RequestMapping(value = {"/postInteger"}, method = RequestMethod.POST)
    public String postInteger(Integer id) {
        System.out.println("id :" + id);
        //JSONObject result = JSONUtil.generateAjaxResult();
        JSONObject result = JSONUtil.generateAjaxResult("Success !!!", null);
        try {
            AppInfo appInfo = new AppInfo();
            appInfo.setAppId(Long.valueOf("1"));
            result.put("list", new JSONObject(appInfo));
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONUtil.generateAjaxResult(null, "Fail !!!");
        }
        return JSONUtil.encodeString(result.toString());
    }

    /**
     * Post Long
     * Return JSONArray
     */
    @ResponseBody
    @RequestMapping(value = {"/postLong"}, method = RequestMethod.POST)
    public String postInteger(Long id) {
        System.out.println("id :" + id);
//        JSONObject result = JSONUtil.generateAjaxResult();
        JSONObject result = JSONUtil.generateAjaxResult("Success !", null);
        try {
            List<AppInfo> lstAppInfo = new LinkedList<>();
            lstAppInfo.add(new AppInfo());
            lstAppInfo.add(new AppInfo());
            lstAppInfo.add(new AppInfo());
            for (int i = 0; i < lstAppInfo.size(); i++) {
                lstAppInfo.get(i).setAppId(Long.valueOf(i));
            }
            result.put("list", new JSONArray(lstAppInfo));
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONUtil.generateAjaxResult(null, "Fail !");
        }
        return JSONUtil.encodeString(result.toString());
    }

    @ResponseBody
    @RequestMapping(value = {"/postString"}, method = RequestMethod.POST)
    public String postString(String msg) {
        System.out.println("msg :" + msg);
        JSONObject result = JSONUtil.generateAjaxResult("Success !!!", null);
        try {
            AppInfo appInfo = new AppInfo();
            appInfo.setAppId(Long.valueOf("2"));
            result.put("list", new JSONObject(appInfo));
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONUtil.generateAjaxResult(null, "Fail !!!");
        }
        return JSONUtil.encodeString(result.toString());
    }

    @ResponseBody
    @RequestMapping(value = {"/postMoreParam"}, method = RequestMethod.POST)
    public String postString(Long id, String msg) {
        System.out.println("id :" + id);
        System.out.println("msg :" + msg);
        return generateResult();
    }

    @ResponseBody
    @RequestMapping(value = {"/postIntegerArray"}, method = RequestMethod.POST)
    public String postIntegerArray(@RequestParam(name = "postArray[]", required = false) Integer[] postArray) {
        System.out.println("Len :" + postArray.length);
        for (int i = 0; i < postArray.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(postArray[i]);
        }
        System.out.println();
        return generateResult();
    }

    @ResponseBody
    @RequestMapping(value = {"/postStringArray"}, method = RequestMethod.POST)
    public String postIntegerString(@RequestParam(name = "postArray[]", required = false) String[] postString) {
        System.out.println("Len :" + postString.length);
        for (int i = 0; i < postString.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(postString[i]);
        }
        System.out.println();
        return generateResult();
    }

    //Enoxs TO-DO : POST List<String>
    @ResponseBody
    @RequestMapping(value = {"/postListInteger"}, method = RequestMethod.POST)
    public Map<String, Object> postListInteger(@RequestBody List<Integer> lstNumber) {
        System.out.println("Size :" + lstNumber.size());
        for (int i = 0; i < lstNumber.size(); i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(lstNumber.get(i));
        }
        System.out.println();

        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            resultMap.put("result", "success");
        } catch (Exception e) {
            resultMap.put("result", "fail");
        }
        return resultMap;
    }

    //Enoxs TO-DO : POST Object
    //Enoxs TO-DO : POST List<Object>
    //Enoxs TO-DO : POST Object include List<>

    private String generateResult() {
//        JSONObject result = JSONUtil.generateAjaxResult();
        JSONObject result = JSONUtil.generateAjaxResult("Success !!!", null);
        try {
            AppInfo appInfo = new AppInfo();
            appInfo.setAppId(Long.valueOf("3"));
            result.put("list", new JSONObject(appInfo));
        } catch (Exception e) {
            e.printStackTrace();
            result = JSONUtil.generateAjaxResult(null, "Fail !!!");
        }
        return JSONUtil.encodeString(result.toString());
    }
}
