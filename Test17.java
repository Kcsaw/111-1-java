public class Test17 {
    public static void main(String[] args) {
    int i,i2,j;
    int b = 1;
    String str1,str2 ="";
    
    for (i=-5; i<1 ; i++){
        i2 = Math.abs(i);
        str1 = "";
        
        for(j=1; j<i2+1;j++){
            str1 = str1 +"*";
        }
            str2 +=Math.abs(b);
            System.out.println(str1 + str2);
            b +=1;
           
    }
    }
}
    

    
    

