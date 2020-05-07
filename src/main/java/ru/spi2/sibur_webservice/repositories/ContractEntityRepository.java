package ru.spi2.sibur_webservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.spi2.sibur_webservice.entities.ContractEntity;

@Repository
public interface ContractEntityRepository extends CrudRepository<ContractEntity, Long> {
}
