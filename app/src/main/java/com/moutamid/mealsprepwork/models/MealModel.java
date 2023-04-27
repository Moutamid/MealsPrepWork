package com.moutamid.mealsprepwork.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.android.material.internal.ParcelableSparseArray;

import java.io.Serializable;

@Entity(tableName = "meal")
public class MealModel implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    int ID = 0;

    @ColumnInfo(name = "Meal")
    String Meal = "";

    @ColumnInfo(name = "DrinkAlternate")
    String DrinkAlternate = "";

    @ColumnInfo(name = "Category")
    String Category = "";

    @ColumnInfo(name = "Area")
    String Area = "";

    @ColumnInfo(name = "Instructions")
    String Instructions = "";

    @ColumnInfo(name = "MealThumb")
    String MealThumb = "";

    @ColumnInfo(name = "Tags")
    String Tags = "";

    @ColumnInfo(name = "Youtube")
    String Youtube = "";

    @ColumnInfo(name = "Ingredient1")
    String Ingredient1 = "";

    @ColumnInfo(name = "Ingredient2")
    String Ingredient2 = "";

    @ColumnInfo(name = "Ingredient3")
    String Ingredient3 = "";

    @ColumnInfo(name = "Ingredient4")
    String Ingredient4 = "";

    @ColumnInfo(name = "Ingredient5")
    String Ingredient5 = "";

    @ColumnInfo(name = "Ingredient6")
    String Ingredient6 = "";

    @ColumnInfo(name = "Ingredient7")
    String Ingredient7 = "";

    @ColumnInfo(name = "Ingredient8")
    String Ingredient8 = "";

    @ColumnInfo(name = "Ingredient9")
    String Ingredient9 = "";

    @ColumnInfo(name = "Ingredient10")
    String Ingredient10 = "";

    @ColumnInfo(name = "Measure1")
    String Measure1 = "";

    @ColumnInfo(name = "Measure2")
    String Measure2 = "";

    @ColumnInfo(name = "Measure3")
    String Measure3 = "";

    @ColumnInfo(name = "Measure4")
    String Measure4 = "";

    @ColumnInfo(name = "Measure5")
    String Measure5 = "";

    @ColumnInfo(name = "Measure6")
    String Measure6 = "";

    @ColumnInfo(name = "Measure7")
    String Measure7 = "";

    @ColumnInfo(name = "Measure8")
    String Measure8 = "";

    @ColumnInfo(name = "Measure9")
    String Measure9 = "";

    @ColumnInfo(name = "Measure10")
    String Measure10 = "";

    @ColumnInfo(name = "Source")
    String Source = "";

    @ColumnInfo(name = "ImageSource")
    String ImageSource = "";

    @ColumnInfo(name = "CreativeCommonsConfirmed")
    String CreativeCommonsConfirmed = "";

    @ColumnInfo(name = "dateModified")
    String dateModified = "";

    public MealModel() {
    }

    public MealModel(String meal, String drinkAlternate, String category, String area, String instructions, String mealThumb, String tags, String youtube, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String ingredient6, String ingredient7, String ingredient8, String ingredient9, String ingredient10, String measure1, String measure2, String measure3, String measure4, String measure5, String measure6, String measure7, String measure8, String measure9, String measure10, String source, String imageSource, String creativeCommonsConfirmed, String dateModified) {
        Meal = meal;
        DrinkAlternate = drinkAlternate;
        Category = category;
        Area = area;
        Instructions = instructions;
        MealThumb = mealThumb;
        Tags = tags;
        Youtube = youtube;
        Ingredient1 = ingredient1;
        Ingredient2 = ingredient2;
        Ingredient3 = ingredient3;
        Ingredient4 = ingredient4;
        Ingredient5 = ingredient5;
        Ingredient6 = ingredient6;
        Ingredient7 = ingredient7;
        Ingredient8 = ingredient8;
        Ingredient9 = ingredient9;
        Ingredient10 = ingredient10;
        Measure1 = measure1;
        Measure2 = measure2;
        Measure3 = measure3;
        Measure4 = measure4;
        Measure5 = measure5;
        Measure6 = measure6;
        Measure7 = measure7;
        Measure8 = measure8;
        Measure9 = measure9;
        Measure10 = measure10;
        Source = source;
        ImageSource = imageSource;
        CreativeCommonsConfirmed = creativeCommonsConfirmed;
        this.dateModified = dateModified;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMeal() {
        return Meal;
    }

    public void setMeal(String meal) {
        Meal = meal;
    }

    public String getDrinkAlternate() {
        return DrinkAlternate;
    }

    public void setDrinkAlternate(String drinkAlternate) {
        DrinkAlternate = drinkAlternate;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String instructions) {
        Instructions = instructions;
    }

    public String getMealThumb() {
        return MealThumb;
    }

    public void setMealThumb(String mealThumb) {
        MealThumb = mealThumb;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public String getYoutube() {
        return Youtube;
    }

    public void setYoutube(String youtube) {
        Youtube = youtube;
    }

    public String getIngredient1() {
        return Ingredient1;
    }

    public void setIngredient1(String ingredient1) {
        Ingredient1 = ingredient1;
    }

    public String getIngredient2() {
        return Ingredient2;
    }

    public void setIngredient2(String ingredient2) {
        Ingredient2 = ingredient2;
    }

    public String getIngredient3() {
        return Ingredient3;
    }

    public void setIngredient3(String ingredient3) {
        Ingredient3 = ingredient3;
    }

    public String getIngredient4() {
        return Ingredient4;
    }

    public void setIngredient4(String ingredient4) {
        Ingredient4 = ingredient4;
    }

    public String getIngredient5() {
        return Ingredient5;
    }

    public void setIngredient5(String ingredient5) {
        Ingredient5 = ingredient5;
    }

    public String getIngredient6() {
        return Ingredient6;
    }

    public void setIngredient6(String ingredient6) {
        Ingredient6 = ingredient6;
    }

    public String getIngredient7() {
        return Ingredient7;
    }

    public void setIngredient7(String ingredient7) {
        Ingredient7 = ingredient7;
    }

    public String getIngredient8() {
        return Ingredient8;
    }

    public void setIngredient8(String ingredient8) {
        Ingredient8 = ingredient8;
    }

    public String getIngredient9() {
        return Ingredient9;
    }

    public void setIngredient9(String ingredient9) {
        Ingredient9 = ingredient9;
    }

    public String getIngredient10() {
        return Ingredient10;
    }

    public void setIngredient10(String ingredient10) {
        Ingredient10 = ingredient10;
    }

    public String getMeasure1() {
        return Measure1;
    }

    public void setMeasure1(String measure1) {
        Measure1 = measure1;
    }

    public String getMeasure2() {
        return Measure2;
    }

    public void setMeasure2(String measure2) {
        Measure2 = measure2;
    }

    public String getMeasure3() {
        return Measure3;
    }

    public void setMeasure3(String measure3) {
        Measure3 = measure3;
    }

    public String getMeasure4() {
        return Measure4;
    }

    public void setMeasure4(String measure4) {
        Measure4 = measure4;
    }

    public String getMeasure5() {
        return Measure5;
    }

    public void setMeasure5(String measure5) {
        Measure5 = measure5;
    }

    public String getMeasure6() {
        return Measure6;
    }

    public void setMeasure6(String measure6) {
        Measure6 = measure6;
    }

    public String getMeasure7() {
        return Measure7;
    }

    public void setMeasure7(String measure7) {
        Measure7 = measure7;
    }

    public String getMeasure8() {
        return Measure8;
    }

    public void setMeasure8(String measure8) {
        Measure8 = measure8;
    }

    public String getMeasure9() {
        return Measure9;
    }

    public void setMeasure9(String measure9) {
        Measure9 = measure9;
    }

    public String getMeasure10() {
        return Measure10;
    }

    public void setMeasure10(String measure10) {
        Measure10 = measure10;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getImageSource() {
        return ImageSource;
    }

    public void setImageSource(String imageSource) {
        ImageSource = imageSource;
    }

    public String getCreativeCommonsConfirmed() {
        return CreativeCommonsConfirmed;
    }

    public void setCreativeCommonsConfirmed(String creativeCommonsConfirmed) {
        CreativeCommonsConfirmed = creativeCommonsConfirmed;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // dest.writeString(Meal);
    }
}
