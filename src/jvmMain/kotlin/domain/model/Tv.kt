package domain.model

import com.google.gson.annotations.SerializedName

data class Tv(

    @SerializedName("channels" ) var channels : ArrayList<Channel> = arrayListOf(),
    @SerializedName("programs" ) var programs : ArrayList<Program> = arrayListOf()

)