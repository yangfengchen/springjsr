package com.ddzj.controller;

import com.ddzj.entity.UserInfo;
import com.ddzj.service.UserInfoService;
import com.ddzj.vo.PageData;
import com.ddzj.vo.PageVo;
import com.ddzj.vo.UserVo;
import com.ddzj.vo.YssResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @创建时间 2018/11/10
 * @描述
 */
@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/testFirst")
    @ResponseBody
    public void testFirst(){
        UserInfo userInfo = userInfoService.selectByPrimaryKey(1);
        if(userInfo != null){
            System.out.println(userInfo.getName());
        }
    }

    @RequestMapping("/testOne")
    @ResponseBody
    public void testOne(){
        String name = userInfoService.selectNameById(1);
        System.out.println(name);
    }

    @RequestMapping("/testvailIndex")
    public String testvailIndex(){
        return "testvailIndex";
    }

    @RequestMapping("/testvailData")
    public String testvailData(@Valid UserVo userVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            System.out.println("Code:"+fieldError.getCode()+", object:"+fieldError.getObjectName()
                    +", field:"+fieldError.getField()+",message:"+fieldError.getDefaultMessage());
        }
        return "testvailData";
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public YssResponse testAjax(){
        YssResponse yssResponse = new YssResponse();
        Map<String,String> dataMap = new HashMap<String,String>();
        dataMap.put("id","1");
        yssResponse.setErrcode(0);
        yssResponse.setErrmsg("测试111");
        yssResponse.setData(dataMap);
        return yssResponse;
    }

    @RequestMapping("/testPage")
    @ResponseBody
    public YssResponse testAjax(@RequestBody PageVo pageVo){
        YssResponse yssResponse = new YssResponse();
        yssResponse.setErrcode(0);
        yssResponse.setErrmsg("测试111");

        PageData pageData = new PageData();
        pageData.setTotalElements(10);
        /*List<Map<String,String>> content = new ArrayList<Map<String,String>>();
        for(int i = 0 ; i < 10 ; i++){
            Map<String,String> dataMap = new HashMap<String,String>();
            String name = "name";
            name += pageVo.getPageNumber()+""+i;
            dataMap.put("id",System.currentTimeMillis()+"");
            dataMap.put("name", name);
            content.add(dataMap);
        }*/

        List<Map<String,String>> content = new ArrayList<Map<String,String>>();
        Map<String,String> dataMap = new HashMap<String,String>();
        String name = "name";
        name += pageVo.getPageNumber();
        dataMap.put("name", name);
        content.add(dataMap);
        pageData.setContent(content);
        yssResponse.setData(pageData);
        return yssResponse;
    }

    @RequestMapping("/testHtml")
    @ResponseBody
    public YssResponse testAjax(@RequestBody Map<String,String> requestMap){
        YssResponse yssResponse = new YssResponse();
        yssResponse.setErrcode(0);
        yssResponse.setErrmsg("测试111");
        Map<String,String> dataMap = new HashMap<String,String>();
        String id = requestMap.get("id");
        System.out.println(id);
        if(StringUtils.isBlank(id)){
            id = "a032723b-9f35-47bf-a919-870dc41908d2";
        }
        String url = "http://zjcs.gdggzy.org.cn/gd-zjcs-pub/pubNotice/view/"+id;
        try {
            Document document = Jsoup.connect(url).get();
            Elements elements = document.body().select(".detail__main");
            Element element = elements.get(0).removeClass(".main-title");
            dataMap.put("content",element.outerHtml());
        } catch (IOException e) {
            e.printStackTrace();
        }

        yssResponse.setData(dataMap);
        return yssResponse;
    }

    @RequestMapping("/testErrorCode")
    @ResponseBody
    public Map<String,Object> testErrorCode(){
      Map<String,Object> dataMap = new HashMap<String,Object>();
      dataMap.put("errcode","0");
      dataMap.put("errmsg","1234");
      dataMap.put("data",new ArrayList<String>());
      return dataMap;
    }


}
