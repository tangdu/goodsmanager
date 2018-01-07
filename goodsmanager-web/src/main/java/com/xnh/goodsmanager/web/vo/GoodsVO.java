package com.xnh.goodsmanager.web.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品信息对象
 *
 * @author tangdu
 * @version $: GoodsVO.java, v 0.1 2018年01月07日 上午10:11 tangdu Exp $
 */
@Data
public class GoodsVO implements Serializable {
    /****/
    private static final long serialVersionUID = -5885050884440213155L;

    /** 商品ID **/
    private Long goodsId;

    /** 商品名称 **/
    private String goodsName;
}
