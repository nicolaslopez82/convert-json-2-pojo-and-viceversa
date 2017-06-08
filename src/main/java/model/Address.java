package model;

import java.util.Set;

/**
 * Created by NicolasLopez on 06/06/2017.
 */

public class Address {

    long id;
    String buildingName;
    String town;
    String postCode;
    Set<Person> persons;

    public Address() {

    }

    public Address(String buildingName, String town, String postCode) {
        this.buildingName = buildingName;
        this.town = town;
        this.postCode = postCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
