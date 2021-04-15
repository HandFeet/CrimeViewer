package co.uk.outlook.davidslambert.crimedata.repos;

import co.uk.outlook.davidslambert.crimedata.types.Location;

public interface PostcodeRepo {

    boolean isValidPostcode(String postcode);

    Location getLocation(String postcode);

}
