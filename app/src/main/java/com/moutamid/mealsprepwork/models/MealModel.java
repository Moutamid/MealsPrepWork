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

    @ColumnInfo(name = "Ingredient11")
    String Ingredient11 = "";

    @ColumnInfo(name = "Ingredient12")
    String Ingredient12 = "";

    @ColumnInfo(name = "Ingredient13")
    String Ingredient13 = "";

    @ColumnInfo(name = "Ingredient14")
    String Ingredient14 = "";

    @ColumnInfo(name = "Ingredient15")
    String Ingredient15 = "";

    @ColumnInfo(name = "Ingredient16")
    String Ingredient16 = "";

    @ColumnInfo(name = "Ingredient17")
    String Ingredient17 = "";

    @ColumnInfo(name = "Ingredient18")
    String Ingredient18 = "";

    @ColumnInfo(name = "Ingredient19")
    String Ingredient19 = "";

    @ColumnInfo(name = "Ingredient20")
    String Ingredient20 = "";

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

    @ColumnInfo(name = "Measure11")
    String Measure11 = "";

    @ColumnInfo(name = "Measure12")
    String Measure12 = "";

    @ColumnInfo(name = "Measure13")
    String Measure13 = "";

    @ColumnInfo(name = "Measure14")
    String Measure14 = "";

    @ColumnInfo(name = "Measure15")
    String Measure15 = "";

    @ColumnInfo(name = "Measure16")
    String Measure16 = "";

    @ColumnInfo(name = "Measure17")
    String Measure17 = "";

    @ColumnInfo(name = "Measure18")
    String Measure18 = "";

    @ColumnInfo(name = "Measure19")
    String Measure19 = "";

    @ColumnInfo(name = "Measure20")
    String Measure20 = "";

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

    public MealModel(String meal, String drinkAlternate, String category, String area, String instructions, String mealThumb, String tags, String youtube, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String ingredient6, String ingredient7, String ingredient8, String ingredient9, String ingredient10, String ingredient11, String ingredient12, String ingredient13, String ingredient14, String ingredient15, String ingredient16, String ingredient17, String ingredient18, String ingredient19, String ingredient20, String measure1, String measure2, String measure3, String measure4, String measure5, String measure6, String measure7, String measure8, String measure9, String measure10, String measure11, String measure12, String measure13, String measure14, String measure15, String measure16, String measure17, String measure18, String measure19, String measure20, String source, String imageSource, String creativeCommonsConfirmed, String dateModified) {
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
        Ingredient11 = ingredient11;
        Ingredient12 = ingredient12;
        Ingredient13 = ingredient13;
        Ingredient14 = ingredient14;
        Ingredient15 = ingredient15;
        Ingredient16 = ingredient16;
        Ingredient17 = ingredient17;
        Ingredient18 = ingredient18;
        Ingredient19 = ingredient19;
        Ingredient20 = ingredient20;
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
        Measure11 = measure11;
        Measure12 = measure12;
        Measure13 = measure13;
        Measure14 = measure14;
        Measure15 = measure15;
        Measure16 = measure16;
        Measure17 = measure17;
        Measure18 = measure18;
        Measure19 = measure19;
        Measure20 = measure20;
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

    public String getIngredient11() {
        return Ingredient11;
    }

    public void setIngredient11(String ingredient11) {
        Ingredient11 = ingredient11;
    }

    public String getIngredient12() {
        return Ingredient12;
    }

    public void setIngredient12(String ingredient12) {
        Ingredient12 = ingredient12;
    }

    public String getIngredient13() {
        return Ingredient13;
    }

    public void setIngredient13(String ingredient13) {
        Ingredient13 = ingredient13;
    }

    public String getIngredient14() {
        return Ingredient14;
    }

    public void setIngredient14(String ingredient14) {
        Ingredient14 = ingredient14;
    }

    public String getIngredient15() {
        return Ingredient15;
    }

    public void setIngredient15(String ingredient15) {
        Ingredient15 = ingredient15;
    }

    public String getIngredient16() {
        return Ingredient16;
    }

    public void setIngredient16(String ingredient16) {
        Ingredient16 = ingredient16;
    }

    public String getIngredient17() {
        return Ingredient17;
    }

    public void setIngredient17(String ingredient17) {
        Ingredient17 = ingredient17;
    }

    public String getIngredient18() {
        return Ingredient18;
    }

    public void setIngredient18(String ingredient18) {
        Ingredient18 = ingredient18;
    }

    public String getIngredient19() {
        return Ingredient19;
    }

    public void setIngredient19(String ingredient19) {
        Ingredient19 = ingredient19;
    }

    public String getIngredient20() {
        return Ingredient20;
    }

    public void setIngredient20(String ingredient20) {
        Ingredient20 = ingredient20;
    }

    public String getMeasure11() {
        return Measure11;
    }

    public void setMeasure11(String measure11) {
        Measure11 = measure11;
    }

    public String getMeasure12() {
        return Measure12;
    }

    public void setMeasure12(String measure12) {
        Measure12 = measure12;
    }

    public String getMeasure13() {
        return Measure13;
    }

    public void setMeasure13(String measure13) {
        Measure13 = measure13;
    }

    public String getMeasure14() {
        return Measure14;
    }

    public void setMeasure14(String measure14) {
        Measure14 = measure14;
    }

    public String getMeasure15() {
        return Measure15;
    }

    public void setMeasure15(String measure15) {
        Measure15 = measure15;
    }

    public String getMeasure16() {
        return Measure16;
    }

    public void setMeasure16(String measure16) {
        Measure16 = measure16;
    }

    public String getMeasure17() {
        return Measure17;
    }

    public void setMeasure17(String measure17) {
        Measure17 = measure17;
    }

    public String getMeasure18() {
        return Measure18;
    }

    public void setMeasure18(String measure18) {
        Measure18 = measure18;
    }

    public String getMeasure19() {
        return Measure19;
    }

    public void setMeasure19(String measure19) {
        Measure19 = measure19;
    }

    public String getMeasure20() {
        return Measure20;
    }

    public void setMeasure20(String measure20) {
        Measure20 = measure20;
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
