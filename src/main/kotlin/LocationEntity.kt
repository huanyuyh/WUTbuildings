package org.example

data class LocationEntity(
    var buildId: Int,
    var name: String,
    var latitude: Double,
    var longitude: Double,
    var area: String,
    var aliases: List<String> = emptyList(),
    var note:String
)

