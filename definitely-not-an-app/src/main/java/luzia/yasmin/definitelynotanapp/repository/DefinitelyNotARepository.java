package luzia.yasmin.definitelynotanapp.repository;

import luzia.yasmin.definitelynotanapp.model.DefinitelyNotAnEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yasmin L
 * @since 29/04/2020 - 20:50
 * @version 1.0
 */
@Repository
public interface DefinitelyNotARepository extends CrudRepository<DefinitelyNotAnEntity, Long> {

}