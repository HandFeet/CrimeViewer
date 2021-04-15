package co.uk.outlook.davidslambert.crimedata.types;

import java.util.ArrayList;
import java.util.List;

public class CrimeCategories {

    private List<String> categories;

    public CrimeCategories(final List<String> categories) {
        this.categories = categories;
    }

    public List<String> getCategories() {
        if (categories == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(categories);
    }
}