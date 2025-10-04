// Last updated: 04/10/2025, 15:51:59
class MyHashMap {
    public int arr[];
    public int size;
    public MyHashMap() {
        size = 1000001;
        arr = new int[size];
        Arrays.fill(arr,-1);
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */