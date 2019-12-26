package com.siddu.shoppingbackend.dao;

import java.util.List;

import com.siddu.shoppingbackend.dto.Category;

public interface CategoryDAO {
   List<Category> list();
   Category get(int id);
}
