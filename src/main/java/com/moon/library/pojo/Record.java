package com.moon.library.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Record {
    private long sernum;
    private long bookId;
    private int readerId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lendDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date backDate;
}
