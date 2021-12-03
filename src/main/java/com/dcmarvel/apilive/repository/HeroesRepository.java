package com.dcmarvel.apilive.repository;

import com.dcmarvel.apilive.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes,String> {
}
