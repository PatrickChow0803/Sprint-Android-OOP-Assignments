package com.patrickchow.networkingwithpokemonapi.ViewModel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.patrickchow.networkingwithpokemonapi.Model.ListOfAbilities
import com.patrickchow.networkingwithpokemonapi.Model.ListOfTypes
import com.patrickchow.networkingwithpokemonapi.Model.Pokemon
import com.patrickchow.networkingwithpokemonapi.Model.Sprites

class PokemonViewModel: BaseObservable(){

    private val selectedPoke:Pokemon = Pokemon("", Sprites(""), -1,
                                                ArrayList<ListOfAbilities>(), ArrayList<ListOfTypes>())
    @Bindable
    fun getName(): String?{
        return selectedPoke.name
    }

    @Bindable
    fun getSprites(): Sprites?{
        return selectedPoke.sprites
    }

    @Bindable
    fun getId(): Int{
        return selectedPoke.id
    }

    @Bindable
    fun getAbilities(): List<ListOfAbilities>{
        return selectedPoke.abilities
    }

    @Bindable
    fun getTypes(): List<ListOfTypes>{
        return selectedPoke.types
    }

}