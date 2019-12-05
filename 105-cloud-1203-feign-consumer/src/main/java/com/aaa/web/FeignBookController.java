package com.aaa.web;

import com.aaa.model.BookInfo;
import com.aaa.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@RestController
public class FeignBookController {
    @Autowired
    private BookService bookService;
    @HystrixCommand
    @GetMapping("feignGetAllBook")
    public List<BookInfo> getAllBook(){
        List<BookInfo> allBook = bookService.getAllBook();
        System.out.println("feign get book  " + allBook.size());
        return allBook;
    }
}
