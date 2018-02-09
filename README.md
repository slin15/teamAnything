# teamAnything #
APCS2 pd02

L#00 -- But What Does the Data Say?

Ricky Lin, Bo Hui Lu, Susan Lin

## Hypothesis ## 
As the size of the matrix, n, increases the runtime will increase at a **linear rate**.

## Background: The Big Oh ##
MatrixFinder.java should have a runtime of **O(n)**.

type in javac MFDriver.java

then type in java MFDriver > data.csv

Our search algorithm in MatrixFinder works by starting at the bottom left of the matrix. Then we check to see if the target is larger or smaller than the number there. If the target is smaller than the number, we move up the matrix. If the target is larger than the number there, then we move to the right. This process will repeat until the target is found in the array or the search algorithm goes out of the matrix, ending the search.

## Methodology (repeat for increasing sample size by a factor of 100) ##
We created a function populate that creates matrices, starting from size 100 and increasing by increments of 100 until size 10000. These arrays are filled with numbers starting from 1 and increasing by 1 down the row. The next row will start with a 2, 1 larger than the previous row, and increases in the same way as the previous row. This continues until the entire matrix is filled up with numbers according to the rules.

Using the same sample size, run 10K trials, but with incrementing elements. We time the run time of solely the search method and store the value. Then, we print the value to ensure that no other methods are being timed. Check the runtime of those trials and document it in a .csv file.

## Results ##
Google Sheets Link to Experimental Data: https://docs.google.com/spreadsheets/d/1UMSfhXNJ7QH35i69T8W8c4uGV2bFzeNfo48xeQPfikQ/edit?usp=sharing
![](./graph.png)

The data shows that the runtime is roughly linear, with few distinct points that do not conform to the trend.

We were able to formulate a line of best fit, **12.6X - 10707 = Y with a coefficient of determination (R^2) of 0.984**.  

## Conclusions ##
The function runs in linear time with negligble deviations.

The minor deviations were mostly likely caused by the randomness of the target number which could have led to either a worst or best case scenario. 
