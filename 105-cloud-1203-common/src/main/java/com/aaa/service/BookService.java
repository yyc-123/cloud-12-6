package com.aaa.service;

import com.aaa.model.BookInfo;

import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
public interface BookService {
    /**
     * 公共接口 获取所有书籍
     * @return
     */
    List<BookInfo> getAllBook();
}
