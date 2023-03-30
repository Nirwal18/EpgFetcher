package domain.model

import com.google.gson.annotations.SerializedName


data class Program(

    @SerializedName("site"           ) var site           : String?           = null,
    @SerializedName("channel"        ) var channel        : String?           = null,
    @SerializedName("titles"         ) var titles         : ArrayList<Title> = arrayListOf(),
    @SerializedName("sub_titles"     ) var subTitles      : ArrayList<SubTitle> = arrayListOf(),
    @SerializedName("descriptions"   ) var descriptions   : ArrayList<Description> = arrayListOf(),
    @SerializedName("icon"           ) var icon           : Icon?             = Icon(),
    @SerializedName("episodeNumbers" ) var episodeNumbers : ArrayList<EpisodeNumber> = arrayListOf(),
    @SerializedName("date"           ) var date           : String?           = null,
    @SerializedName("start"          ) var start          : Long?              = null,
    @SerializedName("stop"           ) var stop           : Long?              = null,
    @SerializedName("urls"           ) var urls           : ArrayList<String> = arrayListOf(),
    @SerializedName("ratings"        ) var ratings        : ArrayList<Rating> = arrayListOf(),
    @SerializedName("categories"     ) var categories     : ArrayList<Category> = arrayListOf(),
    //@SerializedName("directors"      ) var directors      : ArrayList<String> = arrayListOf(),
    @SerializedName("actors"         ) var actors         : ArrayList<String> = arrayListOf(),
    @SerializedName("writers"        ) var writers        : ArrayList<String> = arrayListOf(),
    @SerializedName("adapters"       ) var adapters       : ArrayList<String> = arrayListOf(),
    @SerializedName("producers"      ) var producers      : ArrayList<String> = arrayListOf(),
    @SerializedName("composers"      ) var composers      : ArrayList<String> = arrayListOf(),
    @SerializedName("editors"        ) var editors        : ArrayList<String> = arrayListOf(),
    @SerializedName("presenters"     ) var presenters     : ArrayList<String> = arrayListOf(),
    @SerializedName("commentators"   ) var commentators   : ArrayList<String> = arrayListOf(),
    @SerializedName("guests"         ) var guests         : ArrayList<String> = arrayListOf()

)