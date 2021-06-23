```
if(arr[middle] == key){

  left = middle + 1;
  
} else if(arr[middle] < key){

  left = middle + 1;
  
} else if(arr[middle] > key){

  ans = middle;
  right = middle - 1;
  
}
```
