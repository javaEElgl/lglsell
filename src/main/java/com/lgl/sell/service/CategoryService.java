package com.lgl.sell.service;

import com.lgl.sell.pojo.ProductCategory;

import java.util.List;

public interface CategoryService {

    //查询一条记录
    ProductCategory findOne(Integer id);
    //查询所有
    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
