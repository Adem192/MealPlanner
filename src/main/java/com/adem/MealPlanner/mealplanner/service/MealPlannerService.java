package com.adem.MealPlanner.mealplanner.service;
//Service has logic and any programming

import com.adem.MealPlanner.mealplanner.domain.Meal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@Service
public class MealPlannerService {
    public List <Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        log.info("Adding meal {}", meal);
        meals.add(meal);
    }

    public void addMeals(List<Meal> newMeals) {
        log.info("Adding meals {}", newMeals);
        meals.addAll(newMeals);
    }

    public List<Meal> getMeals() {
        log.info("Getting meals {}", meals);
        return meals;
    }

    public Meal getRandomMeal() {
        log.info("Getting random meal");
        Random rand = new Random();
        return meals.get(rand.nextInt(meals.size()));
    }

    public void clearMeals() {
        log.info("Clearing meals {}", meals);
        meals.clear();
    }
}
