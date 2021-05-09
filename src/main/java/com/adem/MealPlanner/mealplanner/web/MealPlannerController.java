package com.adem.MealPlanner.mealplanner.web;
//Controller handles end points and exceptions

import com.adem.MealPlanner.mealplanner.domain.Meal;
import com.adem.MealPlanner.mealplanner.service.MealPlannerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal-planner")
public class MealPlannerController {
    MealPlannerService mealPlannerService;

    public MealPlannerController(MealPlannerService mealPlannerService) {
        this.mealPlannerService = mealPlannerService;
    }

    @GetMapping("/meals")
    public List<Meal>  meals(){
        return mealPlannerService.getMeals();
    }

    @PostMapping("/meal")
    public void addMeal(@RequestBody Meal meal){
        mealPlannerService.addMeal(meal);
    }

    @PostMapping("/meals")
    public void addMeals(@RequestBody List<Meal> meal){
        mealPlannerService.addMeals(meal);
    }

    @DeleteMapping("/meals")
    public void clearMeals(){
        mealPlannerService.clearMeals();
    }

    @GetMapping("/meal/random")
    public Meal randomMeal(){
        return mealPlannerService.getRandomMeal();
    }

}
