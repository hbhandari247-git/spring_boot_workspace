package net.javaguides.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.spring.boot.entity.AddressEntity;

public interface AddressDAO extends JpaRepository<AddressEntity, Integer> {

}