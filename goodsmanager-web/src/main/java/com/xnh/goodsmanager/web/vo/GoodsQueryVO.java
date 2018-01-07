package com.xnh.goodsmanager.web.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品查询对象
 *
 * @author tangdu
 * @version $: GoodsQueryRO.java, v 0.1 2017年12月23日 上午1:02 tangdu Exp $
 */
@Data
public class GoodsQueryVO implements Serializable {

    /**商品ID**/
    private Long goodsId;
    /**商品ID**/
    private String goodsName;
}
