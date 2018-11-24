
package com.team7.Controllers;


import com.team7.Models.Insurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * @author NikolaosPapazian
 * @version 1.0
 *
 */
public class InsuranceController {
    private List<Insurance> insuranceList;

    /**
     * Constructor
     * @version 1.0
     * @since 22/11/18
     * @param insuranceList
     */
    public InsuranceController(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }


    /**
     * @version 1.0
     * @since 22/11/18
     * @return ArrayList<Insurance>
     */
    public List<Insurance> getInsuranceList() {
        return insuranceList;
    }

    /**
     * set New ArrayList of Insurance
     * @version 1.0
     * @since 22/11/18
     * @param insuranceList
     */
    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    /**
     * @version 1.0
     * @since 22/11/18
     * @param insID
     * @return Insurance | null
     */
    public Insurance getInsuranceID(UUID insID){
        for (Insurance ins:insuranceList) {
            if(insID.equals(ins.getInsurID())){
                return ins;
            }
        }
        return null;
    }

    /**
     * @version 1.0
     * @since 22/11/18
     * @param dateEnd
     * @return ArrayList<Insurance>
     */
    public List<Insurance> getInsuranceDateEnd(Date dateEnd){
        List<Insurance> insuranceEndList=new ArrayList<Insurance>();

        for (Insurance ins:insuranceList) {
            if(ins.getInsurTo().before(dateEnd)){
                insuranceEndList.add(ins);
            }
        }
        return insuranceEndList;
    }

    /**
     * @version 1.0
     * @since 22/11/18
     * @param startDate
     * @return ArrayList<Insurance>
     */
    public List<Insurance> getInsuranceDateStart(Date startDate){
        List<Insurance> insuranceEndList=new ArrayList<>();

        for (Insurance ins:insuranceList) {
            if(ins.getInsurFrom().after(startDate)){
                insuranceEndList.add(ins);
            }
        }
        return insuranceEndList;
    }


}
