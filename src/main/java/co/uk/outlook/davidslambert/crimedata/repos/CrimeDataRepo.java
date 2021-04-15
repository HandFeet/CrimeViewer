package co.uk.outlook.davidslambert.crimedata.repos;

import co.uk.outlook.davidslambert.crimedata.types.CrimeData;

import java.util.Date;
import java.util.List;

public interface CrimeDataRepo {

    public List<CrimeData> getCrimeData(String postcode, Date date);

}
