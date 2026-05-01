package org.example.lesson_11

class Category(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val listOfRecipes: List<Recipe>,
)

class Ingredient(
    val description: String,
    val unitOfMeasure: String,
    val quantity: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
    val imageUrl: String,
)