# AndroidMvvmWithRxjava
This is an Android project template that incorporates several modern libraries and architectural patterns, including MVVM, RXJava, Compose, Hilt, Room Database, and Retrofit. The purpose of this project is to provide a starting point for building robust and maintainable Android applications.

## Libraries

This project uses a variety of libraries to support different aspects of Android development:

- [Android Jetpack](https://developer.android.com/jetpack): Provides a set of libraries, tools, and guidance to help developers write high-quality apps.
- [MVVM (Model-View-ViewModel)](https://developer.android.com/jetpack/guide): A design pattern that separates the user interface (View) from the business logic (ViewModel).
- [RxJava](https://github.com/ReactiveX/RxJava): A library for composing asynchronous and event-based programs using observable sequences.
- [Hilt](https://dagger.dev/hilt/): A dependency injection library for Android that simplifies Dagger setup.
- [Jetpack Compose](https://developer.android.com/jetpack/compose): A modern, fully declarative UI toolkit for building native Android UI.
- [Room Database](https://developer.android.com/training/data-storage/room): A persistence library that provides an abstraction layer over SQLite to allow for more robust database access.
- [Retrofit](https://square.github.io/retrofit/): A type-safe HTTP client for Android and Java.

## Getting Started

Follow these steps to get started with this project:

1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the app on your emulator or physical device.

Please make sure you have the necessary Android development tools and dependencies installed on your machine.

## Architecture

This project follows the MVVM architecture pattern, which separates the application into three main components:

- **Model**: Represents the data and business logic. It includes the data repository, data sources, and domain models.
- **View**: Represents the user interface, implemented using Jetpack Compose in the presentation module.
- **ViewModel**: Acts as an intermediary between the Model and View. It contains the presentation logic and exposes data to the UI components.

The flow of data in this architecture is unidirectional: Model -> ViewModel -> View.

## Features

This project provides a basic structure for building Android applications with the following features:

- Network requests using Retrofit.
- Data caching and management with Room Database.
- Dependency injection with Hilt.
- Reactive programming using RxJava.
- Modern UI development with Jetpack Compose.
- Clear separation of concerns and maintainable codebase.

Feel free to extend and customize the project to suit your specific application requirements.



# License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Enjoy building Android applications with MVVM, RXJava, Compose, Hilt, Room Database, and Retrofit using this project template. If you have any questions or need assistance, please feel free to reach out to the project maintainers.
