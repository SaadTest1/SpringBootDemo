package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Article;
/*ddddd
 * interface  IArticleService
 */

public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean createArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
