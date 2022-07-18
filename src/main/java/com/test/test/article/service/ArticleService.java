package com.test.test.article.service;

import com.test.test.article.dao.ArticleRepository;
import com.test.test.article.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getList(){
        return articleRepository.findAll();
    }

    public Article getArticle(Integer id) {
        Optional<Article> article = this.articleRepository.findById(id);
        return article.get();
    }
}
