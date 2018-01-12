package com.xnh.goodsmanager.web;

import cn.luban.commons.web.ApiResult;
import cn.luban.commons.web.ApiResults;
import cn.xnh.datacenter.user.facade.ro.UserRO;
import com.xnh.goodsmanager.integration.service.UserFacadeClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: detail description
 *
 * @author tangdu
 * @version $: UserController.java, v 0.1 2018年01月11日 下午10:32 tangdu Exp $
 */
@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger LOGGER= LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private UserFacadeClient userFacadeClient;

    /**
     * 查询商品列表
     * @param userId 商品查询对象
     * @return 返回商品信息
     */
    @GetMapping("/queryGoodsById")
    @ResponseBody
    public ApiResult<UserRO> queryUserById(Long userId) {
        ApiResult<UserRO> result = null;
        try {
            UserRO userRO = userFacadeClient.queryUserById(userId);
            if(userRO!=null){
                return result= ApiResults.success(userRO);
            }
            return result=ApiResults.failed("数据为空");
        } catch (Exception e) {
            LOGGER.error("queryGoodsById",e);
            return result= ApiResults.failed("查询失败");
        }
    }
}
