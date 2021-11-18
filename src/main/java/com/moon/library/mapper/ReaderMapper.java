package com.moon.library.mapper;

import com.moon.library.pojo.Reader;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReaderMapper {
    /**
     * 获取所有读者
     * @return
     */
    List<Reader> getAllReader();
    /**
     * 获取读者名称
     * @param readerId
     * @return
     */
    String getReaderName(String readerId);
    /**
     * 获取读者信息
     * @param readerId
     * @return
     */
    Reader getReaderInfo(String readerId);

    /**
     * //更新读者信息
     * @param reader
     */
    void updateInfo(Reader reader);
}
