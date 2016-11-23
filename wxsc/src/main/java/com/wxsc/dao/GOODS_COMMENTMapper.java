package com.wxsc.dao;

import java.util.List;

import com.wxsc.bean.GOODS_COMMENT;

public interface GOODS_COMMENTMapper {
	/**通过goodsid删除商品评论**/
    int deleteByPrimaryKey(String goodsid);
	/**实体插入评论表**/
    int insert(GOODS_COMMENT record);
    /**插入评论（区别insert：次方法部分字段会有mapper检验是否为空）**/
    int insertSelective(GOODS_COMMENT record);
	/**由goodsid的到商品的所有评论**/
      List< GOODS_COMMENT> selectByPrimaryKey(String goodsid);   
    /**修改商品评论**/
    int updateByPrimaryKeyWithBLOBs(GOODS_COMMENT record);

}