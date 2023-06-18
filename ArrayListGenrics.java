import java.util.Arrays;

public class ArrayListGenrics <M>{

    private Object [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public ArrayListGenrics() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(M num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {

        Object [] temp =new Object[data.length*2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    private M remove(){

        return (M) (data[--size]);
    }
    private M get(int index){

        return (M)  data[index];
    }

    @Override
    public String toString() {
        return "ArrayListGenrics{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        ArrayListGenrics<Object> list = new ArrayListGenrics<>();
        for (int i = 0; i < 25; i++) {
            list.add(i*2);
        }

        list.add("Mainak");
        System.out.println(list);
    }


}
