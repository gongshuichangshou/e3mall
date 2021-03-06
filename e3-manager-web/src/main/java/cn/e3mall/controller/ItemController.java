package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.DatagridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemByItemId(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemByItemId(itemId);
		return tbItem;
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public DatagridResult findItemsWithPage(int page, int rows) {
		DatagridResult dataGridResult = itemService.findItemsWithPage(page, rows);
		return dataGridResult;
	}
}
