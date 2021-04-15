package co.uk.outlook.davidslambert.crimedata.repos.restimpl.converters;

import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.Postcode;
import co.uk.outlook.davidslambert.crimedata.types.Location;

public class PostcodeConverter {

    private PostcodeConverter() {
        throw new AssertionError("Can't instantiate this");
    }

    public static Location to(final Postcode postcode) {
        return new Location
                .Builder()
                .latitude(postcode.getResult().getLatitude())
                .longitude(postcode.getResult().getLongitude())
                .postcode(postcode.getResult().getPostcode())
                .build();
    }

}
