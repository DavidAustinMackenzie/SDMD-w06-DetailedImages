package au.edu.swin.sdmd.l05_detailedimages

import android.os.Parcel
import android.os.Parcelable

data class Location(val name: String, val author: String,
                    val latitude: Float, val longitude: Float,
                    val visited: Boolean = false) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readFloat(),
        parcel.readFloat(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(author)
        parcel.writeFloat(latitude)
        parcel.writeFloat(longitude)
        parcel.writeByte(if (visited) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Location> {
        override fun createFromParcel(parcel: Parcel): Location {
            return Location(parcel)
        }

        override fun newArray(size: Int): Array<Location?> {
            return arrayOfNulls(size)
        }
    }
}