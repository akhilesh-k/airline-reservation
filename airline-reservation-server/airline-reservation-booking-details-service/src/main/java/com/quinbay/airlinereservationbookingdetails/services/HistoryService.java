package com.quinbay.airlinereservationbookingdetails.services;

import com.quinbay.airlinereservationbookingdetails.dto.UserHistoryRequest;
import com.quinbay.airlinereservationbookingdetails.dto.UserHistoryResponse;

import java.util.List;

public interface HistoryService{
    UserHistoryResponse createHistory(UserHistoryRequest userHistoryRequest);
    List<UserHistoryResponse> DisplayUserHistory(String email);
}
