package co.uk.outlook.davidslambert.crimedata.types;

import org.springframework.util.ObjectUtils;

public class CrimeData {

    private final String category;
    private final Location location;
    private final String context;
    private final String outcome_status;
    private final String month;

    private CrimeData(final Builder builder) {
        category = builder.category;
        context = builder.context;
        outcome_status = builder.outcome_status;
        month = builder.month;
        location = builder.location;
    }

    public String getCategory() {
        if (ObjectUtils.isEmpty(this.category)) {
            return "";
        }
        return this.category;
    }

    public Location getLocation() {
        if (location == null) {
            return new Location();
        }
        return this.location;
    }

    public String getContext() {
        if (ObjectUtils.isEmpty(this.context)) {
            return "";
        }
        return this.context;
    }

    public String getOutcome_status() {
        if (ObjectUtils.isEmpty(this.outcome_status)) {
            return "";
        }
        return this.outcome_status;
    }

    public String getMonth() {
        if (ObjectUtils.isEmpty(this.month)) {
            return "";
        }
        return this.month;
    }

    public static final class Builder {
        private String category;
        private Location location;
        private String context;
        private String outcome_status;
        private String month;

        public Builder category(final String category) {
            this.category = category;
            return this;
        }

        public Builder location(final Location location) {
            this.location = location;
            return this;
        }

        public Builder context(final String context) {
            this.context = context;
            return this;
        }

        public Builder outcome_status(final String outcome_status) {
            this.outcome_status = outcome_status;
            return this;
        }

        public Builder month(final String month) {
            this.month = month;
            return this;
        }

        public CrimeData build() {
            return new CrimeData(this);
        }
    }

}
