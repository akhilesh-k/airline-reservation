package com.example.FlightBooking.service.impl;

import com.example.FlightBooking.dto.UserRequestDTO;
import com.example.FlightBooking.dto.UserResponseDTO;
import com.example.FlightBooking.entity.User;
import com.example.FlightBooking.repository.UserRepository;
import com.example.FlightBooking.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user=new User();
        BeanUtils.copyProperties(userRequestDTO,user);
        User saveUser=userRepository.save(user);
        UserResponseDTO userResponseDTO=new UserResponseDTO();
        BeanUtils.copyProperties(saveUser,userResponseDTO);
        return userResponseDTO;
    }
}
