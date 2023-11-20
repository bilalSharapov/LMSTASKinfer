public class EducationCenter {
    private  String name;
    private String locatedCountry;
    private int LocalDate;
    private int foundationYear;



    public EducationCenter(String name, String locatedCountry, int localDate, int foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        LocalDate = localDate;
        this.foundationYear = foundationYear;
    }

    public EducationCenter() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public int getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(int localDate) {
        LocalDate = localDate;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", LocalDate=" + LocalDate +
                ", foundationYear='" + foundationYear + '\'' +
                '}';
    }
}

