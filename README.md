# teamAnything #
APCS2 pd02

L#00 -- But What Does the Data Say?

Ricky Lin, Bo Hui Lu, Susan Lin

## Hypothesis ## 
As the size of the matrix, n, increases the runtime will increase at a linear rate.

## Background: The Big Oh ##
MatrixFinder.java should have a runtime of O(n).
type in javac MFDriver.java
then type in java MFDriver > data.csv

## Methodology (repeat for increasing sample size) ##
Using the same sample size, run 10 trials (loop 100000000x), but randomize the elements. Check the runtime of those trials and document it in a .csv file.

## Results ##
The data shows that the runtime is roughly linear, with few distinct points that do not conform to the trend. We were able to formulate a line of best fit, ** 12.6X - 10707 = Y with a coefficient of determination (R^2) of 0.984 **.  

## Conclusions ##
The function runs in linear time with negligble deviations. 