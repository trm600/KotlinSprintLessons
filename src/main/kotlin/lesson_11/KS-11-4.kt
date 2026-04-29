package org.example.lesson_11

class Category(
    val id: Int = 0,
    val title: String = "",
    val nameCategory: String = "",
    val description: String = "",
    val imageUrl: String = "",
    val listOfRecipes: List<String> = listOf(),
)

class Ingredient(
    val nameIngredient: String = "",
    val unitOfMeasure: String = "",
    val quantity: Int = 0,
)

class Recipe(
    val id: Int = 0,
    val title: String = "",
    val ingredients: List<String> = listOf(),
    val cookingMethod: List<String> = listOf(),
    val imageUrl: String = "",
)