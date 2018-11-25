package com.team7.Models;




/**
 * @author NikolaosPapazian
 * @version 1.0
 * Owner
 * mast have ID,Name
 */
public class Owner implements Comparable {
    private String ownerID;
    private String ownerName;


    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    @Override
    public String toString(){
        return "["+"Owner_ID:"+ownerID+"]";
    }

    @Override
    public int compareTo(Object o) {
        if(toString().equals(o.toString())){
            return 1;
        }
        return 0;
    }
}
