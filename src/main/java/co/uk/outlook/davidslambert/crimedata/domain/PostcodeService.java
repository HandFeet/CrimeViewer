package co.uk.outlook.davidslambert.crimedata.domain;

import co.uk.outlook.davidslambert.crimedata.repos.PostcodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class PostcodeService {

    @Autowired
    private PostcodeRepo postcodeRepo;

    public boolean isValidPostcode(final String postcode) {
        if (ObjectUtils.isEmpty(postcode)) {
            return false;
        }
        return postcodeRepo.isValidPostcode(postcode);
    }

}
