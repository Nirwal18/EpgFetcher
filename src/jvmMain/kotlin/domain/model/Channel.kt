package domain.model

import com.google.gson.annotations.SerializedName

data class Channel (

    @SerializedName("id"   ) var id   : String? = null,
    @SerializedName("name" ) var name : String? = null,
    @SerializedName("site" ) var site : String? = null,
    @SerializedName("lang" ) var lang : String? = null,
    @SerializedName("logo" ) var logo : String? = null,
    @SerializedName("url"  ) var url  : String? = null

)