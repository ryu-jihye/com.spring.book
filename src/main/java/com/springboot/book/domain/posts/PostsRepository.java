package com.springboot.book.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}

//Repository : DB layer 접근자
//JpaRepository<Posts, Long> 상속 시 기본적인 CRUD 메소드가 자동 생성됨
//@Repository 추가 안 해도 됨
//Entity와 Ropository는 세트로 생각
