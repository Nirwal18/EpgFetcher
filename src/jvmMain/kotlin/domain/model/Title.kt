package domain.model

import com.google.gson.annotations.SerializedName

data class Title (

    @SerializedName("value" ) var value : String? = null,
    @SerializedName("lang"  ) var lang  : String? = null

)

data class Icon (
    @SerializedName("src" ) var src : String? = null
)

data class Description (
    @SerializedName("value" ) var value : String? = null,
    @SerializedName("lang"  ) var lang  : String? = null

)

data class Category (
    @SerializedName("value" ) var value : String? = null,
    @SerializedName("lang"  ) var lang  : String? = null

)

data class SubTitle (
    @SerializedName("value" ) var value : String? = null,
    @SerializedName("lang"  ) var lang  : String? = null

)

data class EpisodeNumber (
    @SerializedName("value" ) var value : String? = null,
    @SerializedName("system"  ) var system  : String? = null
)

data class Rating (
    @SerializedName("value" ) var value : String? = null,
    @SerializedName("system"  ) var system  : String? = null,
    @SerializedName("icon"  ) var icon  : String? = null
)

