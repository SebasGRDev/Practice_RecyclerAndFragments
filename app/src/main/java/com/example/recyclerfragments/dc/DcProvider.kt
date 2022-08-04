package com.example.recyclerfragments.dc

import com.example.recyclerfragments.SuperHero

class DcProvider {
    companion object {
        val dcList = listOf<SuperHero>(
            SuperHero(
                "Barry Allen",
                "Flash",
                "Super Speed",
                "https://super-ficcion.com/wp-content/uploads/2022/03/The-Flash-temporada-9.webp"
            ),
            SuperHero(
                "Oliver Queen",
                "Green Arrow",
                "Punteria God",
                "https://www.latercera.com/resizer/uWGPIiknerWJPoCf06YxQw-rsMw=/arc-anglerfish-arc2-prod-copesa/public/KLFJ5HOK4NH57HJNKQUMNVRIHA.jpg"
            ),
            SuperHero(
                "Bruce Wayne",
                "Batman",
                "Ser Batman",
                "https://hbomax-images.warnermediacdn.com/images/GX8VcRQca5sLDbAEAAAD-/tile?size=640x360&partner=hbomaxcom&v=928c0bf54867cc12ed4c3933585d3cde&language=es-419&host=art-gallery.api.hbo.com"
            ),
            SuperHero(
                "Victor",
                "Cyborg",
                "Ser un Cyborg",
                "https://pm1.narvii.com/6371/aced6f3da01890baaefa26f11698e46b80a9918f_hq.jpg"
            )
        )
    }

}