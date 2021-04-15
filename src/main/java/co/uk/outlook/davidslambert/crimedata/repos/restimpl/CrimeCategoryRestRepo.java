package co.uk.outlook.davidslambert.crimedata.repos.restimpl;

import co.uk.outlook.davidslambert.crimedata.repos.CrimeCategoryRepo;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.converters.CrimeCategoryConverter;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.tools.RestReader;
import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.CrimeCategory;
import co.uk.outlook.davidslambert.crimedata.types.CrimeCategories;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CrimeCategoryRestRepo implements CrimeCategoryRepo {

    public CrimeCategories getCrimeCategories() {
        return CrimeCategoryConverter.to(fetchGetResults());
    }

    List<CrimeCategory> fetchGetResults() {
        return new RestReader<List<CrimeCategory>>().fetchGetResults(
                "https://data.police.uk/api/crime-categories",  new ParameterizedTypeReference<>() {});
    }

}
