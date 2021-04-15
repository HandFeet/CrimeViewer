package co.uk.outlook.davidslambert.crimedata.repos.restimpl.types;

public class CrimeRestData {

    private String category;
    private String location_type;
    private Location location;
    private String context;
    private String outcome_status;
    private String persistent_id;
    private int id;
    private String location_subtype;
    private String month;

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(final String location_type) {
        this.location_type = location_type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    public String getContext() {
        return context;
    }

    public void setContext(final String context) {
        this.context = context;
    }

    public String getOutcome_status() {
        return outcome_status;
    }

    public void setOutcome_status(final String outcome_status) {
        this.outcome_status = outcome_status;
    }

    public String getPersistent_id() {
        return persistent_id;
    }

    public void setPersistent_id(final String persistent_id) {
        this.persistent_id = persistent_id;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getLocation_subtype() {
        return location_subtype;
    }

    public void setLocation_subtype(final String location_subtype) {
        this.location_subtype = location_subtype;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(final String month) {
        this.month = month;
    }

    public class Location{
        private double latitude;
        private Street street;
        private double longitude;

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(final double latitude) {
            this.latitude = latitude;
        }

        public Street getStreet() {
            return street;
        }

        public void setStreet(final Street street) {
            this.street = street;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(final double longitude) {
            this.longitude = longitude;
        }

        public class Street{
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(final int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(final String name) {
                this.name = name;
            }
        }

    }

}
