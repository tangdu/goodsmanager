package com.xnh.goodsmanager.integration.service;

import cn.luban.commons.result.Result;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import cn.xnh.datacenter.user.facade.service.UserFacade;
import com.xnh.goodscenter.facade.ro.GoodsQueryRO;
import com.xnh.goodscenter.facade.ro.GoodsRO;
import com.xnh.goodscenter.facade.service.GoodsFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO: detail description
 *
 * @author tangdu
 * @version $: UserFacadeClient.java, v 0.1 2018年01月11日 下午10:30 tangdu Exp $
 */
@Service
public class UserFacadeClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsFacadeClient.class);

    @Autowired
    private UserFacade userFacade;

    public UserRO queryUserById(Long userId) {
        long start = System.currentTimeMillis();
        Result<UserRO> roResult = null;
        try {
            roResult = userFacade.queryUserById(userId);
            if (roResult.isSuccess()) {
                return roResult.getData();
            }
        } catch (Exception ex) {
            LOGGER.error("queryUserById", ex);
        } finally {
            LOGGER.info("queryUserById,exec:{},goodsQueryRO:{},result:{}", (System.currentTimeMillis() - start) + "ms", roResult);
        }
        return null;
    }
}
