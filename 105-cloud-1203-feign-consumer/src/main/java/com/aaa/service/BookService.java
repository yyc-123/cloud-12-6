package com.aaa.service;

import com.aaa.model.BookInfo;
import com.aaa.service.impl.BookServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@FeignClient(value = "provider-server",fallback = BookServiceHystrixImpl.class)
public interface BookService {
    /**
     * 得到所有书籍
     * @return
     */
    @GetMapping("/getAllBook")
    List<BookInfo> getAllBook();
}
