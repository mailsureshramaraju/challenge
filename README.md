# Project for food truck

# Food truck service
  Usecase:
    user can search food trucks for keyword like food type, location, food provider for a location.
    location is limited to zip code.
## Description

 User can search where are the food trucks and food types based on the zipcode.

## Technology Used
- Gradle 
- Lombok
- sourceCompatibility = JavaVersion.VERSION_17 
- targetCompatibility = JavaVersion.VERSION_17
- Spring boot & spring

## Repository Name:cchallenge

## Testing Instructions
Prerequisites:
    - setup mysql database
    - import csv dataset based on the link provided from https://github.com/peck/engineering-assessment
    - make sure column names does not have any space.
    - create fulltext index for columns applicant,facilitytype,address,fooditems
    - modify application.yaml for correct mysql db details.

For Start Application:
    - Go to the root of the application where build.gradle is available
    - Run execute the below command gradle bootRun

open brower and type the following:
    http://localhost:8080/trucks?zip=28856&keyword=Cold
You will get result. Eg. following sample result
[{"applicant":"BH & MT LLC","facilitytype":"Truck","address":"401 23RD ST","fooditems":"Cold Truck: Breakfast: Sandwiches: Salads: Pre-Packaged Snacks: Beverages"},{"applicant":"Eva's Catering","facilitytype":"Truck","address":"630 BRANNAN ST","fooditems":"Cold Truck: Burrito: Corn Dog: Salads: Sandwiches: Quesadilla: Tacos: Fried Rice: Cow Mein: Chinese Rice: Noodle Plates: Soup: Bacon: Eggs: Ham: Avacado: Sausages: Beverages"},{"applicant":"Eva's Catering","facilitytype":"Truck","address":"530 05TH ST","fooditems":"Cold Truck: Burrito: Corn Dog: Salads: Sandwiches: Quesadilla: Tacos: Fried Rice: Cow Mein: Chinese Rice: Noodle Plates: Soup: Bacon: Eggs: Ham: Avacado: Sausages: Beverages"}]

Constraints and Future Scope:
    - Due to time constraint skipped test case. we need to add testcase.
    - Add swagger documentation.
    - Add logging and exception handling
    - switch graphql







