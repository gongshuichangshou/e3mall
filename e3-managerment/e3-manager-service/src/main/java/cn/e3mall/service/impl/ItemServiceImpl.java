package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;


import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemByItemId(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public List<TbItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
