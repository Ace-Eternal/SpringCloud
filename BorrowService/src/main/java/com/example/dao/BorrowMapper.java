package com.example.dao;

import com.example.pojo.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BorrowMapper {
    List<Borrow> getBorrowsByUid(int uid);

    List<Borrow> getBorrowsByBid(int bid);

    Borrow getBorrowByUidAndBid(@Param(value = "uid") int uid,@Param(value = "bid") int bid);
}
