package com.ahbap.News.news;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ArticleSearch{
    public String status;
    public int totalResults;
    public List<Article> articles;
}