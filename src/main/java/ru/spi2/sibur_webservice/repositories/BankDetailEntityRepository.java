package ru.spi2.sibur_webservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spi2.sibur_webservice.entities.BankDetailEntity;

@Repository
public interface BankDetailEntityRepository extends CrudRepository<BankDetailEntity, Long> {

}
