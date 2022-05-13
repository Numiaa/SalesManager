package ru.ivanov.salesmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.ivanov.salesmarket.model.Image;

@Transactional
public interface ImageRepository extends JpaRepository<Image, Long> {

}
