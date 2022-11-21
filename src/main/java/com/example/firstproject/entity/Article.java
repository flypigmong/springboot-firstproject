package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체를 인식 가능!
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자를 추가
@ToString
public class Article {

    @Id  //대표값을 지정! Like a 주민등록번호
    @GeneratedValue //1, 2, 3, .... 자동 생성
    private Long id;

    @Column
    private String title;

    @Column
    private String contents;

/*    Article() {  //@NoArgsConstructor 로 대체!
    }*/

//리팩터링 ->@AllArgsConstructor
 /*   public Article(Long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }*/

    //@Tostring으로 리팩터링
/*    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }*/
}
