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
    @CrossOrigin(origins = "*")
    @GetMapping("/current")
    public ArticleSearch current()
    {
        try {

            return service.currentNews();
        }
        catch (Throwable ex)
        {
            log.error("Throwable Exception currentNews {} ",ex.getMessage());
        }
        return new ArticleSearch();
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/siyaset")
    public ArticleSearch Siyaset() {

            try {

                return service.Siyaset();

            }
            catch (Throwable ex) {
                log.error("Throwable Exception siyasetNews {} ", ex.getMessage());
            }
            return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/futbool")
    public ArticleSearch futbool() {

        try {

            return service.futbool();

        }
        catch (Throwable ex) {
            log.error("Throwable Exception futboolNews {} ", ex.getMessage());
        }
        return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/basketbool")
    public ArticleSearch basketbool() {

        try {

            return service.basketbool();

        }
        catch (Throwable ex) {
            log.error("Throwable Exception basketboolNews {} ", ex.getMessage());
        }
        return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/teknoloji")
    public ArticleSearch teknoloji() {

        try {

            return service.teknoloji();

        }
        catch (Throwable ex) {
            log.error("Throwable Exception teknolojiNews {} ", ex.getMessage());
        }
        return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/eğitim")
    public ArticleSearch eğitim() {

        try {

            return service.eğitim();

        }
        catch (Throwable ex) {
            log.error("Throwable Exception eğitimNews {} ", ex.getMessage());
        }
        return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/kultur")
    public ArticleSearch kultur() {

        try {

            return service.kultur();

        }
        catch (Throwable ex) {
            log.error("Throwable Exception kulturNews {} ", ex.getMessage());
        }
        return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/sağlık")
    public ArticleSearch sağlık() {

        try {

            return service.sağlık();

        }
        catch (Throwable ex) {
            log.error("Throwable Exception sağlıkNews {} ", ex.getMessage());
        }
        return new ArticleSearch();

    }
    @CrossOrigin(origins = "*")
    @GetMapping("sondakika")
    public ArticleSearch sonDakika()
    {
        try {
            return service.SonDakika();
        }
        catch (Throwable ex)
        {
            log.error("SonDakikaNews Throwable {} ",ex.getMessage());
        }
        return new ArticleSearch();
    }
}
