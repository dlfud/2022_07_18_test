package com.test.test.reply.service;

import com.test.test.article.domain.Article;
import com.test.test.reply.dao.ReplyRepository;
import com.test.test.reply.domain.Reply;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ReplyService {

    private final ReplyRepository replyRepository;

    public void create(Article article, String content){
        Reply reply = new Reply();
        reply.setContent(content);
        reply.setCreateDate(LocalDateTime.now());
        reply.setArticle(article);
        this.replyRepository.save(reply);
    }
}
