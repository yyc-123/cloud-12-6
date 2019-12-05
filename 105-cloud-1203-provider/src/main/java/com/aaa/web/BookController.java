package com.aaa.web;

import com.aaa.model.BookInfo;
import com.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 * RestController组合注解
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    /*private int i = 1;*/

    @RequestMapping("/getAllBook")
    public List<BookInfo> getAllBook(){
        List<BookInfo> allBook = bookService.getAllBook();
        if (null == allBook) {
            return null;
        }
        for (BookInfo bookInfo : allBook) {
            System.out.println(bookInfo);
        }

        /*if (++i % 2 == 0) {
            throw new IllegalArgumentException();
        }*/


        return allBook;
    }
}
