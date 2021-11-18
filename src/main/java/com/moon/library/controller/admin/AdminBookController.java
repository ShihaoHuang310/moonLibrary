package com.moon.library.controller.admin;

import com.moon.library.mapper.BookMapper;
import com.moon.library.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/book")
public class AdminBookController {
    @Autowired
    private BookMapper bookMapper;
    /**
     * 管理员获取所有图书
     * @param
     * @return
     */
    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Book> books = bookMapper.getAllBook();
        model.addAttribute("books", books);
        return "admin/books";
    }
    /**
     * 根据id查询
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/info/{id}")
    public String info(Model model, @PathVariable("id") String id) {
        Book book = bookMapper.getBookById(id);
        model.addAttribute("book", book);
        return "admin/book_info";
    }
    /**
     * 编辑图书
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toEditPage/{id}")
    public String toEditPage(Model model, @PathVariable("id") String id) {
        Book book = bookMapper.getBookById(id);
        model.addAttribute("book", book);
        return "admin/book_edit";
    }
    /**
     * 更新图书
     * @param book
     * @return
     */
    @RequestMapping("/update")
    public String update(Book book) {
        bookMapper.updateBook(book);
        return "redirect:/admin/book/getAll";
    }
    /**
     * 删除图书
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        bookMapper.deleteBook(id);
        return "redirect:/admin/book/getAll";
    }
    /**
     * 跳转添加图书
     * @param
     * @return
     */
    @RequestMapping("/toAddPage")
    public String toAddPage() {
        return "admin/book_add";
    }
    /**
     * 添加图书
     * @param book
     * @return
     */
    @RequestMapping("/add")
    public String add(Book book) {
        bookMapper.addBook(book);
        return "redirect:/admin/book/getAll";
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
        return "admin/book_search_result";
    }
}
