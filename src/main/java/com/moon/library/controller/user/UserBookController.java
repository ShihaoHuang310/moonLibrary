package com.moon.library.controller.user;

import com.moon.library.mapper.BookMapper;
import com.moon.library.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/book")
public class UserBookController {
    @Autowired
    private BookMapper bookMapper;
    /**
     * 获取全部图书
     * @return
     */
    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Book> books = bookMapper.getAllBook();
        model.addAttribute("books", books);
        return "user/books";
    }
    /**
     * 根据图书id获取图书信息
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/info/{id}")
    public String info(Model model, @PathVariable("id") String id) {
        Book book = bookMapper.getBookById(id);
        model.addAttribute("book", book);
        return "user/book_info";
    }

    /**
     * 查询图书
     * @param keyword
     * @param model
     * @return
     */
    @RequestMapping("/search")
    public String search(String keyword, Model model) {
        List<Book> books = bookMapper.searchBook(keyword);
        model.addAttribute("books", books);
        return "user/book_search_result";
    }
}
