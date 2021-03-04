package com.example.FlightBooking.service.impl;

import com.example.FlightBooking.dto.UserSignInRequestDTO;
import com.example.FlightBooking.dto.UserSignInResponseDTO;
import com.example.FlightBooking.dto.UserSigningValidationResponseDTO;
import com.example.FlightBooking.dto.Validation;
import com.example.FlightBooking.entity.User;
import com.example.FlightBooking.entity.UserSignIn;
import com.example.FlightBooking.repository.UserRepository;
import com.example.FlightBooking.repository.UserSignInRepository;
import com.example.FlightBooking.service.UserSignInService;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSignInServiceImpl implements UserSignInService {
    @Autowired
    private UserSignInRepository userSignInRepository;
    @Autowired
    private UserRepository userRepository;

    public UserSigningValidationResponseDTO validate(UserSignInRequestDTO userSignInRequestDTO) {
        Optional<User> user = userRepository.findById(userSignInRequestDTO.getUserName());
        Validation validation = Validation.WRONG_PASSWORD;
        if (!user.isPresent()) {
            validation = Validation.USER_NOT_PRESENT;
        }
        else if (user.get().getUserName().equals(userSignInRequestDTO.getUserName())) {
            // TODO: hash the password and equate
            if (user.get().getPassword().equals(userSignInRequestDTO.getPassword())) {
                validation = Validation.SUCCESS;
            } else {
                validation = Validation.WRONG_PASSWORD;
            }
        }
        else {
            validation=Validation.WRONG_USERNAME;
        }
        UserSigningValidationResponseDTO responseDTO = new UserSigningValidationResponseDTO();
        responseDTO.setCode(validation);
        responseDTO.setMessage(validation.getMessage());
        return responseDTO;
    }

}
