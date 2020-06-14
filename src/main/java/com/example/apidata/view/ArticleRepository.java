package com.example.apidata.view;

import com.example.apidata.model.ArticleModel;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<ArticleModel, Integer> {
}
