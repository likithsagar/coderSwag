package com.example.likit.coderswag.Services

import com.example.likit.coderswag.model.Category
import com.example.likit.coderswag.model.Product

/**
 * Created by likit on 3/21/2018.
 */
object DataService {

    val categories = listOf( Category("SHIRTS", "shirtimage"),
                             Category("HOODIES","hoodieimage"),
                             Category("HATS","hatimage")


            )
    val hats = listOf( Product("Dev graphics beenie","$18","hat01"),
                      Product("Hat black","$20","hat-02"),
                      Product("Hat white", "$18", "hat-03"),
                      Product("Hat Snapback", "$22", "hat-04")


    )

    val hoodies = listOf( Product("Dev graphics hoodie","$28","hoodie01"),
            Product("Dev hoodie red","$20","hoodie-02"),
            Product("Gray Hoodie", "$18", "hoodie-03"),
            Product("Red hoodie", "$22", "hoodie-04")
    )

    val shirts = listOf( Product("Dev graphics shirt","$18","shirt01"),
            Product("Shirt black","$20","shirt-02"),
            Product("Shirt white", "$18", "shirt-03"),
            Product("Shirt Snapback", "$22", "shirt-04")
    )
}