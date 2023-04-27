package com.moutamid.mealsprepwork.database;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.moutamid.mealsprepwork.models.MealModel;

import java.util.List;

@Dao
public interface MealDAO {

    @Insert(onConflict = REPLACE)
    void insert(MealModel meal);

    @Query("SELECT * FROM meal ORDER BY ID DESC")
    List<MealModel> getAll();

//    @Query("UPDATE meal SET userID = :userID, startJourney = :startJourney, endJourney= :endJourney, spent= :spent where ID = :ID")
//    void update(int ID, int userID, String startJourney, String endJourney, int spent);

    @Delete
    void Delete(MealModel meal);
}
