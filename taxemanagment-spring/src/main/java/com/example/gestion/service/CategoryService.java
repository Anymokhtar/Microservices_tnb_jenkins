package com.example.gestion.service;

import com.example.gestion.bean.Category;
import com.example.gestion.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    public int save(Category c)
    {
        if (c != null) {
            categoryDao.save(c);
            return 1;
        } else return -1;
    }

    public Category updateCategory(Long id, Category category) {
        Category app = findById(id).get();
        app.setDescription(category.getDescription());
        app.setLabel(category.getLabel());
        categoryDao.save(app);
        return app;
    }
    public Optional<Category> findById(Long cId)
    {
        return categoryDao.findById(cId);
    }

    public void deleteById(Long cId)
    {
        categoryDao.deleteById(cId);
    }

    public void deleteAll() {
        categoryDao.deleteAll();
    }

    public List<Category> findAll()
    {
        return categoryDao.findAll();
    }
}
