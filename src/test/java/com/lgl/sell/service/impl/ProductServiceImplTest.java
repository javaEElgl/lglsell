package com.lgl.sell.service.impl;

import com.lgl.sell.pojo.ProductInfo;
import com.lgl.sell.repository.ProductInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl service;
    @Test
    public void findAll(){
        PageRequest pageRequest=new PageRequest(0,2);
        Page<ProductInfo> all = service.findAll(pageRequest);
        System.out.println(all.getTotalElements());
    }
}