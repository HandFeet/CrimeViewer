package co.uk.outlook.davidslambert.crimedata.repos.dummyimpl;

import co.uk.outlook.davidslambert.crimedata.repos.CrimeDataRepo;
import co.uk.outlook.davidslambert.crimedata.repos.PostcodeRepo;
import co.uk.outlook.davidslambert.crimedata.types.CrimeData;
import co.uk.outlook.davidslambert.crimedata.types.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
@Qualifier("crimeDataDummyRepo")
public class CrimeDataDummyRepo implements CrimeDataRepo {

    @Autowired
    private PostcodeRepo postcodeRepo;

    @Override
    public List<CrimeData> getCrimeData(final String postcode, final Date date) {
        final Location location = postcodeRepo.getLocation(postcode);

        return Arrays.asList(new CrimeData.Builder()
                .category("Category")
                .context("Context")
                .location(postcodeRepo.getLocation(postcode))
                .month("month")
                .outcome_status("outcome")
                .build());
    }

}
