package com.moon.library.controller.user;

import com.moon.library.mapper.RecordMapper;
import com.moon.library.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user/record")
public class UserRecordController {
    @Autowired
    private RecordMapper recordMapper;
    /**
     * 根据id获取自己的借阅信息
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/getOwnRecord")
    public String ownRecord(Model model, HttpSession session) {
        String username = (String) session.getAttribute("username");
        List<Record> records = recordMapper.getOwnRecord(username);
        model.addAttribute("records", records);
        return "user/ownRecord";
    }
}
