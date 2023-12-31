
package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "api/ec3/instrumentos")
public interface InstrumentosRepository extends PagingAndSortingRepository<Instrumentos, Integer>, CrudRepository<Instrumentos, Integer> {
    
    List<Instrumentos> findByNombre(@Param("nombre") String nombre);

}