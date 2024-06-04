## Student Roll Interface

This application is a demo demonstrating creating a student roll using the JavaFx library and was build using javaFx-sdk-22.0.12.

## Compiling program

1. Ensure you have the JavaFx sdk library downloaded and take note of which directory it is stored.
2. Open your computer terminal and navigate to the directory you wish to store the project
3. Run `git clone git@github.com:itsnameissteven/csc372-mod8.git`
4. Run `cd csc372-mod8/`
5. Run `javac -d ./build/ --module-path {path/to/your/javaFx/lib} --add-modules javafx.controls,javafx.fxml src/student_roll/*.java`
6. Run `cd build`
7. Run `java --module-path {path/to/your/javaFx/lib} --add-modules javafx.controls,javafx.fxml student_roll.Main`

## Using the application

As a user, you can fill out a form to add students names, gpa and addresses. A menu bar is provided to save the student list to a text file.

## Contributors

- [Steven Mancine](https://github.com/itsnameissteven)
