public class BubbleSortDemo {
    static final int SIZE = 10;

    public static void bubbleSort(int[] a){
        int temp;
        for(int i=1;i<a.length;i++){              //n-1次比较
            for(int j=0;j<a.length-1;j++){
                if(a[j+1]<a[j]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.print("第"+i+"步排序结果：");
            for(int k=0;k<a.length;k++){
                System.out.print(" "+a[k]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for(int i=0;i<SIZE;i++){
            array[i] = (int)(100+Math.random()*(100+1));
        }
        System.out.println("排序前的数组：");
        for(int i=0;i<SIZE;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        bubbleSort(array);
        System.out.println("排序后的数组为：");
        for(int i=0;i<SIZE;i++){
            System.out.print(array[i]+" ");
        }
    }
}