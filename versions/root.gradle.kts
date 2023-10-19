plugins {
    id("gg.essential.multi-version.root")
}

group = "$group.versions-root"

preprocess {

//    val forge12001 = createNode("1.20.1-forge", 12001, "official")
//    val fabric12001 = createNode("1.20.1-fabric", 12001, "official")
//
//    val forge11904 = createNode("1.19.4-forge", 11904, "official")
//    val fabric11904 = createNode("1.19.4-fabric", 11904, "official")
//
    val fabric11903 = createNode("1.19.3-fabric", 11903, "official")
    val forge11903 = createNode("1.19.3-forge", 11903, "official")

    forge11903.link(fabric11903)

    val fabric11701 = createNode("1.17.1-fabric", 11701, "official")
    val forge11701 = createNode("1.17.1-forge", 11701, "official")

    fabric11701.link(fabric11903)
    forge11701.link(forge11903, file("1.17.1-1.18.2-forge.txt"))


    val fabric11605 = createNode("1.16.5-fabric", 11605, "official")
    val forge11605 = createNode("1.16.5-forge", 11605, "official")

    fabric11605.link(fabric11701)
    forge11605.link(forge11701, file("1.16.5-1.17.1-forge.txt"))

//    val forge11902 = createNode("1.19.2-forge", 11902, "official")
//    val fabric11902 = createNode("1.19.2-fabric", 11902, "official")
//
//    val forge11802 = createNode("1.18.2-forge", 11802, "official")
//    val fabric11802 = createNode("1.18.2-fabric", 11802, "official")
//
//    val forge11701 = createNode("1.17.1-forge", 11701, "official")
//    val fabric11701 = createNode("1.17.1-fabric", 11701, "official")
//
//    val forge11605 = createNode("1.16.5-forge", 11605, "official")
//    val fabric11605 = createNode("1.16.5-fabric", 11605, "official")
//
//    fabric12001.link(fabric11904)
//    forge12001.link(fabric12001)
//
//    forge11903.link(fabric11903)
//
//    fabric11904.link(fabric11903)
//    forge11904.link(fabric11904)
//
//    fabric11902.link(fabric11903, file("1.19.2-1.19.3.txt"))
//    forge11902.link(fabric11902)
//
//    fabric11802.link(fabric11902)
//    forge11802.link(fabric11802)
//
//    fabric11701.link(fabric11802, file("1.17.1-1.18.2.txt"))
//    forge11701.link(fabric11701)
//
//    fabric11605.link(fabric11701)
//    forge11605.link(fabric11605)
}
