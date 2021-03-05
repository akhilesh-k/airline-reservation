package com.quinbay.airlinereservationbookingdetails.services.impl;

import com.quinbay.airlinereservationbookingdetails.dto.UserHistoryRequest;
import com.quinbay.airlinereservationbookingdetails.dto.UserHistoryResponse;
import com.quinbay.airlinereservationbookingdetails.entity.UserHistory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quinbay.airlinereservationbookingdetails.repository.HistoryRepository;
import com.quinbay.airlinereservationbookingdetails.services.HistoryService;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistorySeviceImpl implements HistoryService {
    @Autowired
    private HistoryRepository historyRepository;
    public UserHistoryResponse createHistory(UserHistoryRequest userHistoryRequest)
    {
        UserHistory userHistory = new UserHistory();
        BeanUtils.copyProperties(userHistoryRequest,userHistory);
        UserHistoryResponse userHistoryResponse=new UserHistoryResponse();
        historyRepository.save(userHistory);
        BeanUtils.copyProperties(userHistory,userHistoryResponse);
        return  userHistoryResponse;
    }
    public List<UserHistoryResponse> DisplayUserHistory(String email)
    {
        List<UserHistory> list= historyRepository.findUserHistoryByEmail(email);
        List<UserHistoryResponse> userHistoryResponseList=new ArrayList<UserHistoryResponse>();
        for(UserHistory u:list)
        {
            UserHistoryResponse userHistoryResponse=new UserHistoryResponse();
            BeanUtils.copyProperties(u,userHistoryResponse);
            userHistoryResponseList.add(userHistoryResponse);
        }
        return userHistoryResponseList;
    }

}
