package com.smcommunity.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import entity.Result;

@Controller
@RequestMapping("/index")
public class IndexController {
	@ResponseBody
	@RequestMapping(value="/getWeather",produces = "application/json;charset=UTF-8")
	public String getWeather() {
		RestTemplate  restTemplate=new RestTemplate();
		String url="http://t.weather.sojson.com/api/weather/city/101120101";
		String result = restTemplate.getForObject(url,String.class , String.class);
		return  result;
	}
}
