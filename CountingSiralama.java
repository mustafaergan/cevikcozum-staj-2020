
package countingsiralama;

public class CountingSiralama {
  
    public static void countingSort(int enBuyuk,int siraDizi[],int frekans[]){
        int frekans2[]= new int[enBuyuk+1];
        for(int i=0;i<enBuyuk;i++){
            frekans2[i]=0;
        }
        for(int i=0;i<siraDizi.length;i++){
            frekans2[siraDizi[i]]=frekans2[siraDizi[i]]+1;
        }
        for(int i=1;i<enBuyuk;i++){
            frekans2[i]=frekans2[i]+frekans2[i-1];
        }
        for(int i=0;i<siraDizi.length;i++){
            frekans[frekans2[siraDizi[i]]]=siraDizi[i];
            frekans2[siraDizi[i]]=frekans2[siraDizi[i]]-1;            
        }
        for(int i=1;i<8;i++){
            System.out.println(frekans[i]);          
        }  
    }
    public static void main(String[] args) {
        int dizi[]={12,5,13,2,8,12,7,1};
        int dizi2[]=new int [13];
        countingSort(13, dizi, dizi2);     
    }
    
}
