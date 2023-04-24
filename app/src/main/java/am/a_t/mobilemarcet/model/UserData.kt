package am.a_t.mobilemarcet.model


import com.google.gson.annotations.SerializedName

data class UserData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("username")
    val username: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("token")
    val token: String
) {

    companion object {
        fun emptyUserData(): UserData = UserData(
            0,
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        )
    }

}