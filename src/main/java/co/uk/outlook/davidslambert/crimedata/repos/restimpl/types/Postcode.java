package co.uk.outlook.davidslambert.crimedata.repos.restimpl.types;

public class Postcode {

    private int status;
    private PostcodeInfo result;

    public int getStatus() {
        return status;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public PostcodeInfo getResult() {
        return result;
    }

    public void setResult(final PostcodeInfo result) {
        this.result = result;
    }

    public class PostcodeInfo {

        private String postcode;
        private int quality;
        private int eastings;
        private int northings;
        private String country;
        private String nhs_ha;
        private double longitude;
        private double latitude;
        private String european_electoral_region;
        private String primary_care_trust;
        private String region;
        private String lsoa;
        private String msoa;
        private String incode;
        private String outcode;
        private String parliamentary_constituency;
        private String admin_district;
        private String parish;
        private Object admin_county;
        private String admin_ward;
        private Object ced;
        private String ccg;
        private String nuts;
        private PostcodeCodes codes;

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(final String postcode) {
            this.postcode = postcode;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(final int quality) {
            this.quality = quality;
        }

        public int getEastings() {
            return eastings;
        }

        public void setEastings(final int eastings) {
            this.eastings = eastings;
        }

        public int getNorthings() {
            return northings;
        }

        public void setNorthings(final int northings) {
            this.northings = northings;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(final String country) {
            this.country = country;
        }

        public String getNhs_ha() {
            return nhs_ha;
        }

        public void setNhs_ha(final String nhs_ha) {
            this.nhs_ha = nhs_ha;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(final double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(final double latitude) {
            this.latitude = latitude;
        }

        public String getEuropean_electoral_region() {
            return european_electoral_region;
        }

        public void setEuropean_electoral_region(final String european_electoral_region) {
            this.european_electoral_region = european_electoral_region;
        }

        public String getPrimary_care_trust() {
            return primary_care_trust;
        }

        public void setPrimary_care_trust(final String primary_care_trust) {
            this.primary_care_trust = primary_care_trust;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(final String region) {
            this.region = region;
        }

        public String getLsoa() {
            return lsoa;
        }

        public void setLsoa(final String lsoa) {
            this.lsoa = lsoa;
        }

        public String getMsoa() {
            return msoa;
        }

        public void setMsoa(final String msoa) {
            this.msoa = msoa;
        }

        public String getIncode() {
            return incode;
        }

        public void setIncode(final String incode) {
            this.incode = incode;
        }

        public String getOutcode() {
            return outcode;
        }

        public void setOutcode(final String outcode) {
            this.outcode = outcode;
        }

        public String getParliamentary_constituency() {
            return parliamentary_constituency;
        }

        public void setParliamentary_constituency(final String parliamentary_constituency) {
            this.parliamentary_constituency = parliamentary_constituency;
        }

        public String getAdmin_district() {
            return admin_district;
        }

        public void setAdmin_district(final String admin_district) {
            this.admin_district = admin_district;
        }

        public String getParish() {
            return parish;
        }

        public void setParish(final String parish) {
            this.parish = parish;
        }

        public Object getAdmin_county() {
            return admin_county;
        }

        public void setAdmin_county(final Object admin_county) {
            this.admin_county = admin_county;
        }

        public String getAdmin_ward() {
            return admin_ward;
        }

        public void setAdmin_ward(final String admin_ward) {
            this.admin_ward = admin_ward;
        }

        public Object getCed() {
            return ced;
        }

        public void setCed(final Object ced) {
            this.ced = ced;
        }

        public String getCcg() {
            return ccg;
        }

        public void setCcg(final String ccg) {
            this.ccg = ccg;
        }

        public String getNuts() {
            return nuts;
        }

        public void setNuts(final String nuts) {
            this.nuts = nuts;
        }

        public PostcodeCodes getCodes() {
            return codes;
        }

        public void setCodes(final PostcodeCodes codes) {
            this.codes = codes;
        }

        public class PostcodeCodes {

            private String admin_district;
            private String admin_county;
            private String admin_ward;
            private String parish;
            private String parliamentary_constituency;
            private String ccg;
            private String ccg_id;
            private String ced;
            private String nuts;
            private String lsoa;
            private String msoa;
            private String lau2;

            public String getAdmin_district() {
                return admin_district;
            }

            public void setAdmin_district(final String admin_district) {
                this.admin_district = admin_district;
            }

            public String getAdmin_county() {
                return admin_county;
            }

            public void setAdmin_county(final String admin_county) {
                this.admin_county = admin_county;
            }

            public String getAdmin_ward() {
                return admin_ward;
            }

            public void setAdmin_ward(final String admin_ward) {
                this.admin_ward = admin_ward;
            }

            public String getParish() {
                return parish;
            }

            public void setParish(final String parish) {
                this.parish = parish;
            }

            public String getParliamentary_constituency() {
                return parliamentary_constituency;
            }

            public void setParliamentary_constituency(final String parliamentary_constituency) {
                this.parliamentary_constituency = parliamentary_constituency;
            }

            public String getCcg() {
                return ccg;
            }

            public void setCcg(final String ccg) {
                this.ccg = ccg;
            }

            public String getCcg_id() {
                return ccg_id;
            }

            public void setCcg_id(final String ccg_id) {
                this.ccg_id = ccg_id;
            }

            public String getCed() {
                return ced;
            }

            public void setCed(final String ced) {
                this.ced = ced;
            }

            public String getNuts() {
                return nuts;
            }

            public void setNuts(final String nuts) {
                this.nuts = nuts;
            }

            public String getLsoa() {
                return lsoa;
            }

            public void setLsoa(final String lsoa) {
                this.lsoa = lsoa;
            }

            public String getMsoa() {
                return msoa;
            }

            public void setMsoa(final String msoa) {
                this.msoa = msoa;
            }

            public String getLau2() {
                return lau2;
            }

            public void setLau2(final String lau2) {
                this.lau2 = lau2;
            }
        }

    }

}
