package aleks.aleks.repositories;

import aleks.aleks.orm.Result;
import aleks.aleks.orm.ResultActual;
import aleks.aleks.orm.ResultRs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository @Component
public interface ResultRsRepository extends JpaRepository<ResultRs, Long> {



}
