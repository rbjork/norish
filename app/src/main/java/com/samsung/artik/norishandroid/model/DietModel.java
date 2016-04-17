package com.samsung.artik.norishandroid.model;

import java.util.ArrayList;

/**
 * Created by dev on 4/16/2016.
 */
public class DietModel {
    public static DietModel instance;

    private final String FOOD_SUBMITTED = "foodadded";
    private final String FOOD_LIST_RETURNED = "foodlistreturned";
    private final String RECOMMENDATION_RETURNED = "recommendationreturned";


    public static DietModel getInstance(){
        if(instance == null){
            instance = new DietModel();
        }
        return instance;
    }

    private ArrayList<Food> foods;
    private ArrayList<Food> recommendedFoods;
    private Food foodAdded;
    private Food foodSelected;
}
