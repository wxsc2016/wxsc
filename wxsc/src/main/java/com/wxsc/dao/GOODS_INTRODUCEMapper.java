package com.wxsc.dao;

import com.wxsc.bean.GOODS_INTRODUCE;

public interface GOODS_INTRODUCEMapper {
    int deleteByPrimaryKey(String goodsid);

    int insert(GOODS_INTRODUCE record);

    int insertSelective(GOODS_INTRODUCE record);

    GOODS_INTRODUCE selectByPrimaryKey(String goodsid);
    GOODS_INTRODUCE getIntroduceById(String goodsid);

    int updateByPrimaryKeySelective(GOODS_INTRODUCE record);

    int updateByPrimaryKeyWithBLOBs(GOODS_INTRODUCE record);
}