package com.zxj.service;

import com.zxj.pojo.Record;

import java.util.List;

public interface RecordService {

    int addRecord(Record record);

    int updateRecord(Record record);


    List<Record> selectRecordByBookId(int bookId);

    List<Record> selectRecordByUserId(int userId);


}
