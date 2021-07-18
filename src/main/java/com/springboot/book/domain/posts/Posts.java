package com.springboot.book.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //setter 없음(무분별하게 사용 시 목적과 의도 파악 불가)
@NoArgsConstructor //기본 생성자 자동 추가(public Posts())
@Entity //테이블과 링크될 클래스
public class Posts extends BaseTimeEntity {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성 규칙(auto_increment 가능)
    private Long id;

    @Column(length = 500, nullable = false) //추가적인 변경 사항이 있을 경우 @Column 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //생섵자 상단에 선언 시 생성자에 포함된 빌더만 포함, setter 대신 DB 삽입 시 이용
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
