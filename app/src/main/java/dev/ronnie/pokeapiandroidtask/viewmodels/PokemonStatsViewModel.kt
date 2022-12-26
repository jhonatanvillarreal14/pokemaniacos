package dev.ronnie.pokeapiandroidtask.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.ronnie.pokeapiandroidtask.data.repositories.PokemonRepository
import dev.ronnie.pokeapiandroidtask.utils.NetworkResource
import dev.ronnie.pokeapiandroidtask.utils.extractId
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class PokemonStatsViewModel @Inject constructor(private val pokemonRepository: PokemonRepository) :
    ViewModel() {
}