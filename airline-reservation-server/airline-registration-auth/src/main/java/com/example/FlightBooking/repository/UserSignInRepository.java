package com.example.FlightBooking.repository;

import com.example.FlightBooking.entity.UserSignIn;
import org.springframework.data.repository.CrudRepository;

public interface UserSignInRepository extends CrudRepository<UserSignIn,String> {
}
