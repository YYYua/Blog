package com.lsy.service;

import com.lsy.po.Comment;

import java.util.List;

/**评论
 * @author lsy
 * @data 2020/3/14 - 15:08
 */

public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
