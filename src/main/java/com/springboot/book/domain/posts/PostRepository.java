package com.springboot.book.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
}

//Repository : DB layer 접근자 
//JpaRepository<Posts, Long> 상속 시 기본적인 CRUD 메소드가 자동 생성됨
//@Repository 추가 안 해도 됨
//Entity와 Ropository는 세트로 생각
