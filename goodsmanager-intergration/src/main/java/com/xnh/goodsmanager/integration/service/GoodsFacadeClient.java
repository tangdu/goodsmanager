package com.xnh.goodsmanager.integration.service;

import com.xnh.commons.knife.result.Result;
import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;
import com.xnh.goodscenter.facade.service.GoodsFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品中心接口
 *
 * @author tangdu
 * @version $: GoodsFacadeClient.java, v 0.1 2017年12月2017/12/23日 下午5:24 tangdu Exp $
 */
@Service
public class GoodsFacadeClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsFacadeClient.class);

    @Autowired
    private GoodsFacade goodsFacade;

    public GoodsRO queryGoodsList(GoodsQueryRO goodsQueryRO) {
        long start = System.currentTimeMillis();
        Result<GoodsRO> roResult = null;
        try {
            roResult = goodsFacade.queryGoodsById(1l);
            if (roResult.isSuccess()) {
                return roResult.getData();
            }
        } catch (Exception ex) {
            LOGGER.error("QUERYGOODSLIST_ERROR", ex);
        } finally {
            LOGGER.info("QUERYGOODSLIST,exec:{},goodsQueryRO:{},result:{}", (System.currentTimeMillis() - start) + "ms", roResult);
        }
        return null;
    }
}
