package net.therap.AnnotationAndReflection.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author anwar
 * @since 3/12/18
 */
public class Details implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String houseNo;

    private List<String> routes;

    public Details() {
        this.routes = new ArrayList<>();
    }

    public Details(int id, String houseNo, List<String> routes) {
        this.id = id;
        this.houseNo = houseNo;
        this.routes = routes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public List<String> getRoutes() {
        return routes;
    }

    public void setRoutes(List<String> routes) {
        this.routes = routes;
    }
}