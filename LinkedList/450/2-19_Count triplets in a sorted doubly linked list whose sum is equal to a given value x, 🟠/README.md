```

Method 1 (Naive Approach): 

Using three nested loops generate all triplets and check whether elements in the triplet sum up to x or not.

```

```

Method 2 (Hashing):  

Create a hash table with (key, value) tuples represented as (node data, node pointer) tuples. 
Traverse the doubly linked list and store each node’s data and its pointer pair(tuple) in the hash table. 
Now, generate each possible pair of nodes. For each pair of nodes, calculate the 
p_sum(sum of data in the two nodes) and check whether (x-p_sum) exists in the hash table or not. 
If it exists, then also verify that the two nodes in the pair are not same to the node associated with 
(x-p_sum) in the hash table and finally increment count. Return (count / 3) as each triplet is counted 
3 times in the above process.

```

```

Method 3 Efficient Approach(Use of two pointers): 

Traverse the doubly linked list from left to right. For each current node during the traversal, 
initailze two pointers first = pointer to the node next to the current node and 
last = pointer to the last node of the list. Now, count pairs in the list from first to last pointer 
that sum up to value (x – current node’s data). Add this count to the total_count of triplets. 
Pointer to the last node can be found only once in the beginning.

```
