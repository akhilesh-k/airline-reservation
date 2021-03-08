package com.quinbay.airlinereservationbookingdetails.repository;

import com.quinbay.airlinereservationbookingdetails.entity.UserHistory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoryRepository extends CrudRepository<UserHistory,Integer> {
    List<UserHistory> findUserHistoryByEmail(String email);
}
