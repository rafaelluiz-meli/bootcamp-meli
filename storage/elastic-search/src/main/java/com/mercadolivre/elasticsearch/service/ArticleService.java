package com.mercadolivre.elasticsearch.service;

import com.mercadolivre.elasticsearch.domain.Article;
import com.mercadolivre.elasticsearch.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticleService implements IArticleService{

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Article> getArticles() {
        return articleRepository.findAll();
    }

    @Override
    @Transactional
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    @Transactional
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    @Override
    @Transactional(readOnly = true)
    public Article findArticle(String id) {
        return articleRepository.findById(id).get();
    }
}
