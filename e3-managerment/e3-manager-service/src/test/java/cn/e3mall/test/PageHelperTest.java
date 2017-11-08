package cn.e3mall.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;

public class PageHelperTest {
	@Test
	public void testPage() throws Exception {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		PageHelper.startPage(0, 10);
		TbItemMapper bean = app.getBean(TbItemMapper.class);
		List<TbItem> list = bean.selectByExample(new TbItemExample());
		PageInfo<TbItem> page = new PageInfo<TbItem>(list);
		long total = page.getTotal();
		System.out.println(total);
		int startRow = page.getStartRow();
		System.out.println(startRow);
		System.out.println(page.getPages());
	}
}
