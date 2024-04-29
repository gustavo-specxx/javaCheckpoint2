package com.chechpoint2JAVA.java2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends CrudRepository<Brinquedo, Long> {
}