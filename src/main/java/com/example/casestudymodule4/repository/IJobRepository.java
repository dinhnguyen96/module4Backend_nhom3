package com.example.casestudymodule4.repository;

import com.example.casestudymodule4.model.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends JpaRepository<Job,Long>
{
    Page<Job> findAllByNameContaining(String name, Pageable pageable);

    @Query("select job from City city join city.job job where job.programingLanguage.id = :programmingLanguageId or job.qualification.name like concat('%', :qualificationName, '%') or city.name like concat('%',:cityName,'%') ")
    Page<Job> findJobsByQLOrLCOrPLanguage(@Param("programmingLanguageId") Long programmingLanguageId,
                                          @Param("qualificationName") String qualificationName,
                                          @Param("cityName") String cityName,Pageable pageable);

}
