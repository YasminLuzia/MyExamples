package luzia.yasmin.definitelynotanapp.controller;

import luzia.yasmin.definitelynotanapp.model.DefinitelyNotAnEntity;
import luzia.yasmin.definitelynotanapp.repository.DefinitelyNotARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yasmin L
 * @since 29/04/2020 - 20:50
 * @version 1.0
 */
@RestController
@RequestMapping("/users")
public class DefinitelyNotAController {

    @Autowired
    private DefinitelyNotARepository definitelyNotARepository;

    /**
     * @return shows the user every existent id
     */
    @GetMapping
    public ResponseEntity<List<DefinitelyNotAnEntity>> findAll(){
        return new ResponseEntity<List<DefinitelyNotAnEntity>>(
                (List<DefinitelyNotAnEntity>) this.definitelyNotARepository.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param id selects the id_users
     * @return shows the user the id selected
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<DefinitelyNotAnEntity> findById(@PathVariable("id") long id) {
        if (this.definitelyNotARepository.findById(id).isPresent()) {
            return new ResponseEntity<DefinitelyNotAnEntity>(
                    this.definitelyNotARepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK
            );
        }
        return new ResponseEntity<DefinitelyNotAnEntity>(HttpStatus.NOT_FOUND);
    }

    /**
     * @param definitelyNotAnEntity asks for the user info
     * @return shows the user that the info have been registered
     */
    @PostMapping
    public ResponseEntity<DefinitelyNotAnEntity> store(@RequestBody DefinitelyNotAnEntity definitelyNotAnEntity) {
        return new ResponseEntity<DefinitelyNotAnEntity>(
                this.definitelyNotARepository.save(definitelyNotAnEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    /**
     * @param id selects the id of the user
     * @param definitelyNotAnEntity updates the information
     * @return shows the user that the info have been updated
     * @throws Exception
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<DefinitelyNotAnEntity> update(@PathVariable("id") long id, @RequestBody DefinitelyNotAnEntity definitelyNotAnEntity) throws Exception {

        if (id == 0 || !this.definitelyNotARepository.existsById(id)) {
            throw new Exception("This code doesn't exist or wasn't found!");
        }
        return new ResponseEntity<DefinitelyNotAnEntity>(
                this.definitelyNotARepository.save(definitelyNotAnEntity),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param id select the id of the user
     * @return shows the user that the user have been deleted
     */
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<DefinitelyNotAnEntity> delete(@PathVariable("id") long id) {
        this.definitelyNotARepository.deleteById(id);
        return new ResponseEntity<DefinitelyNotAnEntity>(
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

}