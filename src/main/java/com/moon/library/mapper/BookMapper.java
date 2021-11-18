package com.moon.library.mapper;

import com.moon.library.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Mapper
public interface BookMapper {
    /**
     * 获取所有图书
     * @return
     */
    List<Book> getAllBook();
    /**
     * 根据id获取图书
     * @param id
     * @return
     */
    Book getBookById(String id);
    /**
     * 更新图书
     * @param book
     */
    void updateBook(Book book);
    /**
     * 删除图书
     * @param id
     */
    void deleteBook(long id);
    /**
     * 添加图书
     * @param book
     */
    void addBook(Book book);
    /**
     * 查询图书
     * @param keyword
     * @return
     */
    List<Book> searchBook(String keyword);
}
