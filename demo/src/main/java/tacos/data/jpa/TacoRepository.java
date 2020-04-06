package tacos.data.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tacos.model.Taco;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {

}
