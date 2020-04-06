package tacos.data.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tacos.model.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
