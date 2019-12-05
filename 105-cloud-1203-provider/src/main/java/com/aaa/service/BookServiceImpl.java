package com.aaa.service;

import com.aaa.mapper.BookMapper;
import com.aaa.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {
        List<BookInfo> bookInfos = bookMapper.getAllBook();
        System.out.println(bookInfos.size());
        return bookInfos;
    }
}
