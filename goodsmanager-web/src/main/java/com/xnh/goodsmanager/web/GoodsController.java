package com.xnh.goodsmanager.web;

import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;
import com.xnh.goodsmanager.integration.service.GoodsFacadeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理中心
 *
 * @author tangdu
 * @version $: IndexController.java, v 0.1 2017年12月2017/12/23日 下午4:36 tangdu Exp $
 */
@Controller
public class GoodsController {

    @Autowired
    private GoodsFacadeClient goodsFacadeClient;

    /**
     * 查询商品列表
     * @param goodsQueryRO 商品查询对象
     * @return 返回商品信息
     */
    @GetMapping("/index2")
    @ResponseBody
    public GoodsRO ddd(GoodsQueryRO goodsQueryRO) {
        GoodsRO goodsRO = goodsFacadeClient.queryGoodsList(goodsQueryRO);
        return goodsRO;
    }
}
