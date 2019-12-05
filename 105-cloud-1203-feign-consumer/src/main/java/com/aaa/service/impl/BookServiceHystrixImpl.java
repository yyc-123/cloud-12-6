package com.aaa.service.impl;

import com.aaa.model.BookInfo;
import com.aaa.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@Service
public class BookServiceHystrixImpl implements BookService {
    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("服务降级中");
        return null;
    }
}
