package com.example.codeschoolhomework.homework1

class Government(val name: String, val year: Int) {
    private val humans = mutableListOf<Human>() //imatble a chpopoxvogna mutable y popoxvog list
    // gavermenty baxkacaca humanneric human y vala aysinqn chi karog poxvel ev inqy mutable
    // lista aysinqn listy karog enk avelacnel u parunakeluya human tipi obyekner
    private var pensionAge = PENSIONER_DEFAULT_AGE
//inchu default age enumov nshel u inja companion obyekty???????????
    val pension: Int =2000
    var fond=1000000
    fun addHuman(human: Human) {
        humans.add(human)    //addHuman y talisa Human i obyekt
    }

    fun removeHuman(human: Human) {
        humans.remove(human)   //remove Human ov jnjum enk vory petk chi
    }

    fun givePension() {
        getPensioners().forEach {
            it.onPensionReceived(1000)
        }
    }

    fun getPensioners(): List<Human> {
        val pens = mutableListOf<Human>()
        humans.forEach {
            if (it.age >= pensionAge) {//filt enk anum if ov
                //apply nshanakuma inchvor gorcuxutyun
                // u naev veradarcnuma en obyekt vori vra gorcoxutyuna arvel
                pens.add(it)
            }
        }

        return pens
    }
   fun payUtility(money: Int){
       if(money<=pension){

       }else{}
   }

    companion object {
        const val PENSIONER_DEFAULT_AGE = 63
    }
}