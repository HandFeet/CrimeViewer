package co.uk.outlook.davidslambert.crimedata.repos.restimpl.converters;

import co.uk.outlook.davidslambert.crimedata.repos.restimpl.types.CrimeCategory;
import co.uk.outlook.davidslambert.crimedata.types.CrimeCategories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CrimeCategoryConverter {

    private CrimeCategoryConverter() {
        throw new AssertionError("Can't instantiate this");
    }

    public static CrimeCategories to(final List<CrimeCategory> categoryList) {
        if (categoryList == null) {
            return new CrimeCategories(new ArrayList<>());
        } else {
            return new CrimeCategories(categoryList.stream().map(CrimeCategory::getUrl).collect(Collectors.toList()));
        }
    }

}
