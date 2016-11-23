package com.wxsc.dao;

import com.wxsc.bean.DATE_SALED;

public interface DATE_SALEDMapper {
    int deleteByPrimaryKey(String goodsid);

    int insert(DATE_SALED record);

    int insertSelective(DATE_SALED record);

    DATE_SALED selectByPrimaryKey(String goodsid);

    int updateByPrimaryKeySelective(DATE_SALED record);

    int updateByPrimaryKey(DATE_SALED record);
}