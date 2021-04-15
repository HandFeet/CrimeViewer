package co.uk.outlook.davidslambert.crimedata.webservices;

import co.uk.outlook.davidslambert.crimedata.types.CrimeCategories;
import co.uk.outlook.davidslambert.crimedata.domain.CrimeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrimeCategoriesController {

    @Autowired
    private CrimeCategoryService crimeCategoryService;

    @GetMapping("/crime/categories")
    public ResponseEntity<?> create() {
        final CrimeCategories crimes = crimeCategoryService.getCrimeCategories();
        if(!crimes.getCategories().isEmpty()) {
            return new ResponseEntity<>(crimes, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND);
        }
    }

}
