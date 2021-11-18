package com.moon.library.controller.admin;

import com.moon.library.mapper.ReaderMapper;
import com.moon.library.pojo.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/reader")
public class AdminReaderController {
    @Autowired
    private ReaderMapper readerMapper;

    /**
     * 获取所有读者
     * @return
     */
    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Reader> readers = readerMapper.getAllReader();
        model.addAttribute("readers", readers);
        return "admin/readers";
    }
}
