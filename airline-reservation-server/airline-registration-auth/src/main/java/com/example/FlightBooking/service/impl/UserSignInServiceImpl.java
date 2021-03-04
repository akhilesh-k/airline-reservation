package com.example.FlightBooking.service.impl;

import com.example.FlightBooking.dto.UserSignInRequestDTO;
import com.example.FlightBooking.dto.UserSignInResponseDTO;
import com.example.FlightBooking.entity.User;
import com.example.FlightBooking.entity.UserSignIn;
import com.example.FlightBooking.repository.UserRepository;
import com.example.FlightBooking.repository.UserSignInRepository;
import com.example.FlightBooking.service.UserSignInService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSignInServiceImpl implements UserSignInService {
    @Autowired
    private UserSignInRepository userSignInRepository;
    @Autowired
    private UserRepository userRepository;
    public boolean validate(UserSignInRequestDTO userSignInRequestDTO)
    {
        User name = userRepository.findById(userSignInRequestDTO.getUserName()).get();
        if(name.getUserName() == ""){
            return false;
        } else {
            if(name.getPassword() != userSignInRequestDTO.getPassword()){
                return false;
            }
        }
        return true;
    }
}
