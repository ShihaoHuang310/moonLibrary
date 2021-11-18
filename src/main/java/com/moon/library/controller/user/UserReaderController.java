package com.moon.library.controller.user;

import com.moon.library.mapper.ReaderMapper;
import com.moon.library.pojo.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserReaderController {
    @Autowired
    private ReaderMapper readerMapper;
    /**
     * 获取读者信息
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/toInfoPage")
    public String toInfoPage(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        Reader info = readerMapper.getReaderInfo(username);
        model.addAttribute("info", info);
        return "user/reader_info";
    }

    /**
     * 更新图书信息
     * @param reader
     * @return
     */
    @RequestMapping("/info/update")
    public String update(Reader reader) {
        readerMapper.updateInfo(reader);
        return "redirect:/user/toInfoPage";
    }
}
