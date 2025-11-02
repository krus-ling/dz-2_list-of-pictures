package com.example.dz_2_list_of_pictures

import kotlin.random.Random

data class Picture(
    val id: Int,
    val author: String,
    val url: String
)

object GalleryRepository {

    fun generateSamplePictures(): List<Picture> {
        return listOf(
            Picture(1, "Алексей Андреевич", "https://picsum.photos/seed/mama/400"),
            Picture(2, "Варвара Фёдоровна", "https://picsum.photos/seed/urfutresh/400"),
            Picture(3, "Амелия Владимировна", "https://picsum.photos/seed/cat/400"),
            Picture(4, "Андрей Александрович", "https://picsum.photos/seed/xui/400"),
            Picture(5, "София Андреевна", "https://picsum.photos/seed/vsemprivet/400")
        )
    }

    fun generateNewPicture(): Picture {
        val id = Random.nextInt(6, 1000)
        val authors = listOf(
            "Андрей Александрович",
            "Матвей Тимофеевич",
            "Анастасия Владиславовна",
            "Дмитрий Маркович",
            "Илья Егорович"
        )
        return Picture(
            id = id,
            author = authors.random(),
            url = "https://picsum.photos/seed/$id/400"
        )
    }
}
