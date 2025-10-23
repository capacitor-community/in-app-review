// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorCommunityInAppReview",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "CapacitorCommunityInAppReview",
            targets: ["InAppReviewPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "InAppReviewPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/InAppReviewPlugin"),
        .testTarget(
            name: "InAppReviewPluginTests",
            dependencies: ["InAppReviewPlugin"],
            path: "ios/Tests/InAppReviewPluginTests")
    ]
)
