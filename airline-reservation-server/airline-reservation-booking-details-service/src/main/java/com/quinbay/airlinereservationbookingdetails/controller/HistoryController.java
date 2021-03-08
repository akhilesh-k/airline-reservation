package com.quinbay.airlinereservationbookingdetails.controller;

import com.quinbay.airlinereservationbookingdetails.dto.UserHistoryRequest;
import com.quinbay.airlinereservationbookingdetails.dto.UserHistoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.quinbay.airlinereservationbookingdetails.services.HistoryService;

import java.util.List;

@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    private HistoryService historyService;
    @PostMapping
    public UserHistoryResponse createHistory(@RequestBody UserHistoryRequest userHistoryRequest)
    {
        return historyService.createHistory(userHistoryRequest);
    }
    @GetMapping("/getHistory/{email}")
    public List<UserHistoryResponse> DisplayHistory(@PathVariable String email)
    {
        return historyService.DisplayUserHistory(email);
    }
}
