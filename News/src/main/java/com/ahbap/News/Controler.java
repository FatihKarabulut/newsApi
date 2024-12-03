package com.ahbap.News;

import com.ahbap.News.news.ArticleSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class Controler {
    private static final Logger log = LoggerFactory.getLogger(Controler.class);
    public ControlerService service;

    public Controler(ControlerService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/newsearch")
    public ArticleSearch newsSearch()
    {

        try {

            return service.newsSearch();
        }
        catch (Throwable ex)
        {
            log.error("Throwable Exception newsSearch {} ",ex.getMessage());
        }
        return new ArticleSearch();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/newcity")
    public ArticleSearch newsCity(@RequestParam String city)
    {
        try {

            return service.newsCityh(city);
        }
        catch (Throwable ex)
        {
            log.error("Throwable Exception newsCity {} ",ex.getMessage());
        }
        return new ArticleSearch();
    }

}
