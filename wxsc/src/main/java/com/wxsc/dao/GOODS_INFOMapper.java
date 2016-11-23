package com.wxsc.dao;

import java.util.List;


import com.wxsc.bean.GOODS_INFO;

public interface GOODS_INFOMapper {
	/**由id删除商品*/
    int deleteByPrimaryKey(String goodsid);
    /**由id插入商品,正常情况不用此方法*/
    int insert(GOODS_INFO record);
    /**通过实体插入商品*/
    int insertSelective(GOODS_INFO record);
	/**由id查询商品*/
    GOODS_INFO selectByPrimaryKey(String goodsid);
    /**由实体插入商品*/
    int updateByPrimaryKeySelective(GOODS_INFO record);
	/**由id更新商品，正常情况不用此方法*/
    int updateByPrimaryKey(GOODS_INFO record);
	/**查询某种类别的所有商品*/
   
	List<GOODS_INFO> selectAllByClass(String goodsClass);
}