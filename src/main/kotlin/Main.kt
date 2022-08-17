fun main() {
    val post1 =  Post(
        id = 0,
        ownerId = 1,
        text = "Posted",
        date = 1663718400,
        likes = Likes(count = 5)
    )

    val post2 =  Post(
        id = 0,
        ownerId = 1,
        text = "Posted again",
        date = 1663718400,
        likes = Likes(count = 5)
    )

    val service = WallService
    println(post1)

    val postAdded1 = service.add(post1)
    val postAdded2 = service.add(post2)

    println(postAdded1)
    println(postAdded2)

    val post3 = Post(
        id = 2,
        ownerId = 1,
        text = "Another post",
        date = 1663718400,
        likes = Likes(count = 5)
    )

    val res = service.update(post3)
    println("News update: $res")
    println(postAdded2)
}