package org.example.lesson_11

class Category {
    var nameCategory: String = ""
}

class Ingredient {
    var nameIngredient: String = ""
    var unit: String = ""
    var perServing: Double = 0.0
}

class Recipe {
    var category: Category = Category()
    var nameRecipe: String = ""
    val ingredient: MutableList<Ingredient> = mutableListOf()
    var servings: Int = 0
    var isFavorite: Boolean = false
    val cookingMethod: MutableList<String> = mutableListOf()
}