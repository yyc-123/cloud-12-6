package com.aaa.web;

import com.aaa.model.BookInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@RestController
public class RibbonConsumerBookController {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("getAllBook")
    public List<BookInfo> getAllBook(){
        LinkedList<BookInfo> forObject = restTemplate.getForObject("http://provider-server/getAllBook", LinkedList.class);
        System.out.println(forObject.size());
        return forObject;
    }
    public List<BookInfo> error() {
        System.out.println("服务熔断了");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("啊啊啊");
        List<BookInfo> fallList = new LinkedList<>();
        fallList.add(bookInfo);
        return fallList;
    }
}
