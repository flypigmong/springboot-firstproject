package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class ArticleForm {

    private String title;
    private String contents;

//리팩터링 @AllArgsConstructor으로 대체
/*    public ArticleForm(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }*/
    
//리팩터링 @ToString으로 대체
/*@Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }*/

    public Article toEntity() {
        return new Article(null,title, contents);
    }
}
