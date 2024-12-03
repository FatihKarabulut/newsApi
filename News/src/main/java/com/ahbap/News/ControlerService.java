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
    private static final String m_Url ="https://newsapi.org/v2/everything?q=%s&from=%d-%d-%d&sortBy=popularity&apiKey=652f7a9cea6e4975baadd200bf9799ee";

    // https://newsapi.org/v2/everything?q=iran&from=2024-11-19&sortBy=popularity&apiKey=652f7a9cea6e4975baadd200bf9799ee
    public ControlerService(RestTemplate rest) {
        this.rest = rest;
    }

    public ArticleSearch newsSearch()
    {

      try {
          var now = LocalDate.now();
          var year = now.getYear();
          var month = now.getMonthValue();
          var day = now.getDayOfMonth() - 2;

          var urls = m_Url.formatted("türkiye",year, month, day);

          log.info("Url ---------------------- {}", urls);
          return rest.getForObject(urls, ArticleSearch.class);
      }
      catch (Throwable ex)
      {
          log.error("Throwable Exception newsSearch {} ",ex.getMessage());
      }
        return new ArticleSearch();
    }

    public ArticleSearch newsCityh(String city)
    {
        try {
            var now = LocalDate.now();
            var year = now.getYear();
            var month = now.getMonthValue();
            var day = now.getDayOfMonth() - 2;
            var urls = m_Url.formatted(city,year, month, day);
            log.info("url {}",urls);
            return rest.getForObject(urls,ArticleSearch.class);
        }
        catch (Throwable ex)
        {
            log.error("Throwable Exception newsCity {} ",ex.getMessage());
        }
        return new ArticleSearch();
    }


}
