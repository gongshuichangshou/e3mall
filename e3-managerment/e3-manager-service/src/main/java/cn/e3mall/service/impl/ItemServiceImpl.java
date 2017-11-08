package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.common.pojo.DatagridResult;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
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
	public DatagridResult findItemsWithPage(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(new TbItemExample());
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		DatagridResult datagridResult = new DatagridResult();
		datagridResult.setRows(pageInfo.getList());
		datagridResult.setTotal(pageInfo.getTotal());
		return datagridResult;
	}

}
