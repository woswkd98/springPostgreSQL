package com.project.backend.repositories;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Mono;
public interface ReactiveRepositoryBase<T> extends ReactiveCrudRepository<T,Long> { 
    
    @Query("select UUID()")
    public Mono<String> genUuid();
}