package com.test.test.article.service;

import com.test.test.article.dao.ArticleRepository;
import com.test.test.article.domain.Article;
import com.test.test.util.DataNOtFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getList(){
        return articleRepository.findAll();
    }

    public Article getArticle(Integer id){
        Optional<Article> article = this.articleRepository.findById(id);

        if(article.isPresent()){
            return article.get();
        }
        else{
            throw new DataNOtFoundException("article not found");
        }
    }

}
