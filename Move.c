#include <stdio.h>

int main() {
    int n, i, j, temp;
    scanf("%d", &n);
    
    // Declare an array of size n
    int arr[n];
    
    // Read n integers and store them in the array
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    // Move negative elements to one side of the array
    j = 0;
    for (int i=0;i<n;i++) {
        if (arr[i] < 0) {
            // Swap arr[i] with arr[j]
            temp =  arr[i]   ;
            for (int k=i;k>j;k--) {
                arr[k] =  arr[k-1];
            }
            arr[j] = temp;
            j++;
        }
    }
    
    // Output the modified array
    //printf("Array after moving negative elements to one side: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    
    return 0;
}
