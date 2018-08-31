package com.tiger.study.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: rourou
 * @Description:
 * @Date: 2018/8/31
 */
@RestController
@ResponseBody
@RequestMapping(value = "test")
public class TestController {

	@RequestMapping(value = "tiger")
	public String tiger(){

		return "看你妹哦";
	}

}
