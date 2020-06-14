package com.example.apidata.controller;


import com.example.apidata.model.ArticleModel;
import com.example.apidata.view.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping

public class ArticleController {
    @Autowired

    private ArticleRepository articleRepository;
    @PostMapping(path="/add/articles")
    public @ResponseBody String addNewUser(@RequestParam int article_id, @RequestParam String title) {
        ArticleModel n = new ArticleModel();
        n.setArticle_id(article_id);
        n.setTitle(title);
        articleRepository.save(n);
        return "Data Article  Has Been Saved";
    }

    @GetMapping(path="/articles")
    public @ResponseBody Iterable<ArticleModel> getAllArticle(){
        return articleRepository.findAll();
    }
}
