package com.citi.swifttrading.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {

    /**
     * 1. ʹ��RequestMappingע����ӳ�������URL
     * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ����InternalResourceViewResolver��ͼ���������������½���
     * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
     * "/WEB-INF/views/success.jsp"
     * @return
     */
    @RequestMapping(value="/helloworld",method=RequestMethod.GET)
    public String hello(Model m){
    	m.addAttribute("ss", "hahaxihihi");
        System.out.println("hello world");
        return "success";
    }
    
   
}