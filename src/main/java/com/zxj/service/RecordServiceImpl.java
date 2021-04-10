package com.zxj.service;

import com.zxj.dao.RecordMapper;
import com.zxj.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    public void setRecordMapper(RecordMapper recordMapper) {
        this.recordMapper = recordMapper;
    }



    @Override
    public int addRecord(Record record) {
        return recordMapper.addRecord(record);
    }

    @Override
    public int updateRecord(Record record) {
        return recordMapper.updateRecord(record);
    }

    @Override
    public List<Record> selectRecordByBookId(int bookId) {
        return recordMapper.selectRecordByBookId(bookId);
    }

    @Override
    public List<Record> selectRecordByUserId(int userId) {
        return recordMapper.selectRecordByUserId(userId);
    }

}
