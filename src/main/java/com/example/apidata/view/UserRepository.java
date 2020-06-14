package com.example.apidata.view;

import com.example.apidata.model.UserModel;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
