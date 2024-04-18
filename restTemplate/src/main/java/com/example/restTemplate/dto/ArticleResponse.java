package com.example.restTemplate.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE) //lowest priority
public class ArticleResponse {
   private String author;
    String title;
    String description;

    List<ArticleResponse> articles;
}
