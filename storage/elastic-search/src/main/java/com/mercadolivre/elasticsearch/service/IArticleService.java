package com.mercadolivre.elasticsearch.service;

import com.mercadolivre.elasticsearch.domain.Article;

import java.util.List;

public interface IArticleService {
    Iterable<Article> getArticles();
    void saveArticle(Article article);
    void deleteArticle(Article article);
    Article findArticle(String id);
}
