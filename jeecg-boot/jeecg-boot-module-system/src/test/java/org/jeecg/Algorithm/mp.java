package org.jeecg.Algorithm;

import java.util.Arrays;

public class mp {



    /**
     *  冒泡排序
     *  比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * @param array
     * @return
     */
 public static int[] sort(int[]  array){
       long time=  System.currentTimeMillis();
     int[] arr= Arrays.copyOf(array,array.length);
     //arr.length-i 为需要比较的次数
     for(int i=1;i<arr.length;i++){
         for (int j=0;j<arr.length-i;j++){
             if(arr[j]>arr[j+1]){
                 int tmp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=tmp;
             }
         }

     }
     System.out.println("耗时："+(System.currentTimeMillis()-time));
     return  arr;
 }
 //选择排序

    /**
     * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后跟之后的全部元素比较，一次遍历后最小的就放到已经排序号的队尾，
     * @param array
     * @return
     */
   public static int[] sort2(int[] array){
     int[] arr=Arrays.copyOf(array,array.length);
     //
       long time=  System.currentTimeMillis();
     for(int i=0;i<arr.length-1;i++){
         int min = i;
         // 每轮需要比较的次数 N-i
         for (int j = i + 1; j < arr.length; j++) {
             //如果arr[j]比arr[min]小，那么Min=j;
             if(arr[j]<arr[min]){
                 min=j;
             }
             // 将找到的最小值和i位置所在的值进行交换
             if (i != min) {
                 int tmp = arr[i];
                 arr[i] = arr[min];
                 arr[min] = tmp;
             }
         }

     }
       System.out.println("耗时："+(System.currentTimeMillis()-time));
     return arr;

   }

    /**
     * 插入排序
     * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
     * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。
     * @param Array
     */
    public static  int[] sort3(int[] Array){
       int[] arr=Arrays.copyOf(Array,Array.length);
        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr={10,45,89,48,1,5,12,58,36};
        int[] arr2=  sort2(arr);
    for(int i=0;i<arr2.length;i++){
        System.out.println(arr2[i]);
    }
    }
}
