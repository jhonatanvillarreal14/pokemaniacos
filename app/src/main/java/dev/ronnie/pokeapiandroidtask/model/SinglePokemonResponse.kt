package dev.ronnie.pokeapiandroidtask.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SinglePokemonResponse(
    val sprites: Sprites,
    val height: Int,
    val weight: Int
) : Parcelable