package co.uk.outlook.davidslambert.crimedata.domain;

import co.uk.outlook.davidslambert.crimedata.repos.CrimeCategoryRepo;
import co.uk.outlook.davidslambert.crimedata.types.CrimeCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrimeCategoryService {

    @Autowired
    private CrimeCategoryRepo repo;

    public CrimeCategories getCrimeCategories() {
        return repo.getCrimeCategories();
    }

}
