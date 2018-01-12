package com.guigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 控制层的注解
 * @author Administrator
 *
 */
@Controller
public class MyController {
	/**
	 * 添加图书的方法
	 * @return
	 */
	@RequestMapping(value="book/1",method=RequestMethod.POST)
	public String addBook() {
		System.out.println("添加图书");
		return "dfasdfadsfdddddd--fff-----eeee--------ads";
	}
	/**
	 * 删除图书的方法
	 * @return
	 */
	@RequestMapping(value="book/1",method=RequestMethod.DELETE)
	public String deleteBook() {
		System.out.println("删除图书");
		return "/WEB-INF/index.jsp";
	}
	/**
	 * 修改图书
	 * @return
	 */
	@RequestMapping(value="book/1",method=RequestMethod.PUT)
	public String updateBook() {
		System.out.println("修改图书");
		return "/WEB-INF/index.jsp";
	}
	@RequestMapping("book")
	public String selectBook() {
		System.out.println("查询图书");
		//return "/WEB-INF/index.jsp";
		return "/my.html";
	}
}
