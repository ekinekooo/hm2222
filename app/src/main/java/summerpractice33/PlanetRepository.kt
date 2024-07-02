package ru.itis.summerpractice24

class PlanetRepository {
    val planets = listOf(
        Planet(1, "Меркурий", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Mercury_in_true_color.jpg/1200px-Mercury_in_true_color.jpg", "Ближайшая к Солнцу планета", "Маленькая каменистая планета", "Меркурий - самая маленькая планета Солнечной системы и ближайшая к Солнцу. Он назван в честь римского бога торговли, так как он быстро движется по небу."),
        Planet(2, "Меркурий", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Mercury_in_true_color.jpg/1200px-Mercury_in_true_color.jpg", "Ближайшая к Солнцу планета", "Маленькая каменистая планета", "Меркурий - самая маленькая планета Солнечной системы и ближайшая к Солнцу. Он назван в честь римского бога торговли, так как он быстро движется по небу."),
        Planet(3, "Меркурий", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Mercury_in_true_color.jpg/1200px-Mercury_in_true_color.jpg", "Ближайшая к Солнцу планета", "Маленькая каменистая планета", "Меркурий - самая маленькая планета Солнечной системы и ближайшая к Солнцу. Он назван в честь римского бога торговли, так как он быстро движется по небу."),
        Planet(4, "Меркурий", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Mercury_in_true_color.jpg/1200px-Mercury_in_true_color.jpg", "Ближайшая к Солнцу планета", "Маленькая каменистая планета", "Меркурий - самая маленькая планета Солнечной системы и ближайшая к Солнцу. Он назван в честь римского бога торговли, так как он быстро движется по небу."),
    )

    fun getPlanetById(id: Int): Planet? {
        return planets.find { it.id == id }
    }
}

data class Planet(val id: Int, val name: String, val imageUrl: String, val description: String, val shortDescription: String, val longDescription: String)
