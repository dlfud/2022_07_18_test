package com.test.test.reply.controller;

import com.test.test.article.domain.Article;
import com.test.test.article.service.ArticleService;
import com.test.test.reply.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reply")
@RequiredArgsConstructor
public class ReplyController {
    private final ArticleService articleService;
    private final ReplyService replyService;

    @RequestMapping("/create/{id}")
    public String createReply(Model model, @PathVariable("id") Integer id, @RequestParam String content){
        Article article = this.articleService.getArticle(id);
        replyService.create(article, content);
        return String.format("redirect:/article/detail/%s", id);
    }
}
