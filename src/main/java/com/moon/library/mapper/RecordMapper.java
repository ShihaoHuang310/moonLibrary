package com.moon.library.mapper;

import com.moon.library.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecordMapper {
    /**
     * 获取所有借阅信息
     * @return
     */
    List<Record> getAllRecord();
    /**
     * 根据id获取自己的借阅信息
     * @param readerId
     * @return
     */
    List<Record> getOwnRecord(String readerId);
}
