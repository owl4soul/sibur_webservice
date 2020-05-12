package ru.spi2.sibur_webservice.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.spi2.sibur_webservice.entities.RequestDataInfo;

public interface RequestDataRepository extends CrudRepository<RequestDataInfo, Long> {

}
