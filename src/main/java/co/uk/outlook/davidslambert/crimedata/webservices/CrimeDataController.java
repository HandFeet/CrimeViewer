package co.uk.outlook.davidslambert.crimedata.webservices;

import co.uk.outlook.davidslambert.crimedata.domain.CrimeDataService;
import co.uk.outlook.davidslambert.crimedata.domain.PostcodeService;
import co.uk.outlook.davidslambert.crimedata.types.CrimeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class CrimeDataController {

    @Autowired
    private PostcodeService postcodeService;

    @Autowired
    private CrimeDataService crimeDataService;

    @GetMapping("/crimes")
    public ResponseEntity<?> create(
            @RequestParam(name="postcode", required = false) final String postcode,
            @RequestParam(name="date") @DateTimeFormat(pattern="yyyy-MM") final Date date) {
        if (!postcodeService.isValidPostcode(postcode)) {
            return new ResponseEntity<>("Postcode does not exist", HttpStatus.BAD_REQUEST);
        }
        final List<CrimeData> crimes = crimeDataService.getCrimeData(postcode, date);
        if (crimes == null || crimes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(crimes, HttpStatus.OK);
    }

}
