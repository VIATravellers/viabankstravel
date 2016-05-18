/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.City;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Daniel Mangowi
 */
public class Country {
    private String name;
    private String continent;
    private String officialLanguage;
    private String currency;
    private double population;
    private double size;
    private String capital;
    private ArrayList<City> city;

   

    public Country(String name, String continent, String officialLanguage, 
            String currency, double population, double size, String capital)
    {
        this.name = name;
        this.continent = continent;
        this.officialLanguage = officialLanguage;
        this.currency = currency;
        this.population = population;
        this.size = size;
        this.capital = capital;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

     public void setCity(ArrayList<City> city) {
        this.city = city;
    }

    public ArrayList<City> getCity() {
        return city;
    }
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (Double.doubleToLongBits(this.population) 
                != Double.doubleToLongBits(other.population)) {
            return false;
        }
        if (Double.doubleToLongBits(this.size) 
                != Double.doubleToLongBits(other.size)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.continent, other.continent)) {
            return false;
        }
        if (!Objects.equals(this.officialLanguage, other.officialLanguage)) {
            return false;
        }
        if (!Objects.equals(this.currency, other.currency)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ","
                + " continent=" + continent + ", "
                + "officialLanguage=" + officialLanguage + ", "
                + "currency=" + currency + ", "
                + "population=" + population + ","
                + " size=" + size + ","
                + " capital=" + capital + '}';
    }
   
    
    
}
