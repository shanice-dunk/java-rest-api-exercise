package com.cbfacademy.restapiexercise.IOU;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

public interface IOURepository extends ListCrudRepository<IOU, UUID> {

}
