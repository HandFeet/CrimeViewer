package co.uk.outlook.davidslambert.crimedata.types;

import org.springframework.util.ObjectUtils;

public class Location {

    private double latitude;
    private double longitude;
    private String postcode;

    public Location(final Builder builder) {
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.postcode = builder.postcode;
    }

    public Location() {

    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getPostcode() {
        if (ObjectUtils.isEmpty(this.postcode)) {
            return "";
        }
        return this.postcode;
    }

    public static final class Builder {

        private double latitude;
        private double longitude;
        private String postcode;

        public Builder latitude(final double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder longitude(final double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder postcode(final String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Location build() {
            return new Location(this);
        }

    }

}
