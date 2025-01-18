package com.ahbap.News;

import com.ahbap.News.news.ArticleSearch;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Component
@Slf4j
public class ControlerService {
    private static final Logger log = LoggerFactory.getLogger(ControlerService.class);
    public RestTemplate rest;
    private static final String m_Url = "https://newsapi.org/v2/everything?q=%s&from=%d-%d-%d&sortBy=popularity&apiKey=652f7a9cea6e4975baadd200bf9799ee";

    // https://newsapi.org/v2/everything?q=iran&from=2024-11-19&sortBy=popularity&apiKey=652f7a9cea6e4975baadd200bf9799ee
    public ControlerService(RestTemplate rest) {
        this.rest = rest;
    }

    public ArticleSearch newsSearch() {

        try {
            var now = LocalDate.now();
            var year = now.getYear();
            var month = now.getMonthValue();
            var day = now.getDayOfMonth() - 2;

            var urls = m_Url.formatted("türkiye", year, month, day);

            log.info("Url ---------------------- {}", urls);
            return rest.getForObject(urls, ArticleSearch.class);
        } catch (Throwable ex) {
            log.error("Throwable Exception newsSearch {} ", ex.getMessage());
        }
        return new ArticleSearch();
    }

    public ArticleSearch newsCityh(String city) {
        try {
            var now = LocalDate.now();
            var year = now.getYear();
            var month = now.getMonthValue();
            var day = now.getDayOfMonth() - 2;
            var urls = m_Url.formatted(city, year, month, day);
            log.info("url {}", urls);
            return rest.getForObject(urls, ArticleSearch.class);
        } catch (Throwable ex) {
            log.error("Throwable Exception newsCity {} ", ex.getMessage());
        }
        return new ArticleSearch();
    }

    public ArticleSearch currentNews() {
        try {
            var now = LocalDate.now();
            var month = now.getMonthValue();
            var day = now.getDayOfMonth() - 2;
            var year = now.getYear();

            var url = m_Url.formatted("Güncel", year, month, day);
            log.info("current {}", url);
            return rest.getForObject(url, ArticleSearch.class);

        } catch (Throwable ex) {
            log.error("Current Throwable exception {}",
                    ex.getMessage());
        }
        return new ArticleSearch();
    }

    public ArticleSearch Siyaset() {
        try {
            var now = LocalDate.now();
            var month = now.getMonthValue();
            var day = now.getDayOfMonth() - 2;
            var year = now.getYear();

            var url = m_Url.formatted("Siyaset", year, month, day);
            log.info("Siyaset {}",url);

            return rest.getForObject(url, ArticleSearch.class);
        } catch (Throwable ex) {
            log.error("Spor Throwable Exception {}", ex.getMessage());
        }
        return new ArticleSearch();
    }

    public ArticleSearch futbool()
    {
        try {

            return this.newsCityh("Futbol");
        }
        catch (Throwable ex)
        {
            log.error("futbool Throwable {}",ex.getMessage());
        }
        return new ArticleSearch();
    }
    public ArticleSearch basketbool()
    {
        try {

            return this.newsCityh("Basketbol");
        }
        catch (Throwable ex)
        {
            log.error("basketbool Throwable {}",ex.getMessage());
        }
        return new ArticleSearch();
    }
    public ArticleSearch teknoloji()
    {
        try {

            return this.newsCityh("Teknoloji");
        }
        catch (Throwable ex)
        {
            log.error("Teknoloji Throwable {}",ex.getMessage());
        }
        return new ArticleSearch();
    }

    public ArticleSearch sağlık()
    {
        try {

            return this.newsCityh("Sağlık");
        }
        catch (Throwable ex)
        {
            log.error("Sağlık Throwable {}",ex.getMessage());
        }
        return new ArticleSearch();
    }
    public ArticleSearch eğitim()
    {
        try {

            return this.newsCityh("Eğitim");
        }
        catch (Throwable ex)
        {
            log.error("eğitim Throwable {}",ex.getMessage());
        }
        return new ArticleSearch();
    }
    public ArticleSearch kultur()
    {
        try {

            return this.newsCityh("Kültür ve Sanat");
        }
        catch (Throwable ex)
        {
            log.error("Kultur Throwable {}",ex.getMessage());
        }
        return new ArticleSearch();
    }
    public ArticleSearch SonDakika() {
        try {
            return this.newsCityh("Son Dakika");
        }
        catch (Throwable ex) {
            log.error("Sondakika Throwable {}", ex.getMessage());
        }
        return new ArticleSearch();
    }
}

