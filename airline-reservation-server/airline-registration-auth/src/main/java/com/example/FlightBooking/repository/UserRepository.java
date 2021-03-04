package com.example.FlightBooking.repository;

import com.example.FlightBooking.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
