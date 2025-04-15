# FLASHCARDS-ST10422112
GitHub:
YouTube:

The Flashcard Quiz App is a simple, educational mobile application designed for Android devices using Kotlin. It aims to engage users through a series of true/false questions based on historical facts. The app serves as a lightweight quiz platform ideal for testing knowledge, supporting micro-learning, and demonstrating core Android development concepts. This project is structured around clean design principles and version-controlled using GitHub with continuous integration set up via GitHub Actions.

2. Purpose of the App
The primary purpose of the Flashcard Quiz App is to:

Help users learn and reinforce historical facts through quick quiz interactions.

Demonstrate the use of Kotlin in Android development.

Showcase the application of multiple screen transitions and state handling in a mobile UI/UX.

Serve as a sample project for students or junior developers learning Android development.

The app includes three main screens:

Welcome Screen: Introduces the app and provides a “Start Quiz” button.

Quiz Screen: Displays questions one by one with True/False options.

Score Screen: Shows the user’s final score and gives the option to restart the quiz.

3. Design Considerations
When designing the app, several factors were considered to ensure an engaging, accessible, and user-friendly experience.

3.1 User Interface (UI)
Simplicity: Each screen has a clean layout using LinearLayout to make vertical stacking intuitive and visually neat.

Touch Targets: Buttons are large and well-spaced for comfortable tapping.

Text Readability: Fonts are large (20sp–24sp) with high contrast against background elements.

3.2 Color Scheme
Welcome Screen
Text Color: @android:color/white for contrast on the image.

Button: Default Android button styling with enhanced padding.

Quiz Screen

Background: Solid white (#FFFFFF) for clarity.

Text: Dark gray (#333333) for strong readability.

Buttons: System blue (#6200EE) or default button styling.

Score Screen

Background: Soft gray (#F5F5F5) to create a relaxed atmosphere after the quiz.

Text Color: Black (#000000) for easy reading.

Buttons: Light blue (#2196F3) with white text for visibility.

3.3 Navigation and Flow
Smooth transitions between screens using Intent navigation.

Toast messages provide immediate feedback on user answers.

The score screen encourages replayability by offering a “Review” button.
4. GitHub & GitHub Actions Utilization
4.1 Version Control with GitHub
The project is hosted on GitHub, where every commit reflects incremental progress. This supports:

Tracking changes and reversing bugs.

Collaborative development with issues and pull requests.

Clear commit messages for code transparency.
5. Challenges and Solutions
Challenge 1: Managing UI Across Screens
Solution: Used consistent layout structures (LinearLayout) and separated XML files to maintain a uniform experience.

Challenge 2: Background Image Compatibility
Solution: Used a high-resolution .jpg image placed in the res/drawable folder and set via android:background attribute.

Challenge 3: Keeping the Code DRY and Readable
Solution: Encapsulated question logic inside an array and checked answers using a centralized function.

The Flashcard Quiz App is a simple, functional, and educational Android application built in Kotlin. Through thoughtful design, use of clean code, and integration with GitHub Actions, the app showcases the core strengths of modern mobile development. It offers a great foundation for further extensions such as question categories, scoring animations, or multiplayer modes.

Referencing:

![Screenshot 2025-04-15 230030](https://github.com/user-attachments/assets/ea7970ec-7275-48dd-acd4-e30db243376c)
![Screenshot 2025-04-15 230045](https://github.com/user-attachments/assets/affeb3bd-dee2-4530-bb2c-e5694ba5ae1d)
![Screenshot 2025-04-15 230058](https://github.com/user-attachments/assets/220af2cb-3822-4bff-856d-8e88512ed33a)
![Screenshot 2025-04-15 230114](https://github.com/user-attachments/assets/00c58c12-23db-42a8-908e-f9305ebce8a4)
![Screenshot 2025-04-15 230141](https://github.com/user-attachments/assets/8b3d5b9c-4fcf-4830-baf5-5bce6df784a7)
![Screenshot 2025-04-15 230155](https://github.com/user-attachments/assets/c33b2004-2c94-46b7-9859-e1ea2a63d5fe)
![Screenshot 2025-04-15 230213](https://github.com/user-attachments/assets/54d00410-4a1c-4757-984b-83401c4c4651)
![Screenshot 2025-04-15 230224](https://github.com/user-attachments/assets/0ba9ea18-7abd-445a-9d34-8b447e8d495e)
