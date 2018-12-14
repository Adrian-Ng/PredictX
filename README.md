# Brief

This __Java__ project computes the distance between two locations (defined via lat/long) using the [Haversine formula](https://en.wikipedia.org/wiki/Haversine_formula), which takes into consideration the curvature of the Earth.
We assume a radius of 6371 km.

Distances are output in km.

# Runthrough

When run, the program will read the contents of `Flight Distance Test.csv`.
The data from this file is stored in a collection of `CityPair` types, in which each instantiation is representative of a single row of data from the `.csv` input.

We then iterate through this collection and for each `CityPair`, we estimate the distance between the two airports.
This is done by invoking `computeDistance()`, which is part of the `Haversine.java` class.
Lastly, we print the output to `System.out`.

# Classes

* __Main.java__
* Haversine.java
* CityPair.java
* Utils.java


## Main.java

This is the main body of the Java project. 

## Haversine.java

This class contains the implementation of the Haversine formula.

To return the distance estimate, we invoke the method `computeDistance()`

## CityPair.java

Each instantiation of this Java class represents a single tuple/row from the `.csv` input.
In other words, each instance of `CityPair` represents a pair of cities.

## Utils.java

This helper class contains a single method `readTxt()`, which is used to read the `.csv` input.

# Example output

```
 Distance between TSE and LHR is 4306.600508 km
 Distance between SHA and TSA is 677.489504 km
 Distance between ATL and IAH is 1780.899529 km
 Distance between EWR and TPA is 1604.386833 km
 Distance between LHR and YUL is 5213.691671 km
 Distance between MIA and GVA is 8926.725556 km
 Distance between MNL and NCL is 6907.092617 km
 Distance between FCO and TRN is 525.657868 km
 Distance between SYD and MEL is 712.200284 km
 Distance between DUB and JFK is 5109.835631 km
 Distance between DCA and BOS is 631.697268 km
 Distance between JFK and POS is 3557.172476 km
 Distance between MAA and BHX is 2938.706531 km
 Distance between AMS and SFO is 367.842696 km
 Distance between ZRH and ICN is 294.667466 km
 Distance between LGA and YEG is 1636.436271 km
 Distance between LHR and LCA is 3275.413506 km
 Distance between ICN and ATL is 10573.705634 km
 Distance between BAH and FRA is 4442.935624 km
 Distance between NRT and HNL is 6137.126895 km
 Distance between LIS and BOM is 1878.095907 km
 Distance between DXB and GVA is 4917.664069 km
```

# Data issues

The `.csv` file contains duplicate tuples.
To get around this, we use `HashMap<String, CityPair>`.
Here, `String` is representative of data from the first column in the `.csv` input. 

For example:

``
London, United Kingdom - New York, United States Of America
``

and `CityPair` is an object that stores data for the subsequent columns.

By using a HashMap, any repetition of `String` simply overwrites that entry.

To access data from this Hashmap, we store a collection of these `String` values in `HashSet<String>`, which by definition cannot have duplicate values.


