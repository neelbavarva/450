```
int ans = -1;

while(left<right){
  if(middle == given){
    return given;
  }

  if(middle > given){
    left = middle + 1;
  }

  if(middle < given){
    right = middle - 1;
    ans = middle;
  }
}

return ans;
```
