public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {10,20,40,50,60,70,90,120,400};
        int search = 40;
        int li = 0;
        int hi = arr.length-1;
        int mi = (li+hi)/2;

    while(li<=hi){
        if(arr[mi]==search){
            System.out.println("Element found at index " + mi + " Position");
            break;
        }
        else if(arr[mi]<search){
            li=mi+1;
        }
        else{
            hi=mi-1;
        }
        mi = (li+hi)/2;
    }
    if(li>hi){
        System.out.println("Element No found");
    }
}
}
