package mao.jquery_ajax_request.controller;

import mao.jquery_ajax_request.data.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project name(项目名称)：jQuery_ajax_request
 * Package(包名): mao.jquery_ajax_request.controller
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/14
 * Time(创建时间)： 16:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class MyController
{

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/test1")
    public String test1_html()
    {
        return "test1";
    }

    @RequestMapping("/server1")
    @ResponseBody
    public String test1(int a, int b)
    {
        return "hello" + "," + a + "," + b + "," + (a + b);
    }


    @RequestMapping("/test2")
    public String test2_html()
    {
        return "test2";
    }

    @RequestMapping("/server2")
    @ResponseBody
    public String test2(int a, int b)
    {
        return "hello" + "," + a + "," + b + "," + (a + b);
    }


    @RequestMapping("/test3")
    public String test3_html()
    {
        return "test3";
    }

    @RequestMapping("/server3")
    @ResponseBody
    public Data test3(int a, int b)
    {
        return new Data();
    }


    @RequestMapping("/test4")
    public String test4_html()
    {
        return "test4";
    }

    @RequestMapping("/server4")
    @ResponseBody
    public Data test4(int a, int b)
    {
        log.info(a + "," + b);
        return new Data();
    }

}
