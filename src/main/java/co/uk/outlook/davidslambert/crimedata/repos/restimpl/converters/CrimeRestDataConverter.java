package co.uk.outlook.davidslambert.crimedata.repos.restimpl.converters;

import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.CrimeRestData;
import co.uk.outlook.davidslambert.crimedata.types.CrimeData;
import co.uk.outlook.davidslambert.crimedata.types.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CrimeRestDataConverter {

    private CrimeRestDataConverter() {
        throw new AssertionError("Can't instantiate this");
    }

    public static List<CrimeData> to(final List<CrimeRestData> restData, final String postcode) {
        if (restData == null) {
            return new ArrayList<>();
        }

        return restData.stream().map(t -> new CrimeData.Builder()
                .outcome_status(t.getOutcome_status())
                .month(t.getMonth())
                .context(t.getContext())
                .location(createLocation(t, postcode))
                .category(t.getCategory())
                .build()).collect(Collectors.toList());
    }

    private static Location createLocation(final CrimeRestData data, final String postcode) {
        return new Location.Builder()
                .latitude(data.getLocation().getLatitude())
                .longitude(data.getLocation().getLongitude())
                .postcode(postcode) //should come off a reverse lookup from the lat and long
                .build();
    }

}
