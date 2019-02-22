package com.owen.springtesting.car;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CarJPARepo extends JpaRepository<Car, Integer> {
}
