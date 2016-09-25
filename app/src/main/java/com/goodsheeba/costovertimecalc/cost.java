package com.goodsheeba.costovertimecalc;

import java.util.ArrayList;

/**
 * Created by Chris on 9/24/2016.
 */

public class cost {

    //Class Variable
    String costname;
    Integer initialcost;
    //Class Getters
    public String getCostName(){return this.costname;}
    public Integer getCost(){return this.initialcost;}
    //Class Setters
    public void setCostName(String costname){this.costname=costname;}
    public void setCost(Integer cost){this.initialcost=cost;}
    //Default Constructor
    public cost(String costname, Integer initialcost){
        this.setCost(initialcost);
        this.setCostName(costname);
    }

    protected class onetimecost extends cost{
        //A one time cost has an upfront payment and no ongoing regular costs
        //Instance Variables
        ArrayList<Integer> uses = new ArrayList<Integer>(1); //Initializes to 1

        //Constructor for
        protected onetimecost(String costname, Integer initialcost)
        {
            super(costname,initialcost);
            this.uses.add(0);

        }
        // TODO Getters
        public Integer getFirstUse(){return this.uses.get(0);};

        // TODO Setters



    }
    //TODO repeating cost (For monthly repeating costs)
    protected class repeatingcost{
         //TODO Instance Variables

        // TODO Getters

        // TODO Setters

    }
}
