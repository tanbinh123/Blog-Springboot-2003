package com.example.demo.service;

import com.example.demo.domain.Reply;

import java.util.List;

public interface ReplyService {
    // 增
    void addReply(Reply reply);

    // 删
    void delReply(Integer id);

    // 查
    Reply findReplyById(Integer id);
    // 查询评论相关的部分回复
    List<Reply> findPartReplyByCommentId(Integer commentId);
    // 查询评论相关的所有回复
    List<Reply> findAllReplyByCommentId(Integer commentId);

    // 改
    void saveReply(Reply reply);
}
