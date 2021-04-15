package co.uk.outlook.davidslambert.crimedata.repos.restimpl.types;

public class CrimeCategory {

    private String url;
    private String name;

    public CrimeCategory(final String url, final String name) {
        this.url = url;
        this.name = name;
    }

    public CrimeCategory() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}