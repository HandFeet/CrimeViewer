package co.uk.outlook.davidslambert.crimedata.repos.restimpl;

import co.uk.outlook.davidslambert.crimedata.repos.CrimeDataRepo;
import co.uk.outlook.davidslambert.crimedata.repos.PostcodeRepo;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.converters.CrimeRestDataConverter;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.tools.RestReader;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.CrimeRestData;
import co.uk.outlook.davidslambert.crimedata.types.CrimeData;
import co.uk.outlook.davidslambert.crimedata.types.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
@Qualifier("crimeDataRestRepo")
public class CrimeDataRestRepo implements CrimeDataRepo {

    @Autowired
    private PostcodeRepo postcodeRepo;

    @Override
    public List<CrimeData> getCrimeData(final String postcode, final Date date) {
        final Location location = postcodeRepo.getLocation(postcode);
        final DateFormat df = new SimpleDateFormat("yyyy-MM");

        final List<CrimeRestData> crimeRestData = new RestReader<List<CrimeRestData>>().fetchGetResults(
                "https://data.police.uk/api/crimes-street/all-crime?lat="
                        +location.getLatitude()+"&lng="
                        +location.getLongitude()
                        +"&date=" + df.format(date),
                new ParameterizedTypeReference<>() {});
        return CrimeRestDataConverter.to(crimeRestData, postcode);
    }

}
