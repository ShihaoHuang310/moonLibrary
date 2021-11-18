package com.moon.library.controller.admin;

import com.moon.library.mapper.RecordMapper;
import com.moon.library.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/record")
public class AdminRecordController {
    @Autowired
    private RecordMapper recordMapper;
    /**
     * 获取所有借阅信息
     * @param model
     * @return
     */
    @RequestMapping("/getAll")
    public String getAll(Model model) {
        List<Record> records = recordMapper.getAllRecord();
        model.addAttribute("records", records);
        return "admin/records";
    }
}
