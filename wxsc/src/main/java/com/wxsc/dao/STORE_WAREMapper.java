package com.wxsc.dao;

import com.wxsc.bean.STORE_WARE;

public interface STORE_WAREMapper {
    int deleteByPrimaryKey(String goodsid);

    int insert(STORE_WARE record);

    int insertSelective(STORE_WARE record);

    STORE_WARE selectByPrimaryKey(String goodsid);

    int updateByPrimaryKeySelective(STORE_WARE record);

}