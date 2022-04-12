package com.mercadolivre.elasticsearch.controller;

import com.mercadolivre.elasticsearch.domain.Article;
import com.mercadolivre.elasticsearch.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @PostMapping("/create")
    public String createArticle(@RequestBody Article article){
        articleService.saveArticle(article);
        return article.toString();
    }

    @GetMapping("/articles")
    public Iterable<Article> getArticles(){
        return articleService.getArticles();
    }

    @PostMapping("/delete/{id}")
    public String deleteArticle(@PathVariable String id){
        Article article = articleService.findArticle(id);
        articleService.deleteArticle(article);
        return "Artigo apagado com sucesso";
    }

    @PostMapping("/update/{id}")
    public String updateArticle(@PathVariable String id,
                                @RequestParam ("title") String newTitle){
        Article article = articleService.findArticle(id);
        article.setTitle(newTitle);
        articleService.saveArticle(article);
        return article.toString();
    }
}
