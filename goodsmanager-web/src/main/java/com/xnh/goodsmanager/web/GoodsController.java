package com.xnh.goodsmanager.web;

import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;
import com.xnh.goodsmanager.integration.service.GoodsFacadeClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品管理中心
 *
 * @author tangdu
 * @version $: GoodsController.java, v 0.1 2017年12月2017/12/23日 下午4:36 tangdu Exp $
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    private static final Logger LOGGER= LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsFacadeClient goodsFacadeClient;

    /**
     * 查询商品列表
     * @param goodsQueryRO 商品查询对象
     * @return 返回商品信息
     */
    @GetMapping("/queryGoodsById")
    @ResponseBody
    public GoodsRO queryGoodsById(GoodsQueryRO goodsQueryRO) {
        GoodsRO goodsRO = null;
        try {
            goodsRO = goodsFacadeClient.queryGoodsById(goodsQueryRO);
        } catch (Exception e) {
            LOGGER.error("queryGoodsById",e);
        }
        return goodsRO;
    }
}
