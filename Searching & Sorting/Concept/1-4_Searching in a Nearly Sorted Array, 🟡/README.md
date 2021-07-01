```
if(target == middle){
  return middle;
}

if(middle-1 > start && arr[middle - 1] == target){
  return middle - 1;
}
if(middle+1 < end && arr[middle + 1] == target){
  return middle + 1;
}

// then according to condition
end = middle - 2;
      OR
start = middle + 2;
```
