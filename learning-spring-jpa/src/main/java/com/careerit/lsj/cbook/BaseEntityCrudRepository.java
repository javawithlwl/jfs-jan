package com.careerit.lsj.cbook;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseEntityCrudRepository<T extends  BaseEntity,ID> extends CrudRepository<T,ID>, PagingAndSortingRepository<T,ID> {

    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.deleted = false")
    List<T> findAll();

    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id in :ids and e.deleted = false")
    List<T> findAllById(@Param("ids") Iterable<ID> ids);

    @Transactional(readOnly = true)
    @Override
    @Query("select e from #{#entityName} e where e.id = :id and e.deleted = false")
    Optional<T> findById(@Param("id") ID id);

    @Override
    @Transactional(readOnly = true)
    @Query("select count(e) from #{#entityName} e where e.deleted = false")
    long count();

    @Transactional
    default void softDeleteById(ID id){
        findById(id).ifPresent(e -> {
            e.setDeleted(true);
            save(e);
        });
    }

    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.deleted = false")
    Iterable<T> findAll(Sort sort);
    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.deleted = false")
    Page<T> findAll(Pageable pageable);

}
