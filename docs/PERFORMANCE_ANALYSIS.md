***Performance Analysis & Validation***

# Results small datasets (9 items):

Unsorted data...

First 10 of Array...
1: 16837
2: 33845
3: 6348
4: 5080
5: 8033
6: 38104
7: 12125
8: 40766
9: 30710

Gnome Sort...

First 10 of Array...
1: 5080
2: 6348
3: 8033
4: 12125
5: 16837
6: 30710
7: 33845
8: 38104
9: 40766
Time elapsed: 1.3261 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 5080
2: 6348
3: 8033
4: 12125
5: 16837
6: 30710
7: 33845
8: 38104
9: 40766
Time elapsed: 0.0156 ms

Shell Sort...

First 10 of Array...
1: 5080
2: 6348
3: 8033
4: 12125
5: 16837
6: 30710
7: 33845
8: 38104
9: 40766
Time elapsed: 0.0099 ms

StopWatch '': 0.0013516 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
0.0013261     98%     Gnome Sort
0.0000156     01%     Cocktail Shaker Sort
0.0000099     01%     Shell Sort







# Results medium dataset (5000 items):

Unsorted data...

First 10 of Array...
1: 4531
2: 12800
3: 45183
4: 44403
5: 36082
6: 16647
7: 12229
8: 14335
9: 22490
10: 31660

Gnome Sort...

First 10 of Array...
1: 30
2: 37
3: 42
4: 42
5: 47
6: 58
7: 74
8: 75
9: 76
10: 89
Time elapsed: 104.7352 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 30
2: 37
3: 42
4: 42
5: 47
6: 58
7: 74
8: 75
9: 76
10: 89
Time elapsed: 120.7235 ms

Shell Sort...

First 10 of Array...
1: 30
2: 37
3: 42
4: 42
5: 47
6: 58
7: 74
8: 75
9: 76
10: 89
Time elapsed: 7.426 ms

StopWatch '': 0.2328847 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
0.1047352     45%     Gnome Sort
0.1207235     52%     Cocktail Shaker Sort
0.007426      03%     Shell Sort






# Results large dataset (50000 items):

Unsorted data...

First 10 of Array...
1: 31502
2: 10712
3: 26214
4: 35889
5: 44225
6: 5578
7: 37969
8: 16819
9: 4740
10: 30353

Gnome Sort...

First 10 of Array...
1: 1
2: 2
3: 2
4: 3
5: 5
6: 5
7: 6
8: 7
9: 8
10: 8
Time elapsed: 7862.5833 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 1
2: 2
3: 2
4: 3
5: 5
6: 5
7: 6
8: 7
9: 8
10: 8
Time elapsed: 9914.373 ms

Shell Sort...

First 10 of Array...
1: 1
2: 2
3: 2
4: 3
5: 5
6: 5
7: 6
8: 7
9: 8
10: 8
Time elapsed: 47.1996 ms

StopWatch '': 17.8241559 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
07.8625833    44%     Gnome Sort
09.914373     56%     Cocktail Shaker Sort
00.0471996    00%     Shell Sort



# Results unsorted dataset (10000 items):

Unsorted data...

First 10 of Array...
1: 9187
2: 25980
3: 13507
4: 41965
5: 33539
6: 6298
7: 6868
8: 46840
9: 26772
10: 30353

Gnome Sort...

First 10 of Array...
1: 1
2: 2
3: 4
4: 12
5: 16
6: 22
7: 28
8: 31
9: 40
10: 42
Time elapsed: 206.4958 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 1
2: 2
3: 4
4: 12
5: 16
6: 22
7: 28
8: 31
9: 40
10: 42
Time elapsed: 308.7121 ms

Shell Sort...

First 10 of Array...
1: 1
2: 2
3: 4
4: 12
5: 16
6: 22
7: 28
8: 31
9: 40
10: 42
Time elapsed: 5.5499 ms

StopWatch '': 0.5207578 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
0.2064958     40%     Gnome Sort
0.3087121     59%     Cocktail Shaker Sort
0.0055499     01%     Shell Sort









# Results sorted dataset (10000 items):

Unsorted data...

First 10 of Array...
1: 0
2: 0
3: 1
4: 1
5: 10
6: 10
7: 14
8: 15
9: 15
10: 23

Gnome Sort...

First 10 of Array...
1: 0
2: 0
3: 1
4: 1
5: 10
6: 10
7: 14
8: 15
9: 15
10: 23
Time elapsed: 1.1211 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 0
2: 0
3: 1
4: 1
5: 10
6: 10
7: 14
8: 15
9: 15
10: 23
Time elapsed: 0.5882 ms

Shell Sort...

First 10 of Array...
1: 0
2: 0
3: 1
4: 1
5: 10
6: 10
7: 14
8: 15
9: 15
10: 23
Time elapsed: 4.3813 ms

StopWatch '': 0.0060906 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
0.0011211     18%     Gnome Sort
0.0005882     10%     Cocktail Shaker Sort
0.0043813     72%     Shell Sort








# Results reversed sorted dataset (10000 items):

Unsorted data...

First 10 of Array...
1: 49998
2: 49989
3: 49974
4: 49962
5: 49939
6: 49939
7: 49938
8: 49933
9: 49929
10: 49927

Gnome Sort...

First 10 of Array...
1: 1
2: 2
3: 8
4: 10
5: 14
6: 15
7: 18
8: 22
9: 25
10: 26
Time elapsed: 417.4587 ms

Cocktail Shaker Sort...

First 10 of Array...
1: 1
2: 2
3: 8
4: 10
5: 14
6: 15
7: 18
8: 22
9: 25
10: 26
Time elapsed: 534.7614 ms

Shell Sort...

First 10 of Array...
1: 1
2: 2
3: 8
4: 10
5: 14
6: 15
7: 18
8: 22
9: 25
10: 26
Time elapsed: 5.4442 ms

StopWatch '': 0.9576643 seconds
----------------------------------------
Seconds       %       Task name
----------------------------------------
0.4174587     44%     Gnome Sort
0.5347614     56%     Cocktail Shaker Sort
0.0054442     01%     Shell Sort






Performance Analysis:
According to the results the Shell sort performed the best across all datasets, except for the presorted test. This is the 
case because this algorithm needs to walk through the preset gaps in order to finish, while the other two don't. The Cocktail 
shaker seemed to perform better than gnome sort at first, but as the dataset increased gnome sort started to perform better 
than the cocktail sort.