package com.example.airlineregistrationsearch.repository;



import com.example.airlineregistrationsearch.entity.AddFlight;
import com.example.airlineregistrationsearch.entity.CompositeKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddFlightRepository extends CrudRepository<AddFlight, CompositeKey> {
}
