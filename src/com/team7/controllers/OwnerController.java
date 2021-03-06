package com.team7.controllers;



import com.team7.dataSave.SingletonDataSave;
import com.team7.models.Owner;

import java.util.ArrayList;
import java.util.List;


/**
 * @author NikolaosPapazian
 * @version 1.0
 */
public class OwnerController  {

    private SingletonDataSave singletonClass;


    /**
     * Constructor
     * @version 1.0
     */
    public OwnerController() {
        singletonClass = SingletonDataSave.getInstance();
    }

    /**
     * Constructor
     * @version 1.0
     * @param ownerList
     */
    public OwnerController(ArrayList<Owner> ownerList) {
        singletonClass = SingletonDataSave.getInstance();
        if(ownerList != null) {
            singletonClass.setSingletonOwner(ownerList);
        }else{
            Owner owner2 = new Owner();
            ArrayList<Owner> ownerList2 = new ArrayList<>();
            owner2.setOwnerID("");
            owner2.setOwnerName("");
            ownerList2.add(owner2);
            singletonClass.setSingletonOwner(ownerList2);
        }
    }

    /**
     * @version 1.0
     * @return ArrayList<Owner>
     */
    public List<Owner> getOwnerList() {
        return singletonClass.getSingletonOwner();
    }

    /**
     * @version 1.0
     * @param ownerID
     * @return Owner | null
     */
    public Owner getOwner(String ownerID){
        for (Owner owner:singletonClass.getSingletonOwner()) {
            if(ownerID.equals(owner.getOwnerID())){
                return owner;
            }
        }
        return null;
    }

    /**
     * set ArrayList of Owners
     * @version 1.0
     * @param ownerList
     */
    public void setOwnerList(ArrayList<Owner> ownerList) {
        singletonClass = SingletonDataSave.getInstance();
        if(ownerList != null) {
            singletonClass.setSingletonOwner(ownerList);
        }else{
            Owner owner2 = new Owner();
            ArrayList<Owner> ownerList2 = new ArrayList<>();
            owner2.setOwnerID("");
            owner2.setOwnerName("");
            ownerList2.add(owner2);
            singletonClass.setSingletonOwner(ownerList2);
        }
    }

    /**
     * add new value to ownerList
     * @version 1.0
     * @param owner
     */
    public void setOwner(Owner owner) {
        singletonClass.setSingletonOneOwner(owner);
    }
}
