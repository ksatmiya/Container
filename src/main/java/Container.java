public class Container<T> {
    private Object[] array;
    private int size;
    private int capacity;

    public Container(int initCapacity) {
        this.capacity = initCapacity;
        this.array = new Object[initCapacity];
        this.size = 0;
    }

    /**
     * добавляет элемент в контейнер
     * @param element элемент, который добавляется в контейнер
     */
    public void add(T element) {
        if (size == capacity) {
            expCapacity();
        }
        array[size] = element;
        size++;
    }

    /**
     * возвращает элемент, расположенный по заданному индексу
     * @param index индекс элемента, который нужно извлечь
     * @return элемент, расположенный по заданному индексу
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return (T) array[index];
    }

    /**
     * увеличивает емкость контейнера в 2 раза, когда текущая исчерпана, создает новый массив, в который копируются все элементы из старого
     */
    private void expCapacity(){
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    /**
     * удаляет элемент по заданному индексу, далее все последующие элементы сдвигаются влево
     * @param index индекс элемента, который нужно удалить
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        for (int i = index; i < size - 1; i++){
            array[i] = array[i+1];
        }
        array[size - 1] = null;
        size--;
    }

    /**
     * возвращает текущий размер контейнера
     * @return количество элементов в контейнере
     */
    public int size() {
        return size;
    }

    /**
     * удаляет все элементы тем самым очищает контейнер
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}
