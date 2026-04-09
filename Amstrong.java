class Amstrong{
    public static void main(String[] args){
	int n=153;
	int sum_temp=0;
	int temp=n;
	
	int digits= (int) Math.log10(temp)+1;
	while(temp >0){
		int rem = temp %10;
		sum_temp += Math.pow(rem,digits);
		temp /= 10;
		}
	if(sum_temp== n) System.out.print("it is a amstrong number");
	else System.out.print("it is not a amstong number");
          }
}