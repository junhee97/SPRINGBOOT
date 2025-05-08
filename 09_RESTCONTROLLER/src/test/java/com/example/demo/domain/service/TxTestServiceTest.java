package com.example.demo.domain.service;

import com.example.demo.domain.dto.MemoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class TxTestServiceTest {

    @Autowired
    private TxTestService txTestService;

    @Test
    public void t1() throws Exception {
        txTestService.addMemoTx(new MemoDto(1, "TEST1"));
    }

    // JPA TX
    @Test
    public void t2() throws Exception {
        txTestService.addMemoTx2(new MemoDto(1, "TEST2"));
    }

}