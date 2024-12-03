package com.ahbap.News.news;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Article{
    public Source source;
    public String author;
    public String title;
    public String description;
    public String url;
    public String urlToImage;
    public LocalDate publishedAt;
    public String content;
}



