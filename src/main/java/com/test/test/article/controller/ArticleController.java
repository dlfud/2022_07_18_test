package com.test.test.article.controller;

import com.test.test.article.domain.Article;
import com.test.test.article.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @RequestMapping("/list")
//    @ResponseBody
//    public List<Article> showList(){
//        return articleService.getList();
//    }

    @RequestMapping("/list")
    public String showList(Model model){
        List<Article> articleList = articleService.getList();
        model.addAttribute("articleList", articleList);
        return "/article_list";
    }

    @RequestMapping("/detail/{id}")
    public String showArticle(Model model, @PathVariable("id") Integer id){
        Article article = this.articleService.getArticle(id);
        model.addAttribute("article", article);

        return "/article_detail";
    }
}
