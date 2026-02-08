public class ReverseString {

    public static void main(String args[]){
        String str="Bibrk is a bad boy";
        //System.out.print(str);
//reverseString(str);
System.out.println(reverseString(str));

    }
    public static String reverseString(String str){
        int left =0;
        int right = str.length()-1;
        char[] arr = str.toCharArray();
        while(left<right){
            char temp = arr[left];
            arr[left++]=arr[right];
        }
        return String.valueOf(arr);

    }
}
