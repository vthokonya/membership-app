package zw.co.tayanasoft.services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import zw.co.tayanasoft.data.Member;
import zw.co.tayanasoft.data.MemberRepository;

@Service
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Optional<Member> get(Long id) {
        return repository.findById(id);
    }

    public Member update(Member entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Member> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Member> list(Pageable pageable, Specification<Member> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
