package com.example.restTemplate.service;

import com.example.restTemplate.dto.NewsResponsse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    String baseurl="https://newsapi.org/v2/top-headlines?country=";
    public Object getNews(String countryCode, String apikey) {
    String url=prepareurl(countryCode, apikey);
     NewsResponsse response= restTemplate.getForObject(url, NewsResponsse.class);
    return response;
    }

    private String prepareurl(String countryCode, String apikey) {
        return baseurl + countryCode + '&' + "apikey=" + apikey;
    }
}
