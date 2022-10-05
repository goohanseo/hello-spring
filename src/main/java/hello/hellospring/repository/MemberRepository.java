package hello.hellospring.repository;
import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //null을 처리하기 위해 optional로 감싸면서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
