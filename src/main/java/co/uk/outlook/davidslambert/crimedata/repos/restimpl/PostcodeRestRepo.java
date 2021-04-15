package co.uk.outlook.davidslambert.crimedata.repos.restimpl;

import co.uk.outlook.davidslambert.crimedata.repos.PostcodeRepo;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.converters.PostcodeConverter;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.tools.RestReader;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.Postcode;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.PostcodeValidation;
import co.uk.outlook.davidslambert.crimedata.types.Location;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpStatusCodeException;

@Repository
public class PostcodeRestRepo implements PostcodeRepo {

    @Override
    public boolean isValidPostcode(final String postcode) {
        final PostcodeValidation response =
                new RestReader<PostcodeValidation>().fetchGetResults(
                        "https://api.postcodes.io/postcodes/" + postcode + "/validate",
                        new ParameterizedTypeReference<>() {});
        return response.getResult();
    }

    @Override
    public Location getLocation(final String postcode) {
        final Postcode response =
                new RestReader<Postcode>().fetchGetResults(
                        "https://api.postcodes.io/postcodes/" + postcode,
                        new ParameterizedTypeReference<>() {});
        if (response != null && response.getStatus() == 200) {
            return PostcodeConverter.to(response);
        } else {
            return new Location();
        }
    }

}
