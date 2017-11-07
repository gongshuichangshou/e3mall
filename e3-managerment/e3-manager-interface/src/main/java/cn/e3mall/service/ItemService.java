package cn.e3mall.service;

import java.util.List;

import cn.e3mall.pojo.TbItem;

public interface ItemService {

	TbItem getItemByItemId(Long itemId);
    List<TbItem> findAll();
}
