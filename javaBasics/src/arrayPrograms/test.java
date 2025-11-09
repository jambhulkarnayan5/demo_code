package arrayPrograms;

import java.util.Arrays;

class test {
    public static void main(String[] args) {
        int a[] = {8,9,3,4,5,6};
        int i=0, j=a.length-1, temp;
        
        while(i<j){
            
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            
            i++;
            j--;
            
        }
        System.out.print("Reversed array is  "+Arrays.toString(a));
    }
}