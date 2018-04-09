package com.xt.ssm.controller;

import com.xt.ssm.pojo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xt on 2018/4/7.
 *
 * @Description:注解开发商品控制器
 */
//使用Controller标识它是一个控制器
@Controller
public class ItemsController3 {

    //商品查询列表
    //@RequestMapping实现对queryItems方法和url进行映射，一个方法对应一个url
    //一般建议将url和方法写成一样
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {

        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        List<Items> itemsList = new ArrayList<Items>();
        //向list中填充静态数据

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当 于request的setAttribut，在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList", itemsList);

        //指定视图，在视图解析器中指定jsp路径的前缀和后缀可以不用下面的配置
        //modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        modelAndView.setViewName("items/itemsList");

        return modelAndView;

    }
}
