package com.xt.ssm.controller;

import com.xt.ssm.pojo.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xt on 2018/4/7.
 *
 * @Description:商品控制器
 */
public class ItemsController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
        //调用service查找 数据库，查询商品列表，这里使用静态数据模拟
        //商品列表
        List<Items> itemsList = new ArrayList<>();

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

        //设置模型数据
        request.setAttribute("itemsList", itemsList);
        //设置转发的视图
        request.getRequestDispatcher("WEB-INF/jsp/items/itemsList.jsp").forward(request, reponse);
    }
}