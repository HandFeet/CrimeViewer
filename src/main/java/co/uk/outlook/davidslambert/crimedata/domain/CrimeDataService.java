package co.uk.outlook.davidslambert.crimedata.domain;

import co.uk.outlook.davidslambert.crimedata.repos.CrimeDataRepo;
import co.uk.outlook.davidslambert.crimedata.types.CrimeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class CrimeDataService {

    @Autowired
    private CrimeDataRepo crimeDataDummyRepo;

    public List<CrimeData> getCrimeData(final String postcode, final Date date) {
        return crimeDataDummyRepo.getCrimeData(postcode, date);
    }

}
