public class Main {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        long length = n+m;
        
        while(true){
            length = length/2;
            if(length==0){
                break;
            }
            int i = 0;
            int j = i + (int)length;
            
            boolean next = false;

            boolean ia = false;
            boolean ja = false;
            
            while(!(j>=m && next)){
                
                
                if(j>=n && !ja){
                    j=j%n;
                    ja = true;
                    next = true;
                }
                
                if(i>=n && !ia){
                    i=i%n;
                    ia = true;
                }
                
                // System.out.println(i + " " + j);

                if(ia){
                    if(arr2[i]>arr2[j]){
                        long temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
                
                if(ja && !ia){
                    if(arr1[i]>arr2[j]){
                        long temp = arr1[i];
                        arr1[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
                
                if(!ja){
                    if(arr1[i]>arr1[j]){
                        long temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
                
                i++;
                j++;
            }
        }
    }
}
