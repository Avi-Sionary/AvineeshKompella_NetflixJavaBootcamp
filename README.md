# JavaBootcampModule11
## Summative Project 2: Movie Budget Manager

Basic budget manager for a movie production unit. Created objects and methods to represent the actors and crew members, as well as the movie itself.

Classes are as follows:

### Person (Abstract)
Includes a name, how much they are paid, and how much they have earned. 
Also includes an abstract method called getPaid() to pay an object of class Person or any of its sub-classes.

### Actor
Extends from Person and includes their role. 
Overrides getPaid() to pay an Actor based on a fixed amount.

### Crew
Extends from Person and includes their department. 
Overrides getPaid() to pay a Crew member based on a fixed amount.

### Director
Extends from Crew. 
Overrides getPaid() to pay a Director a 10% royalty based on movie profits.

### PA
Extends from Crew. 
Overrides getPaid() to pay a PA an hourly salary.

### Movie
Contains a movie's Genre, Director, a list of Actors, a list of Crew, the overall budget, money spent, money earned, and the profit. 
Contains a method to calculate profit.
Contains a Payday method that pays all actors and crew on the movie and adds the total to money spent.


### App
Instantiates all objects created.
Demonstrates the Payday method in Movie by printing how much the PA earned, money spent out of the total budget, profits, and how much the director made in royalties.
Contains a helper method to format dollar amounts by adding commas between groups of three numbers to make it more readable.
Movie I chose is _Jurassic World: Fallen Kingdom_. I never actually saw the movie, so don't ask me why I chose it.
